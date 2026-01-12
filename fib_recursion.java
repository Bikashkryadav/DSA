import java.util.Scanner;

public class fib_recursion {
    static int count = 1;
    static void fibonacci(int end , int prev1 , int prev2){
        if(count <= end){
            int fib;
            fib = prev1 + prev2;
            System.out.println(fib);
            prev1 = prev2;
            prev2 = fib;
            count +=1;
            fibonacci(end, prev1, prev2);
        }
        else {
            return;
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int end = input.nextInt();
        System.out.println(0);
        System.out.println(1);
        fibonacci(end ,0,1);
        input.close();
    }
}
