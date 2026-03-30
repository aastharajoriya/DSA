package BinarySearch;

public class missingPositiveInteger {
    public static void main(String[] args) {
        int []arr={1,2,0};
        System.out.println(find(arr));
    }
    static int find(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1]!=arr[i]){
                int correctIndex=arr[i]-1;

                //swap
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }return n+1;
    }
}
