package Revision;

public class productOfArray {
    public static void main(String[] args) {
        int []arr={2,5,8};
        int product=1;

        for(int i=0;i<arr.length;i++){
            product*=arr[i];

        }
        System.out.print(product);
    }
}
