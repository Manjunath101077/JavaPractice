package org.example.Coding;

public class ReverseString {
    public static void reverseString(String rev){
        String revAfterString="";
        for(int i=rev.length()-1;i>=0;i--){
            revAfterString+=rev.charAt(i);
        }
        System.out.println(revAfterString);
    }
    public static void reverseStringUsingBuffer(String rev){
        StringBuffer stringBuffer=new StringBuffer(rev);
        System.out.println(stringBuffer.reverse());
    }
    public static String reverseTringUsingRecusrive(String rev){
        if(rev==null ||  rev.length()<=2){
        return rev;
        }
        return reverseTringUsingRecusrive(rev.substring(1))+rev.charAt(0);
    }
}
