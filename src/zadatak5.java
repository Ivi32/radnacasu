import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        //Napisati program koji zahteva od korisnika da unese pozitivan ceo broj n ispisuje poruku "Punoletan" ili "Maloletan".
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Unesite pozitivan broj.");
            n= sc.nextInt();
        } while( n <= 0);

        if(n >= 18)
            System.out.println("Punoletan.");
        else {
            System.out.println("Maloletan.");
        }

    }
}
