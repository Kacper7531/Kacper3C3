import java.util.Scanner;
public class zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double test1;
        double test2;
        double test3;
        double sre;
        double srednia;
        System.out.println("Podaj wynik z pierwszego testu:: ");
        test1 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj wynik z drugiego testu:: ");
        test2 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj wynik z trzeciego testu:: ");
        test3 = klawiatura.nextInt();
        klawiatura.nextLine();
        sre=(test1+test2+test3);
        srednia=sre/3;
        System.out.println("Wynik z peirwszego testu "+test1);
        System.out.println("Wynik z drugiego testu "+test2);
        System.out.println("Wynik z trzeciego testu "+test3);
        System.out.println("Średnia: "+srednia);
    }
}