/*
Find the median of two sorted arrays.

eg.
arr1 = [1, 3, 5]
arr2 = [2, 4, 6]

median(arr1, arr2) = 3.5
*/
import java.util.Arrays;
class Median {

    public double median(int[] sorted) {

        double median = 0;

        for(int i = 0; i < sorted.length; i++) {
            median += sorted[i]; //add all elements of sorted array
        }
        median = median/sorted.length; //divide added elements by length of sorted array

        return median;
    }

    public int[] sort(int[] arr1, int[] arr2) {
        int[] sorted = new int[arr1.length + arr2.length]; //create new array size of arr1 and arr2 combined
        for(int i = 0; i < sorted.length; i++) {
            if(i < arr1.length) {
                sorted[i] = arr1[i]; //fill new array with arr1 values
            } else {
                sorted[i] = arr2[i-3]; //fill new array with arr2 values
            }
        }
        
        //sort new array
        Arrays.sort(sorted);
        return sorted;
    }

    public static void main(String[] args) {
        Median m = new Median();
        //intialize arrays
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] sorted = m.sort(arr1, arr2);
        System.out.println(m.median(sorted));
    }
}