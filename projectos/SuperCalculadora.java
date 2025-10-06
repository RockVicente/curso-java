import java.util.Scanner;
public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =0;

        //Introduzindo o numero apartir do teclado
        System.out.println("Informe o valor");
        num=in.nextInt();

        //Comecando comas operacoes
        System.out.println("Elevado ao cubo " + Math.pow(num,3));
        System.out.println("Raiz Quadrada " + Math.sqrt(num));
        System.out.println("Raiz Cubica " + Math.cbrt(num));
        System.out.println("Valor absoluto " + Math.abs(num));

    }
}
