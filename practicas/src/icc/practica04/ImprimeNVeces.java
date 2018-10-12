package icc.practica04;
import java.util.Scanner;

/**
 *
 *@author Abel Santillán
 *@param args
 */
public class ImprimeNVeces{
    
    public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	/*declaramos que recibiremos la cadena y el numero de veces 
	  que la queremos repetir*/
	String cadena;
	int veces;
	
	System.out.print("Introduce la cadena que quieras repetir: ");
	//introducimos la cadena 
	cadena = entrada.nextLine();

	System.out.print("Introduce el numero de veces que la quieras repetir: ");
	// introducimos el numero de veces que queremos repetirla
	veces = entrada.nextInt();

	/*el ciclo for lo empezamos en 1 para que no cuente desde 0,
          hacemos que cuando i sea menor o igual al numero de veces
          que queremos repetir se incremente en uno e imprima la 
          cadena */
	for(int i=1;i<=veces; i++){
        System.out.println(cadena);
	}

    }
}
