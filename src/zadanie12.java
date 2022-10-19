import java.util.Scanner;
public class zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double ciastko;
        double kaloria=300;
        double porcja=4;
        double zjedzone;
        double wynik;
        ciastko=(kaloria/porcja);
        System.out.println("Ile zjadłeś ciastek: ");
        zjedzone = klawiatura.nextInt();
        klawiatura.nextLine();
        wynik=zjedzone*ciastko;
        System.out.println("Zjadłeś "+wynik+" kalorii");

    }
}