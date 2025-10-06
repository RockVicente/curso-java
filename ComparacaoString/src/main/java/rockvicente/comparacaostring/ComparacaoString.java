
package rockvicente.comparacaostring;

/**
 *
 * @author LENOVO
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Rock";
        String nome2 = "Rock";
        String nome3 = new String("Rock");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}
