package Revision;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                arr[i]+=10;
            }else{
                arr[i]*=2;
            }

            }
        System.out.print(Arrays.toString(arr));
        }
    }
