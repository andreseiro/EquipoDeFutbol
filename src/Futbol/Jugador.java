package Futbol;

/**
 * 
 * Esta clase denominada Jugador es una clase abstracta que modela un * jugador
 * de fútbol.
 * 
 * @version 1.2/2020
 * 
 */

abstract public class Jugador extends Persona {

	boolean esTitular; /* Atributo que define si un jugador es titular o no en un equipo */

	/**
	 * Constructor de la clase Jugador
	 * @param nombre    Parámetro que define el nombre de un jugador
	 * @param apellidos Parámetro que define los apellidos de un jugador
	 * @param edad      Parámetro que define la edad de un jugador
	 * @param esTitular Parámetro que define si un jugador es titular o no
	 */

	Jugador(String nombre, String apellidos, int edad, boolean esTitular) {
		super(nombre, apellidos, edad);
		this.esTitular = esTitular;
	}
}