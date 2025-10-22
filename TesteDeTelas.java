import javax.swing.JOptionPane;
public class TesteDeTelas {
    public static void main(String[] args) {
        int n,s=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>digite um numero:<br>o valor 0 interrompe</html>"));
            s +=n;
        }while(n !=0);
        JOptionPane.showMessageDialog(null, "O somatorio dos valores e " + s);
    }
}
