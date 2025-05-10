class Solution:
    def minSum(self, nums1: List[int], nums2: List[int]) -> int:
        sum1, zeros1 = sum(nums1),nums1.count(0)
        sum2, zeros2 = sum(nums2),nums2.count(0)
        
        t1 = zeros1 + sum1
        t2 = zeros2 + sum2
        
        if (t1 < t2 and zeros1 == 0) or (t1 > t2 and zeros2 == 0):
            return -1
        return max(t1,t2)
