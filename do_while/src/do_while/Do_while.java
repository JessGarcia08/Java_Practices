
package do_while;


public class Do_while {

    
    public static void main(String[] args) {
//        var contador = 0;
//        while (contador < 3){//mientras sea verdadero se repetira el ciclo  
//            System.out.println("contador = " + contador);
//            contador++;
//        }
        
        
        //DO WHILE
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        //se agrega para que no sea un siclo infinito
        }while ( contador < 0);
        
        
    }
    
}
