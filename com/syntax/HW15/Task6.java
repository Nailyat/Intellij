package com.syntax.HW15;

public class Task6 {
    public static void main(String[] args) {

        // How would you swap 2 strings without a temporary variable?

        String str="String one";
        String str2="String two";

        str=str+str2; //String oneString two
        str2=str.substring(0,str.length()-str2.length());
        str=str.substring(str2.length());
        System.out.println(str);
        System.out.println(str2);



    }
}
