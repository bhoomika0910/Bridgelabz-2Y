package assign.practice;


import java.util.Arrays;
import java.util.*;



public class Sorting {
    public static void main(String[] args) {
        Integer[] arr= {1,2,3,4,5,8,6,3,27,86,78};
    
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }

}
