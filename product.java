import java.util.Scanner;

public class product {
    public static int calcProd(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = obj.nextInt();
        System.out.println("Enter value of b: ");
        int b = obj.nextInt();

        int mult = calcProd(a, b);
        System.out.println("Product of two numbers a and b is "+mult);
    }
}
