package electrodomesticos;

/**
 * Esta clase es una sub-clase de Electrodomestico.
 * 
 * @author Andres Barroso
 *
 */
public class Lavadora extends Electrodomestico {

    // Atributo.
    private int carga;
    /**
     * Definicion del atributo.
     * 
     * @param carga: Este atributo almacena la carga de la Lavadora y dependiendo de
     *               su valor, cambia el valor al atributo "precio".
     * 
     */

    // Constante.
    private int CARGA_PORDEFECTO = 5;

    // Constructores.
    public Lavadora() {
	super();
	this.carga = CARGA_PORDEFECTO;

    }

    public Lavadora(int precio, int peso) {
	super(precio, peso);
	this.carga = CARGA_PORDEFECTO;
    }

    public Lavadora(String tipo, int precio, int peso, String color, char consumoEnergetico, int carga) {
	super(tipo, precio, peso, color, consumoEnergetico);
	this.carga = carga;
    }

    // Metodo Get de Carga.
    public int getCarga() {
	return carga;
    }

    // Metodos complejos.
    /**
     * Este metodo sirve para agregar un valor extra al precio del objeto Lavadora.
     * El valor extra es determinado segun el valor del atributo Carga.
     */
    @Override
    public void precioFinal() {
	super.precioFinal();
	// System.out.println(getPrecio());
	int agregarC = 0;
	if (getCarga() >= 30) {
	    agregarC = (getPrecio() + 50);
	    setPrecio(agregarC);
	}

    }

}
