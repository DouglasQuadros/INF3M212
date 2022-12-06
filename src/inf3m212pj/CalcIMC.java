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
public class CalcIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float peso, alt, indice;
        Scanner leia = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.println("Digite o seu peso: ");
        peso = leia.nextFloat();
        System.out.println("Digite a sua altura: ");
        alt = leia.nextFloat();
        indice = peso / (alt * alt);
        System.out.printf("Seu Indice é de %.2f", indice);
        if (indice <= 18.4) {
            System.out.println(" Magreza");
        } else if (indice <= 24.9) {
            System.out.println(" Normal");
        } else if (indice <= 29.9) {
            System.out.println(" Sobrepeso");
        } else if (indice <= 39.9) {
            System.out.println(" Obesidade");
        } else {
            System.out.println(" Obesidade Grave");
        }

    }

}
