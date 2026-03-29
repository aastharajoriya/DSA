package BinarySearch;

public class firstOccurance {
    public static void main(String[] args) {
int[]arr={1,1,1,2,2,3,4,5,5,5,6,6,7,8};
int target=2;
int ans=search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int l = 0, h = arr.length - 1, idx = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == target) {
                idx = mid;
                h = mid - 1;

            } else if (arr[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return idx;
    }
    }

