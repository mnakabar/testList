package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        Pessoas teste = new Pessoas("Adidas", "camiseta");
        Pessoas teste1 = new Pessoas("Topper", "Bermuda");
        Pessoas teste2 = new Pessoas("Nike", "Sapato");
        Pessoas teste3 = new Pessoas("Mizuno", "Blusa");

        List <Pessoas> pessoas = new ArrayList<Pessoas>();
        pessoas.add(teste);
        pessoas.add(teste1);
        pessoas.add(teste2);
        pessoas.add(teste3);

        Scanner teclado = new Scanner(System.in);

       int i = 0;

         do {
             System.out.println("Informe a opcao desejada:");
             System.out.println("1 para teste ");
             System.out.println("2 para teste1 ");
             System.out.println("3 para teste2 ");
             System.out.println("4 para teste3 ");

             i = teclado.nextInt();
             if (i == 1 || i == 2 || i == 3 || i == 4 ) {

                 if (pessoas.get(i - 1).equals(teste)) {
                     System.out.println("ok");
                 } else if (pessoas.get(i - 1).equals(teste1)) {
                     System.out.println("tamo indo");
                 } else if (pessoas.get(i - 1).equals(teste2)) {
                     System.out.println("vmos nois");
                 } else if (pessoas.get(i - 1).equals(teste3)) {
                     System.out.println("testou");
                 }
             }
         }while (i != 5);
        System.out.println("Operacao encerrada");

    }
}
