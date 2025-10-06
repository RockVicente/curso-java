/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockvicente.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("DIgite o nome do aluno");
        String  nome = teclado.nextLine();
        System.out.println("Digite a nota ");
        float nota = teclado.nextFloat();
        System.out.format("A nota do %s e %.2f ", nome, nota); 
    } 
}
