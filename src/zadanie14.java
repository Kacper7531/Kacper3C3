import java.util.Scanner;
public class zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double zysk;
        double cena;
        double marza=0.04;
        System.out.println("podaj cenę detliczną: ");
        cena = klawiatura.nextInt();
        klawiatura.nextLine();
        zysk=(cena*marza);
        System.out.println("Zysk: "+zysk);

    }
}