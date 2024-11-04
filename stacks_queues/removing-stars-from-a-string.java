class Solution {
    public String removeStars(String s) {
    Stack<Character> stackChars = new Stack<>();
    for(char c : s.toCharArray())
    {
        if(c == '*')
        {
            stackChars.pop();
        }else
        {
            stackChars.push(c);
        }
    }
    StringBuilder str = new StringBuilder();
    stackChars.stream().forEach((c)->str.append(c));
    return str.toString();  
    }
}
