
package igualdad.relacionales;


public class IgualdadRelacionales {

    
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = a != b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = cadena == cadena2;//comparar referencia de objetos
        System.out.println("e = " + e);
        
        var f = cadena.endsWith(cadena2);//comparar contenido de cadenas
        System.out.println("f = " + f);
        
        var g = a >= b;//mayor que >, o mayor o igual >=
        System.out.println("g = " + g);
        
        if (a % 2 == 0){
            System.out.println("es numero par");
        } else{
            System.out.println("es numero impar");
        }
        
        var edad = 10;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("es un adulto");
        } else {
            System.out.println("es menor de edad");
        }
    }
    
}
