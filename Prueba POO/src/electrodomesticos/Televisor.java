package electrodomesticos;

/**
 * Esta clase es una sub-clase de Electrodomestico.
 * 
 * @author Andres Barroso
 *
 */
public class Televisor extends Electrodomestico {

    // Atributos.
    private int resolucion;
    private boolean sintonizadorTDT;

    // Constantes.
    private int RES_PORDEFECTO = 20;
    private boolean SINTO_PORDEFECTO = false;

    // Constructores
    public Televisor() {
	super();
	this.resolucion = RES_PORDEFECTO;
	this.sintonizadorTDT = SINTO_PORDEFECTO;
    }

    public Televisor(int precio, int peso) {
	super(precio, peso);
	this.resolucion = RES_PORDEFECTO;
	this.sintonizadorTDT = SINTO_PORDEFECTO;
    }

    public Televisor(String tipo, int precio, int peso, String color, char consumoEnergetico, int resolucion,
	    boolean sintonizadorTDT) {
	super(tipo, precio, peso, color, consumoEnergetico);
	this.resolucion = resolucion;
	this.sintonizadorTDT = sintonizadorTDT;
    }

    // Metodos Get de resolucion y sintonizadorTDT.
    public int getResolucion() {
	return resolucion;
    }

    public boolean isSintonizadorTDT() {
	return sintonizadorTDT;
    }

    // Metodos complejos.
    /**
     * Este metodo sirve para agregar un valor extra al precio del objeto Televisor.
     * El valor extra es determinado segun el valor de los atributos resolucion y
     * sintonizadorTDT.
     */
    @Override
    public void precioFinal() {
	super.precioFinal();
	int porcentajeextra = ((getPrecio() / 100) * 30);
	//System.out.println(getPrecio());
	//System.out.println(porcentajeextra);
	int agregarR = 0;
	if (getResolucion() > 40) {
	    agregarR = (getPrecio() + porcentajeextra);
	    setPrecio(agregarR);
	}
	int agregarS = 0;
	if (isSintonizadorTDT()) {
	    agregarS = (getPrecio() + 50);
	    setPrecio(agregarS);
	}

    }

}
