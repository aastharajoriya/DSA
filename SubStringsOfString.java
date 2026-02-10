package Strings;

import com.sun.security.jgss.GSSUtil;

public class SubStringsOfString {
    public static void main(String[] args) {
        String s = "gopi";
//        System.out.print(s.substring(0,13));// 1-12 (i,i-1)
        int l = 0;
        int r = s.length();
        for (int i = 0; i <= r; i++) {
//
            for (int j = i; j < r; j++) {
                System.out.print(s.substring(i, j + 1)+" ");

            }
            System.out.println();
        }
    }}
