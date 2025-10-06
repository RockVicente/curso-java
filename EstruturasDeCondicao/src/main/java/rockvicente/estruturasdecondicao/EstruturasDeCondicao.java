/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package rockvicente.estruturasdecondicao;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class EstruturasDeCondicao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a nota 1 ");
        float not1 = input.nextFloat();
        System.out.print("Digite a nota 2"); 
        float not2 = input.nextFloat();
        
        float media = not1 + not2 / 2;
        
        System.out.println("Media "+ media);
        
        if (media >= 10){
            System.out.println("Parabens");
        }
    }
}
