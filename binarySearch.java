package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[]arr={4,5,6,9,12,15,21};
        int target=9;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static  int search(int[]arr,int target){
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }return -1;
    }
}
