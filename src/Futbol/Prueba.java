package Futbol;

/**
 * 
 * Esta clase prueba la creación de un equipo de futbol conformado por * sus
 * diferentes tipos de jugadores: portero, defensa, mediocampo y * delanteros,
 * ademas de un tecnico.
 * 
 * @version 1.2/2020
 * 
 */

public class Prueba {

	/**
	 * Metodo main que crea en primer lugar los integrantes especificos * de un
	 * equipo de futbol. Luego, compone el equipo con sus * integrantes y muestra
	 * sus datos en pantalla
	 */

	public static void main(String[] args) {

		Tecnico tecnico = new Tecnico("Carlos", "Queiroz", 66, 30, false); // Crea un tecnico
		Portero portero = new Portero("David", "Ospina", 30, true, 10); // Crea un portero
		Defensa[] defensas = new Defensa[4]; /* Crea un array de 4 defensas */
		Mediocampo[] mediocampos = new Mediocampo[4]; /* Crea un array de 4 mediocampos */
		Delantero[] delanteros = new Delantero[2]; /* Crea un array de 2 delanteros */

		// Crea los jugadores especificos de acuerdo a su tipo

		defensas[0] = new Defensa("Yerry", "Mina", 24, true);
		defensas[1] = new Defensa("Davison", "Sanchez", 23, true);
		defensas[2] = new Defensa("William", "Tesillo", 29, true);
		defensas[3] = new Defensa("Stefan", "Medina", 29, true);

		mediocampos[0] = new Mediocampo("Mateus", "Uribe", 28, true, 12);
		mediocampos[1] = new Mediocampo("Wilmar", "Barrios", 25, true, 12);
		mediocampos[2] = new Mediocampo("Juan Guillermo", "Cuadrado", 31, true, 10);
		mediocampos[3] = new Mediocampo("James", "Rodriguez", 28, true, 32);

		delanteros[0] = new Delantero("Radamel Falcao", "Garcia", 33, true, 15);
		delanteros[1] = new Delantero("Duvan", "Zapata", 28, true, 12);

		/* Crea el equipo pasando como parametros cada jugador creado anteriormente */

		EquipoFutbol equipo = new EquipoFutbol("Selección mayores", "Colombia",
				tecnico, portero, defensas, mediocampos, delanteros);

		equipo.imprimir(); // Muestra los datos del equipo de futbol
	}
}