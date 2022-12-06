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
public class NotasEscolaresMatrizMenu {

//declaração global
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opM;
        Scanner leia = new Scanner(System.in);
        System.out.println("Notas Escolares Matriz");
        System.out.print("Quantos Alunos?");
        nAlunos = (int) leiaFloat();
        System.out.println("Quantas Notas?");
        nNotas = (int) leiaFloat();

        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];
        //String alunos[] = new String[nAlunos];
        //float notas[][] = new float[nAlunos][nNotas + 1];//nNotas +1 pra ter uma posição pra guardar a média

        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) {
                case 1:
                    inserirAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário!");
                    break;
            }//fim do switch
        } while (opM != 0);

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

    public static void menu() {
        System.out.println("1- Inserir notas do Aluno");
        System.out.println("2- Imprimir notas");
        System.out.println("0- Sair");
        System.out.println("Digite Aqui: ");
    }//fim menu

    public static void inserirAlunoNotas() {
        Scanner leia = new Scanner(System.in);
        if (contAlunos < nAlunos) {
            System.out.print("Nome do Aluno: ");
            alunos[contAlunos] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("\tDigite a " + (j + 1) + "ª nota: ");
                    notas[contAlunos][j] = leiaFloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("Nota Inválida, tente novamente.");
                    }
                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j];//acumula as notas
            }//fim do for notas
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;//calc. média
            contAlunos++;
        } else {
            System.out.println("Não é mais possível lançar notas."
                    + "\nTodas as posições ocupadas.");
        }//fim do for alunos
    }//fim inserirAlunosNotas

    public static void imprimirAlunosNotas() {
        System.out.println("\n--Resultado--\n");
        for (int i = 0; i < contAlunos; i++) {//impressão no console
            System.out.printf(alunos[i] + " sua média foi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(" e você foi Aprovado.");
            } else {
                System.out.println(" e Infelizmente você reprovou.");
            }

        }//fim for de saída no console
    }
}
