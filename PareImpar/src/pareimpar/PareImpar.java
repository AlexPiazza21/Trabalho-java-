package pareimpar;

public class PareImpar {

    public static void main(String[] args) {

        int soma = 0;
        int mult = 0;

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                mult = mult * i;
            } else {
                soma = soma + i;
            }
            System.out.println("Multiplicação dos pares:" + mult + "\n");
            System.out.println("Soma dos impares:" + soma + "\n");

        }





    }
}