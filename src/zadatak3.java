import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        /* Napisati program koji za uneti ceo broj n ispisuje brojeve:
        *   a) [1, n]
        *   b) [-14, 2n]
        *   c) [n, -n]
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=1; i <= n; i ++){
            System.out.print (i + " ");
        }
        System.out.println();
        System.out.println( "b)");

        for( int i = -14; i <= 2*n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("c)");

        for(int i = n; i>= -n; i--){
            System.out.print(i + " ");
        }

    }
}
