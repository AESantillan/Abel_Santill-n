package icc.practica03;
import java.util.Scanner;
/**
 *
 * @author Abel Santillan
 * @param args
 */
 
public class Menu{
 
     
    public static void main(String[] args) {
         
       Scanner lector = new Scanner(System.in);
       //ponemos un entero para no usar string en el switch
       int plato; 
        
            
           System.out.println("1. Tacos");
           System.out.println("2. Enchiladas");
           System.out.println("3. Hamburguesas");
           System.out.println("4. Mole");
	   System.out.println("5. Sopes");
            
           System.out.println("Elige el numero del plato que desees");
           plato = lector.nextInt();
            
           switch(plato){
               case 1:
                   System.out.println("Hay de pastor y suadero");
                   break;
               case 2:
                   System.out.println("Cuestan 35 pesos");
                   break;
                case 3:
                   System.out.println("Solamente hay de arrachera");
                   break;
                case 4:
		    System.out.println("No tenemos arroz");
		    break;
	        case 5:
		    System.out.println("La orden es de 3");
		    break;
	   }
    }
}
	       
               
