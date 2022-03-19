package Futbol;

/**
 * 
 * Esta clase denominada EquipoFutbol es una clase que modela un * equipo de
 * futbol. Un equipo de futbol tiene un nombre, pais, un * tecnico, un portero,
 * cuatro defensas y dos delanteros.
 * 
 * @version 1.2/2020
 * 
 */

public class EquipoFutbol {

	String nombre; /* Atributo que identifica el nombre de un equipo de futbol */
	String pais; // Atributo que identifica el pais de un equipo de futbol Relaciones de
	
	// asociación, agregación y composición
	Tecnico tecnico; /* Atributo que identifica el tecnico de un equipo de futbol */
	Portero portero; /* Atributo que identifica el portero de un equipo de futbol */
	Defensa[] defensas; /* Atributo que identifica los defensas de un equipo de futbol */
	Mediocampo[] mediocampos; /* Atributo que identifica los mediocampos de un equipo de futbol */
	Delantero[] delanteros; /* Atributo que identifica los delanteros de un equipo de futbol */

	/**
	 * Constructor de la clase EquipoFutbol
	 * @param nombre Parámetro que define el nombre de un equipo de * futbol
	 * @param pais   Parámetro que define el pais del equipo de futbol
	 */

	public EquipoFutbol(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;

	}

	/**	 
	 * Constructor sobrecargado de la clase EquipoFutbol
	 * @param nombre      Parámetro que define el nombre de un equipo de * futbol
	 * @param pais        Parámetro que define el pais del equipo de futbol
	 * @param tecnico     Parámetro que define el tecnico de un equipo de * futbol
	 * @param portero     Parámetro que define el portero de un equipo de * futbol
	 * @param defensas    Parámetro que define los defensas de un equipo * de futbol
	 * @param mediocampos Parámetro que define los mediocampos de * un equipo de futbol
	 * @param delanteros  Parámetro que define los delanteros de un * equipo de futbol
	 */

	public EquipoFutbol(String nombre, String ciudad, Tecnico tecnico,
		Portero portero, Defensa[] defensas, Mediocampo[] mediocampos, Delantero[] delanteros) {
		this(nombre, ciudad); // Invoca al constructor inicial 366
		this.tecnico = tecnico;
		this.portero = portero;
		this.defensas = defensas;
		this.mediocampos = mediocampos;
		this.delanteros = delanteros;
	}

	/**
	 * 
	 * Metodo que muestra en pantalla los datos del equipo junto con la *
	 * información de su tecnico, portero, defensas y delanteros
	 * 
	 */

	void imprimir() {
		System.out.println("Nombre del equipo = " + nombre);
		System.out.println("Pais = " + pais);
		System.out.println("Portero [" + portero + "]");
		System.out.println("Defensas");

		for (int i = 0; i < defensas.length; i++) { /* Recorre el array de defensas */
			System.out.println(defensas[i]);
		}

		System.out.println("Medicampo");

		for (int j = 0; j < mediocampos.length; j++) { /* Recorre el array de mediocampos */
			System.out.println(mediocampos[j]);
		}

		System.out.println("Delanteros");

		for (int k = 0; k < delanteros.length; k++) { /* Recorre el array de delanteros */
			System.out.println(delanteros[k]);
		}
	}
}