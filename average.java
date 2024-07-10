import java.util.Scanner;

public class average {
    public static int calcAvg(int a, int b,int c){
       return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int result = calcAvg(a, b, c);
        System.out.println("Average of three numbers is "+result);
    }
}
