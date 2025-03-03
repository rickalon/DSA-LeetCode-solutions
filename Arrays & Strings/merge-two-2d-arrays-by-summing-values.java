//import java.util.*;
class Solution {
    private int max = 1001;
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
    LinkedList<int[]> list = new LinkedList<>();
    int i1 = 0, i2 = 0;
    int n1 = nums1.length, n2 = nums2.length;
    int i = 0;
    while(i1<n1 || i2<n2){
        int id1 = max,id2=max;
        int val1 = 0,val2=0;
        if(i1<n1){
            id1=nums1[i1][0];
            val1=nums1[i1][1];
        }
        if(i2<n2){
            id2=nums2[i2][0];
            val2=nums2[i2][1];
        }
        if(id1<id2){
                list.add(new int[]{id1,val1});
                i1++;
        }else if(id1>id2){
                list.add(new int[]{id2,val2});
                i2++;
        }else{
                list.add(new int[]{id1,val2+val1});
                i2++;i1++;
        }
        i++;
    }
    int[][] ans = list.toArray(new int[0][2]);
    return ans;
    // Map<Integer,Integer> map = new HashMap<>();
    // Set<Integer> q = new TreeSet<>();
    // int n = nums1.length;
    // int m = nums2.length;
    // int i = 0;
    // while(i < n || i < m){
    //     if(i < n){
    //         int id1 = nums1[i][0];
    //         q.add(id1);
    //         int val1 = nums1[i][1];
    //         map.put(id1,map.getOrDefault(id1,0)+val1);
    //     }
    //     if(i < m){
    //         int id2 = nums2[i][0];
    //         q.add(id2);
    //         int val2 = nums2[i][1];
    //         map.put(id2,map.getOrDefault(id2,0)+val2);
    //     }
    // i++;
    // }
    // int[][] ans = new int[map.size()][2];
    // i = 0;
    // for(int key : q){
    //     ans[i][0]=key;
    //     ans[i][1]=map.get(key);
    //     i++; 
    // }
    // return ans;
    }
}
