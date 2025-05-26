using System.Runtime.Intrinsics.X86;

namespace JoJoJoJo
{
    internal class Program
    {
        static async Task Main(string[] args)
        {
            Console.WriteLine("Zero step");
            var list = await GetWords(100, "https://gist.githubusercontent.com/provpup/2fc41686eab7400b796b/raw/b575bd01a58494dfddc1d6429ef0167e709abf9b/hamlet.txt");
            Console.WriteLine("Last step:");
            foreach(var wrod in list)
                Console.WriteLine(wrod);
        }

        static async Task<List<string>> GetWords(int num,string url)
        {
            var client = new HttpClient();
            var body = await client.GetStringAsync(url);
            Console.WriteLine("First step: "+body);
            List<string> words = [];
            List<char> word = [];
            foreach(var a in body.ToCharArray()) {
            char c = char.ToLower(a);
            if(c>='a' && c <= 'z')
                {
                    word.Add(a);
                }
                else if(word.Count > 0)
                {
                    string str = "";
                    foreach(char b in word)
                    {
                        str += b;
                    }
                    words.Add(str);
                    word.Clear();
                }
            }
            Console.WriteLine("Second step: " + words.Count);
            var freqWords = new Dictionary<string, int>(StringComparer.Ordinal);
            var freqTimes = new SortedDictionary<int, List<string>>(Comparer<int>.Create((a, b) => -(a - b)));
            foreach(var str in words)
            {
                bool firstTime = freqWords.TryGetValue(str, out int times);
                freqWords[str] = (firstTime) ? times + 1 : 1;
             }
          
            foreach(var aux in freqWords)
            {
                bool already = freqTimes.TryGetValue(aux.Value, out List<string> l);
                if (already)
                {
                    l.Add(aux.Key);
                }
                else
                {
                    freqTimes[aux.Value] = new List<string>([aux.Key]); 
                }
            }
            Console.WriteLine("Thris step:");
            foreach(var piar in freqTimes)
            {
                Console.WriteLine($"{piar.Key}: ");
                piar.Value.ForEach(a => Console.Write(a+" "));
                Console.WriteLine();
            }

            Console.WriteLine("Five step");
            List<string> ans = [];
            int i = 0;
            foreach (var piar in freqTimes)
            {
                foreach(var s in piar.Value){
                    if (i == num)
                        return ans;
                    ans.Add(s);
                    i++;
                }
            }
            return ans;
        }
    }
}
