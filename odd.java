import java.util.Scanner;

public class odd {
    public static int calcOdd(int n){
        int sum = 0;
        
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        calcOdd(n);
    }
}
