class Solution {
    public int lenLongestFibSubseq(int[] arr) {
    Set<Integer> set = new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    int res = 2;
    int n = arr.length;
    for(int i = 0 ; i < n ; i++){
        for(int j = i +1; j < n ; j++){
            int a = arr[i],b=arr[j],l=2;
            while(set.contains(a+b)){
                b = a + b;
                a = b - a;
                l++;
            }
            res = Math.max(l,res);
        }
    }
    return res > 2 ? res : 0;
    }
}
