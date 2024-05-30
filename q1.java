import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //take three integers as user input and find the largest among them
    System.out.println("Enter any three integers:");
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if (a>b) {
        if (a>c) {
            System.out.println(a +" is the greatest among all the three numbers.");
        }
        else{
            System.out.println(c+" is the greatest number among all the three numbers.");
        }
    }
    else{
        if (b>c) {
            System.out.println(b+" is the largest number among all the three numbers.");
        }
        else{
            System.out.println(c+" is the largest number among all the three numbers.");
        }
    }
    sc.close();
    }
}
