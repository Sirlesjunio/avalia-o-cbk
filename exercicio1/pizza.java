package exercicio1;

import java.util.Scanner;



/**
 *
 * @author Sirles Júnio
 */
public class pizza {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int pizza, pessoas, pedacos;
        
        System.out.println("Quantas pizzas? ");
        pizza = ler.nextInt();
        
        System.out.println("Quantas pessoas? ");
        pessoas = ler.nextInt();
        
        pizza = 8*3;
        pedacos = pizza/pessoas;
        if(pedacos > 0){
            System.out.println("Sobraram "+pedacos+" pedaços de pizza");
        }    
    }
    
}
