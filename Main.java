import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner principal = new Scanner(System.in);
        Scanner rate = new Scanner(System.in);
        Scanner period = new Scanner(System.in);
        System.out.print("Enter Principal Amount:$ ");
        int principal_amnt = principal.nextInt();
        System.out.print("Enter annual interest rate: ");
        double new_rate = rate.nextDouble();
        System.out.print("Enter Period(Years): ");
        int time = period.nextInt();

        double r = ((double) new_rate / 100) / 12;
        int n = time * 12;
        double new_r = 1 + r;
        double result = Math.pow(new_r, (double) n);
        double neum = r * result;
        double denm = result - 1;
        double mortgage = principal_amnt * (neum / denm);
        String answ = String.format("%.2f", mortgage);


        System.out.println("mortgage is :$ " + answ);
    }
}
