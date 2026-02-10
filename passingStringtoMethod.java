package Strings;

public class passingStringtoMethod {
    public static void channge(String x){
        x="aastha";
    }

    public static void main(String[] args) {
        String x="nisha";
        System.out.println(x);
        channge(x);
        System.out.println(x);
    }
    
}
