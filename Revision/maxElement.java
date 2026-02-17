package Revision;

public class maxElement {
    public static void main(String[] args) {
        int[]arr={6,9,4,78,87,99,45};
        int ans=max(arr);
        System.out.println(ans);
    }
    static int max(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }return max;
    }
}
