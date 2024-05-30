

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Sum of individual digits of a number
        System.out.print("Enter any integer:");
        int num;
        num=sc.nextInt();
        int sum=0;
        int last_digit;
        while (num>0) {
            last_digit=num%10;
            sum=sum+last_digit;
            num=num/10; 
        }
        System.out.println("The sum of all the individual digits of the user input integer is: "+sum);
        sc.close();
    }
}
