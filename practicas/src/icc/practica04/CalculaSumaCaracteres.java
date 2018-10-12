package icc.practica04;
import java.util.Scanner;

/**
 *
 *@author Abel Santillan
 *@param args
 */
public class CalculaSumaCaracteres{
    
    public static void main(String[] args) {
	//declaramos las variables que utilizaremos
	String cadena;
	int suma = 0;

	Scanner entrada = new Scanner(System.in);
	//introducimos la cadena y la guardamos en "cadena"
        System.out.print("Introduce la cadena: ");
        cadena = entrada.nextLine();
	/*el ciclo inicia en 0, cuando i sea menor a la longitud de la
          cadena se incremente en uno*/
	for(int i=0; i<cadena.length();i++){
	    /*suma = suma + cadena.codePointAt(i)
              suma cada caracter de la cadena y la asigana a
              la variable suma, el metodo codePoint nos da el valor
              de cada caracter*/

	    suma += cadena.codePointAt(i);
	    }
      	System.out.println(suma);
    }
}

