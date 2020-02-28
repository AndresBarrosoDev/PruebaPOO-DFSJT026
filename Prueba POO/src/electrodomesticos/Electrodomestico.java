package electrodomesticos;

/**
 * Esta es nuestra super-clase. Esta clase se encarga de construir nuestros
 * objetos de tipo Electrodomestico y de heredar sus atributos y un metodo a las
 * sub-clases: Lavadora y Televisor.
 * 
 * @author Andres Barroso.
 */

public class Electrodomestico {

    // Atributos.
    private String tipo;
    private int precio;
    private int peso;
    private String color;
    private char consumoEnergetico;
    /**
     * Descripcion de los atributos.
     * 
     * @param tipo:              Este atributo categoriza nuestros objetos.
     * @param precio:            Este atributo almacena el precio del objeto.
     * @param peso:              Este atributo almacena el peso del objeto y
     *                           dependiendo de su valor, agrega un valor al
     *                           atributo "precio"..
     * @param color:             Este atributo almacena el color del objeto.
     * @param consumoEnergetico: Este atributo almacena el color del objeto y
     *                           dependiendo de su valor, agrega un valor al
     *                           atributo "precio".
     */

    // Constantes.
    private int PRECIO_BASE = 112;
    private String COLOR_PORDEFECTO = "Blanco";
    private char CONSUMO_PORDEFECTO = 'F';
    private int PESO_PORDEFECTO = 5;
    private String TIPO_PORDEFECTO = "Electrodomestico";

    // Constructores.
    public Electrodomestico() {
	this.tipo = TIPO_PORDEFECTO;
	this.precio = PRECIO_BASE;
	this.peso = PESO_PORDEFECTO;
	this.color = COLOR_PORDEFECTO;
	this.consumoEnergetico = CONSUMO_PORDEFECTO;

    }

    public Electrodomestico(int precio, int peso) {
	this.precio = precio;
	this.peso = peso;
	this.tipo = TIPO_PORDEFECTO;
	this.color = COLOR_PORDEFECTO;
	this.consumoEnergetico = CONSUMO_PORDEFECTO;

    }

    public Electrodomestico(String tipo, int precio, int peso, String color, char consumoEnergetico) {
	this.tipo = tipo;
	this.precio = precio;
	this.peso = peso;
	this.color = color;
	this.consumoEnergetico = consumoEnergetico;
    }

    // Metodos Get & Set.

    public int getPrecio() {
	return precio;
    }

    public String getTipo() {
	return tipo;
    }

    public void setTipo(String tipo) {
	this.tipo = tipo;
    }

    public void setPrecio(int precio) {
	this.precio = precio;
    }

    public int getPeso() {
	return peso;
    }

    public void setPeso(int peso) {
	this.peso = peso;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public char getConsumoEnergetico() {
	return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
	this.consumoEnergetico = consumoEnergetico;
    }

    // Metodos complejos.
    /**
     * Este metodo comprueba que la letra ingresada este dentro del rango de letras
     * soportadas.
     * 
     * @param letra
     */
    public void comprobarConsumoEnergetico() {
	char letra = getConsumoEnergetico();
	int contador = 0;
	char[] letrasValidas = { 'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f' };
	for (int i = 0; i < letrasValidas.length; i++) {
	    if (letra == letrasValidas[i]) {
		contador++;
	    }
	}
	if (contador == 0) {
	    setConsumoEnergetico(CONSUMO_PORDEFECTO);
	}

    }

    /**
     * Este metodo comprueba que el color ingresado este dentro del rango de colores
     * soportados.
     * 
     * @param color
     */
    public void comprobarColor() {
	int contador = 0;
	String color = getColor();
	String coloresValidos[] = { "Blanco", "Negro", "Rojo", "Azul", "Gris", "blanco", "negro", "rojo", "azul",
		"gris" };
	for (int i = 0; i < coloresValidos.length; i++) {
	    if (color == coloresValidos[i]) {
		contador++;
	    }
	}
	if (contador == 0) {
	    setColor(COLOR_PORDEFECTO);
	}

    }

    /**
     * Este metodo sirve para agregar un valor extra al precio de cualquier objeto
     * Electrodomestico. El valor extra es determinado segun el valor de los
     * atributos consumoEnergetico y peso.
     */
    public void precioFinal() {
	// Agregar valor por Consumo Energetico.
	int agregarE = 0;
	if (getConsumoEnergetico() == 'A') {
	    agregarE = (getPrecio() + 100);
	    setPrecio(agregarE);
	} else if (getConsumoEnergetico() == 'B') {
	    agregarE = (getPrecio() + 80);
	    setPrecio(agregarE);
	} else if (getConsumoEnergetico() == 'C') {
	    agregarE = (getPrecio() + 60);
	    setPrecio(agregarE);
	} else if (getConsumoEnergetico() == 'D') {
	    agregarE = (getPrecio() + 50);
	    setPrecio(agregarE);
	} else if (getConsumoEnergetico() == 'E') {
	    agregarE = (getPrecio() + 30);
	    setPrecio(agregarE);
	} else if (getConsumoEnergetico() == 'F') {
	    agregarE = (getPrecio() + 10);
	    setPrecio(agregarE);
	}

	// Agregar valor por peso.
	int agregarP = 0;
	if (getPeso() >= 0 && getPeso() <= 19) {
	    agregarP = (getPrecio() + 10);
	    setPrecio(agregarP);
	}
	if (getPeso() >= 20 && getPeso() <= 49) {
	    agregarP = (getPrecio() + 50);
	    setPrecio(agregarP);
	}
	if (getPeso() >= 50 && getPeso() <= 79) {
	    agregarP = (getPrecio() + 80);
	    setPrecio(agregarP);
	}
	if (getPeso() >= 80) {
	    agregarP = (getPrecio() + 100);
	    setPrecio(agregarP);
	}
    }

}
