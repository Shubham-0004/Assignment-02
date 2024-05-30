
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        //take any integer as input and display it into words.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int original_num;
        original_num=sc.nextInt();
        //count the number of digits of the number 
        int num=original_num;
        int count=0;
        while (num>0) {
            num=num/10;
            count++;
        }

       // System.out.println("The number of digits in the input number is:"+count);
        int divisor=(int)Math.pow(10, count-1);
        //System.out.println("The divisor is:"+divisor);
        //finding individual digits of the number
       // System.out.print("The individual digits of the number is:");
        int individual_digit;
        String in_words;
        while (divisor>0) {
            individual_digit=original_num/divisor;
            original_num=original_num%divisor;
            divisor=divisor/10;
            // System.out.print(individual_digit+" ");
            //display each individual digit in words
            switch (individual_digit) {
                case 0:
                    in_words="Zero";
                    break;
            
                case 1:
                    in_words="One";
                    break;
                case 2:
                    in_words="Two";
                    break;
                case 3:
                    in_words="Three";
                    break;
                case 4:
                    in_words="Four";
                    break;
                case 5:
                    in_words="Five";
                    break;
                case 6:
                    in_words="Six";
                    break;
                case 7:
                    in_words="Seven";
                    break;
                case 8:
                    in_words="Eight";
                    break;
                case 9:
                    in_words="Nine";
                    break;
                default:
                    in_words="Invalid";
                    break;
            }
             System.out.print(in_words+" ");
           
        }
        sc.close();
    }
}
