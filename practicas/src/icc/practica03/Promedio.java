package icc.practica03;
import java.util.Scanner ;
/**
 *
 * @author Abel Santillan
 * @param args
 */
public class Promedio {

    public static void main (String[]args) {

	/*la variable numeros solamente guarda cuantos vamos a meter
	y suma sera necesaria para sacar el promedio de los numeros*/				     
	int numeros;
	int suma = 0;
	int promedio = 0 ;

	Scanner entrada = new Scanner (System.in);
	
	System.out.println ("Ingrese el promedio de cuantos numeros desea calcular");
        numeros = entrada.nextInt();

	//solicitamos que el for se repita tantas veces lo solicitemos
	
	System.out.println("ingrese los numeros");

	for(int i=1;i<= numeros; i++){
	 
	    int numero = entrada.nextInt();
	    
	    suma = suma + numero;
	}
	//el promedio va afuera de las llaves ya que solo se obtiene al final
	    promedio = suma/numeros;

	    System.out.println("El promedio es:"+promedio);
	
    }
}

