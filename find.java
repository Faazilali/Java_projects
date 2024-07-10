import java.util.Scanner;

public class find{
    public static void main(String args[]){
        System.out.println("Input the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] input = new int[size];

        for(int i=1;i<=size;i++){
            System.out.println("Enter the "+i+" element of array: ");
            input[i] = sc.nextInt();
        }

        

        System.out.println("Enter the number to search:");
        int x = sc.nextInt();

        for(int i=1;i<=size;i++){
            if(input[i] == x){
                System.out.println(input[i]+" is found at index "+i);
            }
            else{
                System.out.println("No such input from user.");
            }
        }

    }
}