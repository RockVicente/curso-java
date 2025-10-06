/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockvicente.idiomasistemaoperacional;

import java.util.Locale;

public class IdiomaSistemaOperacional {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        String idioma = currentLocale.getLanguage();
        System.out.println("o idioma do seu sistema operacional e " +idioma);
    } 
}
