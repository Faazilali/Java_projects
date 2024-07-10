import java.util.Scanner;

public class power {
    public static int calcPower(int x, int n){
        System.out.println("Final value: "+x**n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        calcPower(x,n);
    }
}
