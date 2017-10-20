package maiornumero;

import java.util.*;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Informe os valor de X e Y");

        int x = user.nextInt();
        int y = user.nextInt();

        if (x > y) {
            System.out.println("o resultado é :" + x);
        } else {
            System.out.println("o resultado é :" + y);
        }

    }
}
