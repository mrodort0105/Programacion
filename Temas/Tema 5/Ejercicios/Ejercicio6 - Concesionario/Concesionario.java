package ejercicio7;

public class Concesionario {

    public static void main(String[] args) {

        Carro coche = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Yamaha", "R6", 2021, false);
        Camion camion = new Camion("Volvo", "FH16", 2020, 18);

        System.out.println("Carros");
        coche.mostrarDetalles();
        coche.mover();

        System.out.println("\nMotos");
        moto.mostrarDetalles();
        moto.mover();

        System.out.println("\nCamiones");
        camion.mostrarDetalles();
        camion.mover();
    }
}
