package org.example;

import org.example.Coding.ReverseString;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String revString=sc.nextLine();
        ReverseString reverseString=new ReverseString();
                reverseString.reverseString(revString);
                reverseString.reverseStringUsingBuffer(revString);
                System.out.println(reverseString.reverseTringUsingRecusrive(revString));
          }
}