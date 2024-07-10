import java.util.Scanner;

public class input {
    public static int check(int n){
            
            if(n>0){
                System.out.println("Number is positive.");
            }
            else if(n==0){
                System.out.println("Number is zero.");
            }
            else{
                System.out.println("Number is negative.");
            }
        return 0;
        }
        

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();


            check(n);

            
    }
}
