//package Assignment2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //check whether input character is a vowel or consonant
        System.out.println("Enter any character:");
        char  ch;
        ch=sc.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("Given input is a vowel.");
        }
        else{
            System.out.println("Given input is a consonant.");
        }
        sc.close();
    }
    
}
