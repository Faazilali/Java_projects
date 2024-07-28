import java.util.Scanner;

public class firstOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void find(String str, int i,char element){
        if(i==str.length()){
            System.out.println("First index: "+first);
            System.out.println("Last index: "+last);
            return;
        }

        char currChar = str.charAt(i);
        if(currChar == element){
            if(first == -1){
                first = i;
            }
            else{
                last = i;
            }
        }
        find(str,i+1,element);
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string:");
       String str = sc.nextLine();
       
       find(str,0,'a');
    }
}
