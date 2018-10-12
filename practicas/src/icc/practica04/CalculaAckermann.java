package icc.practica04;
import java.util.Scanner;

/**
 *
 *@author Abel Santillan
 *@param args
 */
public class CalculaAckermann{
    
    public static void main(String[] args) {
	//declaramos el escaner y las variable a utilizar
	Scanner entrada = new Scanner(System.in);
	//no les damos valor pues el usuario se lo dara
	int m,n;
	
	System.out.print("Introduce el valor de m: ");
	m = entrada.nextInt();
	System.out.print("Introduce el valor de n: ");
	n = entrada.nextInt();

	System.out.println(Ackermann(m, n));

    }
    /*el metodo Ackerman recibe como parametros a m y n los dos son
    enteros, cuando m es igual a 0 a n se le suma 1, cuando n es igual a    0 se le resta 1 a m y n se vuelve 1 hasta llegar a que m es igual a     0 y n+1, y por ultimo cuando los dos m y n son diferentes de 0, a m     se le restara 1 y dentro de este estara el m normal y n-1, 
    por ejemplo, Ackermann (1,1) es igual a 
    Ackermann(0,Ackermann(1,0))como m = 0 hacemos n+1
    Ackerman(0,Ackermann(0,1)) como m es igual a 0,se 
    aplica n+1 quedando
    Ackerman(0,2)como m es 0 entonces n+1 y por lo tanto
    Ackermann = 3 
    */
    static int Ackermann(int m,int n){

	if(m==0)
	    return (n+1);
	else if(n==0)
	    return Ackermann(m-1,1);
	else
	    return Ackermann(m-1,Ackermann(m,n-1));
    }
    
}
	    
