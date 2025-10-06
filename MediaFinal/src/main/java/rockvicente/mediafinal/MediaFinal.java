
package rockvicente.mediafinal;

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1=0,n2=0,nt=0;
        double media=0;
        
        System.out.println("Digita a nota do primeiro teste");
        n1=in.nextDouble();
        System.out.println("Digita a nota do segundo teste");
        n2=in.nextDouble();
        System.out.println("Digita a nota do trabalho");
        nt=in.nextDouble();
         
       media=(n1*0.4) + (n2*0.4) + (nt*0.2);
        System.out.println("a sua media e " + media);
       
    }
    
}
