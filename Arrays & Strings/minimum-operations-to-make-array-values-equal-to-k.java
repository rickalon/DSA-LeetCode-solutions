class Solution {
    public int minOperations(int[] nums, int k) {
    int arr[] = new int[101];
    int n = 0;
    int h = 0;
    for(int num : nums){
        if(num > k){
            arr[num]++;
            n++;
            if(arr[num]==1){
                h++;
            }
        }else if(num==k){
            n++;
        }
    }
    return (n==nums.length)?h:-1;
    }
}
