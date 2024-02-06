package b1;

import javax.swing.*;
import java.util.Scanner;
public class calculadora {

    public static void main(String[] args) {
        double numero1, numero2;
        int opcion;
        boolean condicion = true;

        while (condicion) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""" 
                    CALCULADORA INGRESA LA OPERACION A REALIZAR:\n
                     1.SUMAR\n
                     2.RESTAR\n
                     3.MULTIPLICAR\n
                     4.DIVIDIR\n
                     5.MODULO\n
                     6.SALIR"""

            ));        //Parametro encargado de captar el mensaje ingresado por el usuario


            switch (opcion) {
                case 1:
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    double suma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "LA SUMA ES: " + suma);

                case 2:
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    double resta = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "LA RESTA ES: " + resta);

                case 3:
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    double multiplicacion = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "LA MULTIPLICACION ES: " + multiplicacion);

                case 4:
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    if(numero2==0){
                        JOptionPane.showMessageDialog(null,"NO SE PUEDE DIVIDIR POR CERO, INGRESE OTRO NUMERO: ");
                    } else {
                        double division = numero1 / numero2;
                        JOptionPane.showMessageDialog(null, "LA DIVISION ES: " + division);
                    }

                case 5:
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
                    double modulo = numero1 % numero2;
                    JOptionPane.showMessageDialog(null, "EL MODULO ES: " + modulo);

                case 6:
                    condicion = false;
                    JOptionPane.showMessageDialog(null, "***SALISTE DEL SISTEMA*** ");
            }


        }

    }


    }









/*int num1,num2,oper,resultadoSuma=0, resultadoResta=0, resultadoMultipli=0, resultadoDivi=0;

    Scanner scanner = new Scanner(System.in);

    //Hace el ingreso del primer dato
        System.out.println("Digite el primer numero");
    num1=scanner.nextInt();

    //Hace el ingreso del segundo dato
        System.out.println("Digite el segundo numero");
    num2=scanner.nextInt();

        System.out.println("Digite la operacion a realizar: \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division");
    oper=scanner.nextInt();

    String operacion = obtenerOperacion(num1, num2);
        System.out.println("El resultado de la" + oper + "de ambos numeros es:" + operacion);

    public static string obtenerOperacion(int numero){
        string ope;

        switch (numero) {
            case 1:
                ope = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miércoles";
                break;
            default:
                dia = "Número no válido. Ingrese un número del 1 al 7.";
                break;
        }

        return;*/



