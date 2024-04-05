package practicaconversiondetipos;
//17, 18 programa
import java.util.Scanner;

public class PracticaConversiondeTipos {

    public static void main(String[] args) {
        //convertir tipo string a un tipo int
        // var edad = "20";
        
        var edad = Integer.parseInt("20");
        //se realisa la suma y se agrega la concatenacion 
        System.out.println("edad = " + (edad + 1));
        
        /*
        parseDouble: se utiliza para convertir una cadena de caracteres que representa un número
        en un valor de tipo double.
        */
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad = Integer.parseInt( consola.nextLine());
//        System.out.println(" edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        //imprime por indice de 0 y asi susesivamente en ves de imprimir hola
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        //imprime el valor 0 que seria la primer letra escrita
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        //nextLine(): recupera cadenas y no directamente tipos enteros
        
    }

}
