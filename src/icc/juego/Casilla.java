package icc.juego;

/**
 * Clase que modela un objeto de tipo casilla especial para el tablero del jueg 
 * Patea y corre, creado también por Leonardo Gallo para el curso de Introducc- 
 * ión a Ciencias de la computación, impartido en la Facultad de Ciencias, UNAM. * El diseño busca cubrir lo necesario para desarrollar la lógica del juego 
 * u n tablero formado a partir de objetos de tipo Casilla.
 *
 * @author Leonardo Gallo
 * @version 2
 * @date 05/11/2018
 */
public class Casilla {

    /** niguno 0 | jugador 1 | jugador 2 */
    private int ocupante;
    /** Casilla neutral asociada, si es null entonces es neutral */
    private Casilla cNeutral;
    /** número de la casilla */
    private int indice;
    /** lado del tablero, valores posibles: 1, 2, 3 ó 4 */
    private int lado;

    /**
     * Construye una casilla del circuito principal
     * 
     */
    public Casilla(Casilla cNeutral, int indice, int lado) {
	ocupante = 0;
	this.cNeutral = cNeutral;
	this.indice = indice;
	this.lado = lado;
    }

    /**
     * Construye una casilla neutral
     *
     */
    public Casilla(int indice, int lado) {
	ocupante = 0;
	cNeutral = null;
	this.indice = indice;
	this.lado = lado;
    }

    /**
     * Nos dice si la casilla esta ocupada por algún jugador
     * @return true si esta ocupada falso en caso contrario
     */
    public boolean estaOcupada() {
	return (ocupante != 0)? true : false;
    }

    /**
     * Nos dice quién está en la casilla
     * @return valor entero etiqueta del ocupante
     */
    public int getOcupante() {
	return ocupante;
    }

    /**
     * Nos dice si la casilla es neutral
     * @return true en caso de que sea neutral, false en caso contrario
     */
    public boolean esNeutral() {
	return (cNeutral == null)? true : false;
    }

    /**
     * Modifica el ocupante de la casilla
     * @param ocupante es quién está ahora en la casilla
     */
    public void setCasilla(int ocupante) {
	this.ocupante = ocupante;
    }

    /**
     * Nos permite tener la referencia a la casilla neutral de ese lado
     * del tablero
     * @return casilla neutral asociada
     */
    public Casilla getNeutral() {
	return cNeutral;
    }

    /**
     * Permite saber la posición que ocupa la casilla en un tablero
     * @return indice actual dentro del tablero
     */
    public int getIndice() {
	return indice;
    }

    /**
     * Permite saber el lado en el que se encuentra dentro de un tablero
     * @return lado del tablero como valor entero
     */
    public int getLado() {
	return lado;
    }
}
