import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Podaj swoja liczbe: ");
        Scanner l = new Scanner(System.in);
        double liczba = 0;

        while (true) {
            try {
                liczba = l.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj prwidlowa liczbe");
                l.next();
            }
        }

        if (liczba < 0) {
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy liczby rzeczywistej nie istnieje"+ liczba));
        }

        System.out.print(String.format("Pierwieastek z: "+ liczba+" Wynosi: "+ Math.sqrt(liczba)));
    }
}