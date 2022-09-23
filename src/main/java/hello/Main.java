package hello;

public class Main {
    public static void main(String args[]) {
        iniciar(8, 12, 1);
    }
        
    public static int iniciar (int a, int b, int n) {
        int dividendo, c;
        int divisor = 1;

        // Scanner in = new Scanner (System.in);
        // n = in.nextInt();

        for (int i = 0; i < n; i++) {

            if (b > a) {
                dividendo = b;
                divisor = a;
            } else {
                dividendo = a;
                divisor = b;
            }

            while (dividendo % divisor != 0) {
                c = dividendo % divisor;
                dividendo = divisor;
                divisor = c;
            }
            System.out.println(divisor);

        }		
        return divisor;
    }
}

