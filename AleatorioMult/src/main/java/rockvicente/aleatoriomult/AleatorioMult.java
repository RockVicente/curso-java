package rockvicente.aleatoriomult;

import java.util.Scanner;

public class AleatorioMult{
    public static void main (String[]args) {
        Scanner entrada=new Scanner (System.in);
        double ale = Math.random();
        int num = (int)(0 + ale * (100-0));
        System.out.println(num);
    }
}