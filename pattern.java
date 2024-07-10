import java.util.Scanner;
public class pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();
        System.out.println();

        //rectangle pattern 
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        //hollow rectangle pattern
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r  || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        //pyramid pattern
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //reverse pyramid pattern
        // for(int i=r;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //inverted pyramid pattern
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=r-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        //numeric pyramid pattern
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        
        //reversed numeric pyramid pattern
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=r-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //floyd's triangle pattern

        // int num = 1;
        
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }


        //0-1 triangle pattern
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if( (i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
