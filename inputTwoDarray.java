import java.util.Scanner;

public class inputTwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Input element at "+i+" row and "+j+" column.");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to search:");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               
                if(matrix[i][j] == x){
                    System.out.println(x+" is at index "+i+" of row and "+j+" of column.");
                }
            }
        }

    }
}
