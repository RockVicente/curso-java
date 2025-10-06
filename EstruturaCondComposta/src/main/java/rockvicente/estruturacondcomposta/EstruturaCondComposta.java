package rockvicente.estruturacondcomposta;

import java.util.Scanner;
import java.time.Year;

public class EstruturaCondComposta {

    public static void main(String[] args) {
        Year year = Year.now();
        int anoAtual = year.getValue();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o ano de nascimeto: ");
        long nasc = input.nextLong();
        
        long idade = anoAtual - nasc;
        
        System.out.println("Voce tem "+ idade);
        
        if(idade >= 18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
            
        
    }
}
