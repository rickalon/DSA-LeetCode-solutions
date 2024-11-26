 public static void main(String[] args){
        long start = System.currentTimeMillis();
        int[] array = {10,2,13,20,1};
        quickSort(array);
        System.out.println(Arrays.toString(array));
        System.out.printf("Times to complete: %d ms.",System.currentTimeMillis()-start);
    }
    public static void quickSort(int[] array){
        quickSortCore(array,0,array.length-1);
    }
    public static void quickSortCore(int[] array,int left,int right){
        if(left < right){
        //right element pivot
        int mid = LomutoPartition(array,right,left,right);
        quickSortCore(array,left,mid-1);
        quickSortCore(array,mid+1,right);
        }
    }
    
    public static int LomutoPartition(int[] array,int pivot,int left,int right){
        int low = left-1;
        for(int i = left;i<=right;i++){
            if(array[i] < array[pivot]){
                low++;
                int aux = array[i];
                array[i] = array[low];
                array[low] = aux;
            }
        }
    int aux = array[low+1];
    array[low+1] = array[pivot];
    array[pivot] = aux;
    return low+1;
    }

 public static int HoarePartition(int[] array,int left,int right){
        int pivot = right;
        int i = left-1;
        int j = right+1;
        while(true)        
        {
            do { 
                i++;
            } while (array[i] < array[pivot]);

            do { 
                j--;
            } while (array[j] > array[pivot]);
            if(i >= j){
                System.out.println(i+","+j);
                return j;
            }
            swap(i,j,array);
        }
    }

    public static void swap(int i,int j,int ...array){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
