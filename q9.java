import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // SUm of numbers between 20 and 30 which is divisible by 2 and 3
        int sum=0;
        for (int i = 20; i <=30; i++) {
            if (i%2==0 && i%3==0) {
                sum=sum+i;
            }
        }
        System.out.println("The Sum of numbers between 20 and 30 which are divisble by 2 and 3 is "+sum);
        sc.close();
    }

}
