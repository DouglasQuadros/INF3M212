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
public class NotasEscolaresMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("Notas Escolares Matriz");
        System.out.print("Quantos Alunos?");
        int nAlunos = (int) leiaFloat();
        System.out.println("Quantas Notas?");
        int nNotas = (int) leiaFloat();

        String alunos[] = new String[nAlunos];
        float notas[][] = new float[nAlunos][nNotas + 1];//nNotas +1 pra ter uma posição pra guardar a média

        for (int i = 0; i < nAlunos; i++) {
            System.out.print("Nome do Aluno: ");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[i][j] = leiaFloat();
                    if (validaNota(notas[i][j])) {
                        System.out.println("Nota Inválida, tente novamente.");
                    }
                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];//acumula as notas
            }//fim do for notas
            notas[i][nNotas] = notas[i][nNotas] / nNotas;//calc. média
        }//fim do for alunos
        System.out.println("\n--Resultado--\n");
        for (int i = 0; i < nAlunos; i++) {//impressão no console
            System.out.printf(alunos[i] + " sua média foi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(" e você foi Aprovado.");
            } else {
                System.out.println(" e Infelizmente você reprovou.");
            }

        }
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
    }//fim do float
    public static void menu(){
        System.out.println("1- Inserir notas do Aluno");
        System.out.println("2- Imprimir notas");
        System.out.println("0- Sair");
        System.out.println("Digite Aqui: ");
    }//fim menu

}
