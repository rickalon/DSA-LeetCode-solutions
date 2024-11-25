
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        LocalTime now = LocalTime.now();
        int[] array = {10,2,13,20,1};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
        System.out.printf("Times to complete: %d ms.",ChronoUnit.MILLIS.between(now, LocalTime.now()));
    }


    public static void mergeSort(int[] array){
        if(array.length>1){
              int mid = array.length / 2;
              int[] left = Arrays.copyOfRange(array, 0, mid);
              int[] right = Arrays.copyOfRange(array, mid, array.length);
              
              mergeSort(left);
              mergeSort(right);
              
              merge(left,right,array);
        }
    }


    public static void merge(int[] left,int[] right, int[] array){
        int l = array.length;
        int it1 = 0;
        int it2 = 0;
        for(int i=0;i<l;i++){
            if(it1 == left.length){
                array[i]=right[it2++];
            }else if(it2==right.length){
                array[i]=left[it1++];
            }else{
            if(left[it1] < right[it2]){
                array[i]=left[it1++];
            }else{
                array[i]=right[it2++];
            }
          }
        }
    }
}
