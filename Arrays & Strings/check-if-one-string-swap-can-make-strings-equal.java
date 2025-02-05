class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
    int count = 0;
    int[] index = new int[2];
    for(int i = 0 ; i < s1.length() ; i++)
        if(s1.charAt(i)!=s2.charAt(i)){
            if(count==2)
                return false;
            index[count]=i;
            count++;
    }
    if(count!=0 && count!=2)
        return false;
    if(count==0)
        return true;
    return (s1.charAt(index[0])==s2.charAt(index[1]) && s1.charAt(index[1])==s2.charAt(index[0]))?true:false;
    }
}
