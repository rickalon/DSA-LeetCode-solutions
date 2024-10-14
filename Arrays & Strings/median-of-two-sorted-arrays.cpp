class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
    int sizeFirst = (int)nums1.size();
    int sizeSecond = (int)nums2.size();
    int size = sizeFirst + sizeSecond;
    bool odd = false;
    int first=-1,second=-1;
    if(size%2==0){
        odd = true;
        second = size / 2;
        first = second -1;
    }else{
        first = size/2;
    }
    int i = 0;
    int indexFirst = 0;
    int indexSecond = 0;
    int valAux = -1;
    while(i < size){
        int val = 0;
        if(indexFirst >= sizeFirst){
            val = nums2[indexSecond];
            indexSecond++;
        }else if(indexSecond >= sizeSecond){
            val = nums1[indexFirst];
            indexFirst++;
        }else{
            if(nums1[indexFirst] < nums2[indexSecond]){
                val = nums1[indexFirst];
                indexFirst++;
            }else{
                val = nums2[indexSecond];
                indexSecond++;
            }
        }
        if(odd){
            if(i==first){
                valAux = val;
            }else if(i==second){
                return (valAux + val) / 2.0;
            }
        }else if(!odd && i==first){
           return val;
        }
        i++;
    }
    return -1.0;
    }
};
