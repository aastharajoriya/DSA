package questions;

public class nonDecreasingArray {

    public static void main(String[] args) {
        int []arr={8,7,3};//4 2 3
        System.out.println(checkPossibility(arr));
    }
    static boolean checkPossibility(int[]nums){
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count++;
            }if (count>1)return false;
            if(i<2||nums[i]>=nums[i-2]){
                //previous
                nums[i-1]=nums[i];
            }else
            {
                nums[i]=nums[i-1];
            }
        }

        return true;
    }

}
