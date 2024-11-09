class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> answer = Arrays.asList(new ArrayList<>(), new ArrayList<>());
    HashSet<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().toList());
    HashSet<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().toList());
    for(int num : nums1)
    {
        if(!set2.contains(num)){
            answer.get(0).add(num);
            set2.add(num);
        }
    }
    for(int num : nums2)
    {
        if(!set1.contains(num)){
            answer.get(1).add(num);
            set1.add(num);
        }
    }
    return answer;
    }
}
