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
public class NotasEscolaresVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leia = new Scanner(System.in);
        System.out.println("Notas Escolares");
        System.out.println("Quant. notas a inserir?");
        int nNotas = (int) leiaFloat();

        float notas[] = new float[nNotas + 1];//vetor de 5 posições

        //System.out.println("Notas Escolares");
        for (int i = 0; i < nNotas; i++) {
            do {
                System.out.println("Informe a " + (i + 1) + "ª nota:");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota Inválida, Tente novamente.");
                }
            } while (validaNota(notas[i]));
            notas[nNotas] += notas[i];// acumula notas
        }//fim do for
        notas[nNotas] = notas[nNotas] / nNotas;//faz a média
        System.out.print("Sua média foi de " + notas[nNotas]);
        if (nNotas > 7) {
            System.out.println(" e foi aprovado.");
        } else {
            System.out.println(" e foi reprovado.");
        }//fim do if
    }//fim da main

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;

    }//fim validanota

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println("Valor não é núm., tente novamente: ");
            return leiaFloat();
        }
    }
}
