import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // compute x raised to y without using the Math.h
        System.out.print("Enter the base number-->");
        int x;
        x=sc.nextInt();
        System.out.print("Enter the exponent number-->");
        int y;
        y=sc.nextInt();
        int product=1;
        for (int i = 1; i <= y; i++) {
            product=product*x;
        }
        System.out.println("Result of "+x+" raised to the number "+y+" is "+ product);
        sc.close();
    }
}
