import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Generate all the prime numbers between 1 and n
        System.out.print("Enter the range from 1 to __ to find all the prime numbers between them-->");
        int n;
        n=sc.nextInt();
        int div=2;
        for (int i = 1; i <=n; i++) {
            int count=0;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    count++;
                    break;
                }
            }
            if (count==0 && i!=1) {
               System.out.print(i+" "); 
            }
        }

        sc.close();
    }
}
