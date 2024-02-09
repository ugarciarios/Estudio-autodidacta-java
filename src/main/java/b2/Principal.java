package b2;

public class Principal {
    public static void main(String[] args) {

        Bebida bebida1 = new Bebida("Pepsi", "Pepsi", 1.5);
        Bebida bebida2 = new Bebida("Fanta de Naranja", "Fanta", 2);
        Comida comida1 = new Comida("Carne con Tomate", 350);
        Comida comida2 = new Comida("Rissoto", 100);


        System.out.println(bebida2.getNombre() + " - " + bebida2.getMarca() + " - " + bebida2.getCapacidad());
        System.out.println(comida2.getNombre() + " - " + comida2.getCantidad());
    }
}
