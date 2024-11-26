 public static int binarySearch(int[] array,int target){
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearchCondition(boolean[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right)
        {
            int mid = left + (right-left)/2;
            if(array[mid]==true){
                right=mid;
            }else{
                left = mid+1;
            }
        }
        if(left == array.length-1 && array[left]==false){
            return -1;
        }
        return left;
    }
