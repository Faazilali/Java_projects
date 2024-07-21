import java.util.Scanner;

public class Sum {

    public static void add(int i, int n,int sum){
        if(n==i){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        add(i+1,n,sum);
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n = sc.nextInt();
       add(1,n,0);

   } 
}
