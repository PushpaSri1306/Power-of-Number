import java.util.*;;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int a = sc.nextInt();
        System.out.println("enter exponent");
        int b = sc.nextInt();
        double r = Math.pow(a, b);
        System.out.println(r);
        sc.close();
    }
}
