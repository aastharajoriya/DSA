package Strings;

public class CompareTo {
    public static int compareTo(String a, String b){
        int s1=a.length();
        int s2=b.length();
        int minlen=Math.min(s1,s2);

        for(int i=0;i<minlen;i++){
            if (a.charAt(i)!=b.charAt(i)){
                return a.charAt(i)-b.charAt(i);
            }
        }
        return s1-s2;
    }
    //compareTo--> compare two  string lexographically-> dictionary order follow here
    public static void main(String[] args) {


        String s1 = "aastha";// string compare ascii value
        String s2 = "aastha";
        System.out.println(compareTo(s1,s2));
        System.out.println(s1.concat(s2));
    }
}
