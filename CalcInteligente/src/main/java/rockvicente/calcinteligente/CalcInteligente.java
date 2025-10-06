
package rockvicente.calcinteligente;

import java.util.Scanner;

/**
 *
 * @author ROCK VICENTE
 */
public class CalcInteligente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        Integer num = (int) teclado.nextInt();
        System.out.format("o numero digitado e %.f",num);
    }
  
}
