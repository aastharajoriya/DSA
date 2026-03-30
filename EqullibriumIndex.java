package BinarySearch;

public class EqullibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(equllibriumIndex(arr));

    }

    static int equllibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int nums : arr) {
            totalSum += nums;
        }
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum-= arr[i];

            if (left == totalSum) {
                return i;
            }

            left += arr[i];
        }
            return -1;
        }
    }

