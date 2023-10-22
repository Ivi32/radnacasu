public class zadatak1 {
    public static void main(String[] args) {
        // Napisati program koji ispisuje sve parne brojeve od 1 do 100

        for ( int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
