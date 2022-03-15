import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner pobieranie = new Scanner(System.in);
        int n;
        double a,b,w;
        System.out.println("Jakie działanie chcesz wykonać?");
        System.out.println("suma-->1, różnica-->2, iloczyn-->3, iloraz-->4");
        n=pobieranie.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("Wybrame działanie to suma:");
                System.out.println("Podaj 1 liczbę: ");
                a = pobieranie.nextDouble();
                System.out.println("Podaj 2 liczbę: ");
                b = pobieranie.nextDouble();
                w = a + b;
                System.out.println("Suma wynosi:" + w);
            }
            case 2 -> {
                System.out.println("Wybrame działanie to różnica:");
                System.out.println("Podaj 1 liczbę: ");
                a = pobieranie.nextDouble();
                System.out.println("Podaj 2 liczbę: ");
                b = pobieranie.nextDouble();
                w = a - b;
                System.out.println("Różnica wynosi:" + w);
            }
            case 3 -> {
                System.out.println("Wybrame działanie to iloczyn:");
                System.out.println("Podaj 1 liczbę: ");
                a = pobieranie.nextDouble();
                System.out.println("Podaj 2 liczbę: ");
                b = pobieranie.nextDouble();
                w = a * b;
                System.out.println("Iloczyn wynosi:" + w);
            }
            case 4 -> {
                System.out.println("Wybrame działanie to iloraz:");
                System.out.println("Podaj 1 liczbę: ");
                a = pobieranie.nextDouble();
                System.out.println("Podaj 2 liczbę: ");
                b = pobieranie.nextDouble();
                if (b != 0) {
                    w = a / b;
                    System.out.println("Iloraz wynosi:" + w);
                } else
                    System.out.println("Nie można dzielić przez 0");
            }
            default -> System.out.println("Nie ma takiego działania");
        }
    }
}