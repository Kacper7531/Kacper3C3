public class zadanie6 {
    public static void main(String[] args) {
        int pokoj1;
        int pokoj2;
        int pokoj3;
        int pokoj4;
        int wymiar1pokoj1 = 3;
        int wymiar2pokoj1 = 4;
        int wymiar1pokoj2 = 3;
        int wymiar2pokoj2 = 4;
        int wymiar1pokoj3 = 2;
        int wymiar2pokoj3 = 3;
        int wymiar1pokoj4 = 2;
        int wymiar2pokoj4 = 2;
        int mieszkanie;
        pokoj1=(wymiar1pokoj1 * wymiar2pokoj1);
        pokoj2=(wymiar1pokoj2 + wymiar2pokoj2);
        pokoj3=(wymiar1pokoj3 + wymiar2pokoj3);
        pokoj4=(wymiar1pokoj4 + wymiar2pokoj4);
        System.out.println("pokój1= "+ pokoj1 );
        System.out.println("pokój2= "+ pokoj2 );
        System.out.println("pokój3= "+ pokoj3 );
        System.out.println("pokój4= "+ pokoj4 );
        mieszkanie=(pokoj1+pokoj2+pokoj3+pokoj4);
        System.out.println("Mieszkanie= "+mieszkanie);
        int osoba = 4;
        double naosobe;
        naosobe= (double)mieszkanie/osoba;
        System.out.println("Powierzchnia na 1 osobe= "+naosobe);
    }
}
