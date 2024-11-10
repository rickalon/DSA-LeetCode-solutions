class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer,Integer> hm = new HashMap<>();
    HashSet<Integer> hs = new HashSet<>();
    for(int num : arr)
    {
        hm.put(num,hm.getOrDefault(num,0)+1);
    }
    for(int num : hm.values())
    {
        if(!hs.contains(num))
        {
            hs.add(num);
        }else{
            return false;
        }
    }
    return true;
    }
}
