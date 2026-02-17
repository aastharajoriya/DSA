package Revision;

public class secondMax {
    public static void main(String[] args) {
        int[] arr = {6, 9, 4, 78, 87, 99, 45};
        int ans = Secmax(arr);
        System.out.println(ans);
    }

    static int Secmax(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int Secmax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > Secmax && arr[i] != max) {
                Secmax = arr[i];
            }}
                return Secmax;
            }
        }


