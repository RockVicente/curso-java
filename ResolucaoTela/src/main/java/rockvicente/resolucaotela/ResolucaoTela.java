
package rockvicente.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit toll = Toolkit.getDefaultToolkit();
        Dimension larg = toll.getScreenSize();
        System.out.println("A resolucao da tela e " + larg.width + " x " + larg.height);
    }
}
