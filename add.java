import java.util.Scanner;

public class add {
    public static int calcSum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();

        int sum = calcSum(a, b);
        System.out.println("Sum of a and b is "+sum);
    }
}
