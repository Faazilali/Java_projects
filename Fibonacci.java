import java.util.Scanner;

public class Fibonacci {
    public static void printFib(int a, int b, int n){

        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+", ");
        printFib(b,c,n-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print(a+", ");
        System.out.print(b+", ");
        printFib(a,b,n-2);
        
    }
}
