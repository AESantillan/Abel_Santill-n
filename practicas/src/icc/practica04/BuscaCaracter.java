package icc.practica04;
import java.util.Scanner;
/**
 *
 *@author Abel Santillan
 *@param args
 */

public class BuscaCaracter{
    
    public static void main(String[] args){ 

	Scanner entrada = new Scanner(System.in);
	/*declaramos que recibiremos la cadena y el caracter  
	  que queremos buscar*/
	String cadena;
	char caracter;
	
	System.out.print("Introduce la cadena:");
	//introducimos la cadena 
	cadena = entrada.nextLine();

	System.out.print("Introduce el caracter que deseas buscar: ");

	/* introducimos el caracter que deseamos buscar
           como un char no puede ser leido con un nextChar();
           por lo tanto leemos una cadena String con el método next()
           y ya de aqui extraemos el caracter con charAt*/

	String cadCaracter = entrada.nextLine();
        caracter = cadCaracter.charAt(0);

	/* Contador el cual llevara el numero de veces que se repite
	   el caracter */

	int contador = 0;

        contador = contadorCaracteres(cadena, caracter);
        System.out.println("se repite: " + contador);
    }
    //calcular el número de veces que se repite un carácter en la cadena
    public static int contadorCaracteres(String s, char n) {
	//este contador no tiene nada que ver con ell anterior declarado
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = s.indexOf(n);
        while (posicion != -1) {
	    //mientras se encuentre el caracter se incrementa
            contador++;
            /*se sigue buscando a partir de la posición siguiente a 
            la encontrada */
            posicion = s.indexOf(n, posicion + 1);
        }
        return contador;
    }
}

						      
	
	
