
package operdor_de_igualdad;


public class Operdor_de_Igualdad {

    
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        //operador de igualdad
        var c = (a == b);//regresa un boolean un ture o false
        System.out.println("c = " + c);
        
        //operador de diferente a 
        var d = a != b;//aqui se pregunta si a es diferente a b
        System.out.println("d = " + d);
        
        //comparar true o false con metodo string
        var cadena = "hola";
        var cadena2 = "adios";
        var e = cadena == cadena2;//compara la referencia de objetos
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2);//comparamos contenido de cadenas
        System.out.println("f = " + f);
        
        
        //operadores relacionales indican si un valor es igual o mayor 
        var g = (a >= b);//mayor o igual >= o mayor que >
        System.out.println("g = " + g);
        
        //par o impar
        //numero impar es el que no es multiplo de dos
        //el par es el que es multiplo de dos
        if(a % 2 == 0){
            System.out.println("Es numero par");
        } else{
            System.out.println("Es numero impar");
        }
        
      
    }
    
}
