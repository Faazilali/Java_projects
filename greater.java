import java.util.Scanner;

public class greater {
    public static int calcGreater(int a, int b){

        if(a>b){
            System.out.println(a+" is greater number.");
        }
        else{
            System.out.println(b+" is greater number."); 
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        
        calcGreater(a,b);
    }
}
