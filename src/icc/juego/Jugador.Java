package icc.juego;


public class Jugador{

    /** Atributos, variables, constantes u objetos */
    private String nombre;
    private int dinero;
    private String ficha;

    /**
     * Constructor para un jugador
     *
     */

    public Jugador (String nombre, String ficha, int dinero){
	this.nombre = nombre;
	this.ficha = ficha;
	this.dinero = dinero;

    }
    /**
     * Nos dice el nombre del jugador
     * @return nombre del jugador
     */
    public String getNombre() {

	return nombre;
    }
    
    /**
     * Nos dice la ficha del jugador
     * @return Ficha asociada al jugador
     */
    public String getFicha() {  

	return ficha;

    }
    
    /**
     * Nos dice el dinero del jugador
     * @return el dinero asociado al jugador
     */

    public int getDinero() {

	return dinero;
    }
}
