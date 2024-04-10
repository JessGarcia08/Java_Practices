package cadenas_en_java;

public class Cadenas_en_Java {

    public static void main(String[] args) {
        //Longitud de una cadena
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("la longitud de string es: " + txt.length());//imprime la cantidad de letras en la variable
        //length() lee la longitud de string

        /*
        Hay muchos métodos de cadenas disponibles,
        por ejemplo toUpperCase()y toLowerCase():
         */
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // "hello world"

        /*El indexOf()método devuelve el índice (la posición) de la primera aparición
        de un texto específico en una cadena (incluidos los espacios en blanco):
         */
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));// Outputs 7

        //concatenacion de cadenas metodo contact()
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }

}
