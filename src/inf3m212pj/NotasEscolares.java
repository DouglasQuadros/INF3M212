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
public class NotasEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nesta área posso definir as variaveis 'locais'
        float nota1, nota2, nota3, nota4, media;
        Scanner leia = new Scanner(System.in);

        System.out.println("Notas Escolares");
        System.out.print("Informe a 1º Nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Informe a 2º Nota: ");
        nota2 = leia.nextFloat();
        System.out.print("Informe a 3º Nota: ");
        nota3 = leia.nextFloat();
        System.out.print("Informe a 4º Nota: ");
        nota4 = leia.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média foi de: " + media);
        System.out.printf("Sua média foi de: %.2f", media);
        if (media >= 7) {
            System.out.println("\nVocê esta Aprovado!");
        } else {
            System.out.println("\nVocê foi Reprovado!");
        }
    }

}
