import java.util.Scanner;

public class Nth_fib_recursion {
    static int fibonacci(int num){
        if (num <= 1){
            return num;
        }else{
            return fibonacci(num -1) + fibonacci(num -2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int num = input.nextInt();
        System.out.println(fibonacci(num));
    }
}
