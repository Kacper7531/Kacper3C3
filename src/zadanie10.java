import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {
    Scanner klawiatura = new Scanner(System.in);

    double wartosc;
    double stanowy;
    double lokalny;
    double suma;
    System.out.println("Wprowadź wartość produktu: ");
    wartosc = klawiatura.nextInt();
    klawiatura.nextLine();
    stanowy=(wartosc*0.04);
    lokalny=(wartosc*0.02);
    suma=(wartosc+stanowy+lokalny);
        System.out.println("Wartość produktu: "+wartosc);
        System.out.println("podatek stanowy: "+stanowy);
        System.out.println("podatek loklany: "+lokalny);
        System.out.println("Łączna cena sprzedaży: = "+suma);
    }
}
