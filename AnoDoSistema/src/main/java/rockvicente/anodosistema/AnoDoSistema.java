/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package rockvicente.anodosistema;

import java.time.Year;

/**
 *
 * @author LENOVO
 */
public class AnoDoSistema {

    public static void main(String[] args) {
        Year year = Year.now();
        int anoActual = year.getValue();
        System.out.println(anoActual);
    }
}
