import java.util.Scanner;

public class fib_for_loop {
    public static void main(String[] args) {
        //finding fibonacci number using for loop
        int prev2=0,prev1=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number that much you want to print:-");
        int end = input.nextInt();
        System.out.print(prev2+" ");
        System.out.print(prev1+" ");
        for (int num=0; num<=end; num++) {
            int fib = prev1+prev2;
            if (fib>=end) {
                break;
            }
            System.out.print(fib+" ");
            prev2 = prev1;
            prev1 = fib;
            
        }
        input.close();
    }
}
