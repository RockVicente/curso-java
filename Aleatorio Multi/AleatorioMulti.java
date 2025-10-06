import java.util.Scanner;

public class AleatorioMulti{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        Integer num = new Integer(input.nextInt());
        if (num %5==0) {
            System.out.println("multiplo de 5");
        }else if (num %2==0) {
            System.out.println("multiplo de 2 ");
        }else{
            System.out.println("nao e multiplo de 5 nem de 2");
        }

    }
}