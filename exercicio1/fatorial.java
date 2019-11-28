/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Sirles Júnio
 */
public class fatorial {
    
    
    public static void main (String [] args){
	int fat = 1;
        int valor; //ou qualquer outro valor que queira calcular;

        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor desejado: ");
        valor = ler.nextInt();
	
        for( int i = 2; i <= valor; i++ ){
            fat *= i;                                    
        }
        System.out.println( "O fatorial de " + valor + " é igual a " + fat );
    }
}