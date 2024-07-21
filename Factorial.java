import java.util.Scanner;

public class Factorial {
    public static int calcFac(int n){

        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*calcFac(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        int result = calcFac(n);
        System.out.println("Factorial of "+n+" is "+result);
    }
}
