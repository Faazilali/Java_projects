import java.util.Scanner;

public class TowerOfHanoi {
    public static void func(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        func(n-1,src,dest,helper);
        System.out.println("Transfer disk"+n+" from "+src+" to "+dest);
        func(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        System.out.println("Enter number of disk:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n,"First tower","Second tower","Third tower");
    }
}
