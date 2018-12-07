package icc.juego;


/**
 *
 * @version 01/12/2018
 */
public class Dado {

    /** Atributos, variables, constantes u objetos */
    private int numCaras;
    private boolean balanceado;
    
    /**
     * Constructor para un dado de 6 caras
     *
     */
    public Dado() {
	numCaras = 6;
	balanceado = true;

    }

    /**
     * Construye un dado como un poliedro con el número de caras señalado
     * y se selecciona el color de acuerdo a una tabla numérica.
     * @param numCaras
     * @param color
     */
    public Dado(int numCaras, int color) {

    }
   
    /**
     * Modifica el numero de caras del dado
     * @param numero de caras del dado
     */
    public void setNumCaras(int numCaras) {
	this.numCaras = numCaras;
    }

    /**
     * Nos dice cuantas caras tiene el dado
     * @return valor entero etiqueta el numero de caras
     */
    public int getNumCaras() {
	return numCaras;
    }

    /**
     * Nos dice si el dado es balanceado
     * @return true si es balanceado falso en caso contrario
     */
    public boolean esBalanceado() {

	return (numCaras != 6)? true : false;
    }

    /**
     * Nos dice el color de la cara del dado
     * @return el color asociado
     */
    public int getColor() {
	return 0;
    }

    /**
     * Modifica el color del Dado
     * @param color
     */
    public void setColor() {

	this.color = color;
    }
    
    /**
     * lanza el dado 
     * @return un entero que es valor obtenido
     */
    public int lanzaDado() {
        
	return 0;
    }

    /**
     * Permite saber cuantassa veces se lanzara un dado
     * 
     */
    public int[] lanzaNVeces(int lanzamientos) {
        
	return null;
    }

    /**
     * Nos dice cuantos lanzamientos fueron
     * @return valor entero
     */
    public int getUltimoLanzamiento() {
        
	return 0;
    }

    /**
     * Constructor que nos muestra el dado
     *
     */
    public void muestraDado() {
        
    }

}
