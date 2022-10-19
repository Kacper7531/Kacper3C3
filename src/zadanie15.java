import java.util.Scanner;
public class zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String miasto;
        System.out.println("Podaj ulubione miasto: ");
        miasto = klawiatura.nextLine();
        klawiatura.nextLine();
        String male, duze;
        int dlugosc=miasto.length();
        System.out.println(dlugosc);
        male = miasto.toLowerCase();
        duze = miasto.toUpperCase();
        char lel = miasto.charAt(0);
        System.out.println(duze+ ", " +male+ ','+lel);
    }
}