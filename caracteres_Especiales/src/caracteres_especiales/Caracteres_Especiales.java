
package caracteres_especiales;
//7 programa

public class Caracteres_Especiales {

    
    public static void main(String[] args) {
        var nombre =  "karla";
        //salto de linea \n
        System.out.println("Nueva linea: \n" + nombre);
        //tabulador
        System.out.println("Nueva linea: \t" + nombre);
        //caracter de retroceso, regresa unas posicion atras \b\b esto retrocede dos lugares
        System.out.println("Nueva linea: \b" + nombre);
        //comilla simple 'karla'
        System.out.println("comilla simple:\'" + nombre + "'");
        //comilla doble "karla", \"
        System.out.println("comilla doble:\"" + nombre + "\"");
        
        
    }
    
}
