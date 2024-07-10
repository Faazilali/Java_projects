import java.util.Scanner;

public class circumference {
    public static double calcCirc(double  r){
        return 2*3.14*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        double r = sc.nextInt();

        double result = calcCirc(r);
        System.out.println("Circumference of circle is "+result);
    }
}
