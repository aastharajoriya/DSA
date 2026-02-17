package Revision;

public class ReplaceFiveWithZeros {
    public static void main(String[] args) {
        int n=155755;
        int ans=fun(n);
        System.out.println(ans);
    }
    static  int fun(int num){
        if(num==0)
            return 5;
        int place=1;
        int newNum=0;
        while(num>0){
            int digit=num%10;
            if(digit==5){
                digit=0;
            }
            newNum+=digit*place;
            place*=10;
            num/=10;

        }
        return newNum;
    }
}
