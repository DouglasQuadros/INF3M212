/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 181910101
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Tamanho do Array: " + nomes.size());
        nomes.add("Jair");
        System.out.println("Tamanho do Array: " + nomes.size());

        System.out.println("Digite um Nome: ");
        nomes.add(leia.next());
        System.out.println("Tamanho do Array: " + nomes.size());
        System.out.println(nomes.toString());

        nomes.add(0, "Jubileu");
        System.out.println("Tamanho do Array: " + nomes.size());
        System.out.println(nomes.toString());

        nomes.add(3, "Kiara");
        System.out.println("Tamanho do Array: " + nomes.size());
        System.out.println(nomes.toString());

        System.out.println("Remove Indíce 1");
        nomes.remove(1);
        System.out.println("Tamanho do Array: " + nomes.size());
        System.out.println(nomes.toString());

        System.out.println("Impressão Array");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);

        }
        System.out.println("ArrayList vazio?");
        System.out.println(nomes.isEmpty());

        System.out.println("Index da Kiara é: " + nomes.indexOf("Kiara"));

        System.out.println("Ordenação de Array");
        nomes.add("André");
        nomes.add("Jy");
        nomes.add("Thiago");
        nomes.add("Douglas");
        nomes.add("Marcos");

        System.out.println(nomes.toString());
        //ordenação
        Collections.sort(nomes);
        System.out.println("Ordenado: " + nomes.toString());
        Collections.reverse(nomes);
        System.out.println("Ordem reversa: " + nomes.toString());
    }//fim da main

}
