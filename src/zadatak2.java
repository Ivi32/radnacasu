public class zadatak2 {
    public static void main(String[] args) {
        //Napisati program koji ispisuje sve brojeve deljive sa 3 ili deljive sa 4 od 1 do 100

        for( int i=0; i<100; i++) {
            if (( i % 3 == 0) || (i % 4 == 0))
                System.out.println(i);

        }

    }
}
