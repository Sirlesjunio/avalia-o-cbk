package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Sirles Júnio
 */
public class castelo {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int andar,cartas;
       
        System.out.println("Quantos andares o castelo possuira? ");
        andar = ler.nextInt();
        
        if( andar < 2){
            System.out.println("Sera nescessario 7 cartas");
        }else{
            andar = ((andar+1)*2)/2;
            System.out.println("Sera nescessario "+andar+" cartas");
        }
    }
    
}
