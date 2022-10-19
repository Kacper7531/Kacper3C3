import java.util.Scanner;
public class zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double kilometrynalitrze;
        double przejechanekilometry;
        double litrypaliwa;
        System.out.println("przejechane kilometry: ");
        przejechanekilometry = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("litry paliwa ");
        litrypaliwa = klawiatura.nextInt();
        klawiatura.nextLine();
        kilometrynalitrze = przejechanekilometry/litrypaliwa;
        System.out.println("Kilometry na litrze "+kilometrynalitrze);

    }
}
