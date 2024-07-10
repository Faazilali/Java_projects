import java.util.Scanner;

public class factorial {
    public static void calcFac(int num){

        if(num<0){
            System.out.println("Enter positive integer");
            return;
        }
        int factorial = 1;
        for(int i=num;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        calcFac(num);
    }
}
