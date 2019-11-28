package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Sirles Júnio
 */
public class intermediarios {

   
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int maior,menor;
        
        System.out.println("digite um numero: ");
        menor = ler.nextInt();

        System.out.println("digite outro numero: ");
        maior = ler.nextInt();

        do{
            menor++;
            System.out.println("Os valores existentes são:" + menor);
            
        } while(menor < maior);

    }
}
    
