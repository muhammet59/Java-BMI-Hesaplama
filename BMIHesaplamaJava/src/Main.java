import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy;
        double kilo;
        double bmi;

        Scanner s = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz...");
        boy = s.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        kilo = s.nextDouble();
        bmi = kilo / (boy*boy);
        System.out.println("Vucut kitle endeksiniz= "+bmi);
    }
}


