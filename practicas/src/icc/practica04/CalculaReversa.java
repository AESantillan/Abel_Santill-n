package icc.practica04;
import java.util.Scanner;

/**
 *
 *@author Abel Santillan
 *@param args
 */
public class CalculaReversa{
    
    public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	//declaramos las variables que vamos a utilizar
        String cadena;
        String reversa="";

        System.out.println("Ingresa la cadena");
	//leemos la cadena y la guardamos
	cadena=entrada.nextLine();
	/* En el ciclo hacemos que i sea igual a la longitud de la cadena -1
           que cuando i sea mayor o igual a 0 decrementamos a i, si se cumple
           recorremos el String desde el final hasta el inicio y obtenemos 
           cada carácter con el método charAt(i)
	   */
	
	for (int i=cadena.length()-1; i>=0; i--){
	    //reversa = reversa + cadena.charAt(i)

            reversa += cadena.charAt(i);
	}
	//imprime el resultado
        System.out.println(reversa);
    }
}
