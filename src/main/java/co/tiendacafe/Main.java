package co.tiendacafe;

public class Main {
    public static void main(String[] args) {

        Cafe cafeNariño = new Cafe("Café de Nariño", "Nariño", 35000, 10);
        Cafe cafeAntioquia = new Cafe("Café de Antioquia", "Antioquia", 30000, 8);
        Cafe cafeHuila = new Cafe("Café del Huila", "Huila", 32000, 12);

        cafeNariño.mostrarInformacion();
        cafeAntioquia.mostrarInformacion();
        cafeHuila.mostrarInformacion();

        System.out.println("Precio total Nariño: $" + cafeNariño.calcularPrecioTotal());
        System.out.println("Precio total Antioquia: $" + cafeAntioquia.calcularPrecioTotal());
        System.out.println("Precio total Huila: $" + cafeHuila.calcularPrecioTotal());

    }
}
