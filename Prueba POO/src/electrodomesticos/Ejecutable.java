package electrodomesticos;

public class Ejecutable {

    public static void main(String[] args) {

	/**
	 * Esta es nuestra clase ejecutable. Primero crea un arreglo tipo
	 * Electrodomestico de 10 espacios. Despues crea un objeto distinto en cada
	 * espacio del arreglo. Despues comprueba si los valores en Consumo Energetico y
	 * Color son valores soportados y muestra el valor por cada objeto.
	 * Despues suma los valores de cada objeto deacuerdo al atributo "tipo".
	 * @autor Andres Barroso.
	 * @Copyright Do not use if you want something functional.
	 */

	Electrodomestico listaElectro[] = new Electrodomestico[10];

	listaElectro[0] = new Electrodomestico("Electrodomestico", 110, 50, "Azul", 'B');
	listaElectro[1] = new Lavadora("Lavadora", 50, 90, "Negro", 'C', 35);
	listaElectro[2] = new Televisor("Televisor", 30, 20, "Rojo", 'A', 41, true);
	listaElectro[3] = new Electrodomestico("Electrodomestico", 130, 25, "Gris", 'D');
	listaElectro[4] = new Lavadora("Lavadora", 70, 15, "Blanco", 'F', 50);
	listaElectro[5] = new Televisor("Televisor", 10, 20, "Rojo", 'A', 21, false);
	listaElectro[6] = new Electrodomestico("Electrodomestico", 40, 60, "Azul", 'E');
	listaElectro[7] = new Lavadora("Lavadora", 78, 10, "Azul", 'A', 50);
	listaElectro[8] = new Televisor("Televisor", 55, 50, "Gris", 'E', 60, false);
	listaElectro[9] = new Televisor("Televisor", 150, 49, "Blanco", 'C', 20, true);

	System.out.println("Producto 1: Electrodomestico");
	listaElectro[0].comprobarConsumoEnergetico();
	listaElectro[0].comprobarColor();
	listaElectro[0].precioFinal();
	System.out.println(listaElectro[0].getPrecio() + "€");

	System.out.println("Producto 2: Lavadora");
	listaElectro[1].comprobarConsumoEnergetico();
	listaElectro[1].comprobarColor();
	listaElectro[1].precioFinal();
	System.out.println(listaElectro[1].getPrecio() + "€");

	System.out.println("Producto 3: Televisor");
	listaElectro[2].comprobarConsumoEnergetico();
	listaElectro[2].comprobarColor();
	listaElectro[2].precioFinal();
	System.out.println(listaElectro[2].getPrecio() + "€");

	System.out.println("Producto 4: Electrodomestico");
	listaElectro[3].comprobarConsumoEnergetico();
	listaElectro[3].comprobarColor();
	listaElectro[3].precioFinal();
	System.out.println(listaElectro[3].getPrecio() + "€");

	System.out.println("Producto 5: Lavadora");
	listaElectro[4].comprobarConsumoEnergetico();
	listaElectro[4].comprobarColor();
	listaElectro[4].precioFinal();
	System.out.println(listaElectro[4].getPrecio() + "€");

	System.out.println("Producto 6: Televisor");
	listaElectro[5].comprobarConsumoEnergetico();
	listaElectro[5].comprobarColor();
	listaElectro[5].precioFinal();
	System.out.println(listaElectro[5].getPrecio() + "€");

	System.out.println("Producto 7: Electrodomestico");
	listaElectro[6].comprobarConsumoEnergetico();
	listaElectro[6].comprobarColor();
	listaElectro[6].precioFinal();
	System.out.println(listaElectro[6].getPrecio() + "€");

	System.out.println("Producto 8: Lavadora");
	listaElectro[7].comprobarConsumoEnergetico();
	listaElectro[7].comprobarColor();
	listaElectro[7].precioFinal();
	System.out.println(listaElectro[7].getPrecio() + "€");

	System.out.println("Producto 9: Televisor");
	listaElectro[8].comprobarConsumoEnergetico();
	listaElectro[8].comprobarColor();
	listaElectro[8].precioFinal();
	System.out.println(listaElectro[8].getPrecio() + "€");

	System.out.println("Producto 10: Televisor");
	listaElectro[9].comprobarConsumoEnergetico();
	listaElectro[9].comprobarColor();
	listaElectro[9].precioFinal();
	System.out.println(listaElectro[9].getPrecio() + "€");

	int sumaTodo = 0;
	int sumaLavadora = 0;
	int sumaTelevisor = 0;

	for (int i = 0; i < listaElectro.length; i++) {
	    sumaTodo += listaElectro[i].getPrecio();
	    if (listaElectro[i].getTipo() == "Lavadora") {
		sumaLavadora += listaElectro[i].getPrecio();
	    }
	    if (listaElectro[i].getTipo() == "Televisor") {
		sumaTelevisor += listaElectro[i].getPrecio();
	    }
	}
	System.out.println();
	System.out.println("Suma total de Electrodomesticos = " + sumaTodo + "€");
	System.out.println();
	System.out.println("Suma total de Lavadoras = " + sumaLavadora + "€");
	System.out.println();
	System.out.println("Suma total de Televisores = " + sumaTelevisor + "€");

    }

}
