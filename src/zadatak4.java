import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        // Napisati program koji za uneti ceo broj n racuna proizvod svih brojeva od 1...n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int proizvod = 1;
        for(int i = 1; i <= n; i++) {
            proizvod *= i;
        }
            System.out.println(proizvod);

    }
}
