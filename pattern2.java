public class pattern2 {
    public static void main(String[] args){
        
        //butterfly pattern
        // int row=4;

        //upper half
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     for(int j=1;j<=2*(row-i);j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     } 
        //     System.out.println();           
        // }

        //lower half
        // for(int i=row;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     for(int j=1;j<=2*(row-i);j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     } 
        //     System.out.println();           
        // }


        
        
        //rhombus pattern
        // int row=5;

        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=row-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //numeric full pyramid
        // int row=5;

        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=row-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }


        //palendromic pyramid
        // int n=5;
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1; j<=n-i ;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=i;j>=1;j--){
        //         System.out.print(j+" ");
        //     }

        //     for(int j=2;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }



        //diamond pattern
        int n=4;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
