import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // GCD of two given numbers
        System.out.println("Enter any two number:");
        int x,y;
        int gcd=1;
        x=sc.nextInt();
        y=sc.nextInt();
        for (int i = 1; i <= x && i<=y; i++) {
            if (x%i==0 && y%i==0) {
                gcd=i;
            }
        }
      System.out.println("GCD of "+x+" & "+y+" is "+gcd);
        sc.close();
    }
}
