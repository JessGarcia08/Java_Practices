package practicascanner;
	import java.util.Scanner;
public class PracticaScanner {
//8 programa
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        //Scanner es un tipo de clase
        Scanner consola = new Scanner(System.in);//System.in nos permite entrar a al consola
        var usuario = consola.nextLine();//nextLine(): lee linea completa de la consola
        System.out.println("usuario = " + usuario);//ya ingresado informacion se asigna a nuestro usuario
        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);//concatenacion de ambas variables
    }

}
