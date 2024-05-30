import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //check whether it is a leap year or not
        System.out.println("Enter any year:");
        int year;
        year=sc.nextInt();
        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println("Input year is a leap year.");
        }
        else{
            System.out.println("Input year is not a leap year.");
        }
        sc.close();
    }
}
