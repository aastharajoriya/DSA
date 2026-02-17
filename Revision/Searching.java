package Revision;

public class Searching {
    public static void main(String[] args) {
        int []arr={2,89,56,97,3,65,34};
        int target=5;
        find(arr,target);
    }
   static void find(int[] arr, int target){
        boolean flag=false;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                flag = true;
                index = i;
                break;
            }

            }if(flag ==true){
                System.out.println("item found at index " +index);
        }else{
           System.out.println("not found or item does not exist ");
       }
   }
}
