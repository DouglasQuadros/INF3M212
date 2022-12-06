/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author 181910101
 */
public class CalcVidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade, diasvida;

        Scanner leia = new Scanner(System.in);
        System.out.println("Calculadora de Dias de vida");
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        diasvida = calcdiasvida(idade);

        System.out.print("Sua idade é " + idade);
        System.out.print(" e já viveu " + diasvida + " dias.");

    }

    public static int calcdiasvida(int old) {
        return old * 365;
    }
}
