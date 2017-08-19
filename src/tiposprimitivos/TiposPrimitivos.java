/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author EllyCruzz
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua idade ");
        int idade = teclado.nextInt();
        System.out.printf("A idade de %s é %d \n", nome, idade);
    }
    
}
