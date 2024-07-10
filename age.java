import java.util.Scanner;

public class age {
    public static int canVote(int age){
        if(age<18){
            System.out.println("Not eligible for voting.");
        }
        else{
            System.out.println("Eligible for voting.");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        canVote(age);
    }
}
