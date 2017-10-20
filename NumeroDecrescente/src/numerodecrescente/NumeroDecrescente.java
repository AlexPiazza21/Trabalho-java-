package numerodecrescente;

import java.util.Scanner;

public class NumeroDecrescente {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero");

        int numero = ler.nextInt();
        
        while (numero != 0) {
            numero --;
            System.out.println(numero);

        }

    }
}
