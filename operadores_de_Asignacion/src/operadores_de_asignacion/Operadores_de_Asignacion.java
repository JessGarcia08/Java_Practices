
package operadores_de_asignacion;
//20 programa

public class Operadores_de_Asignacion {

    
    public static void main(String[] args) {
        
        int a = 3, b=2;
        //operador de asignacion
        int c = a + 5 - b;//== es para saber si los operadores son iguales
        System.out.println("c = " + c);
        
        //operador de asignacion de compocision
        a += 1;//a = a + 1
        System.out.println("a = " + a);
        
        a += 3;//a = a + 3
        System.out.println("a = " + a);
        
        a -= 2;//a = a - 2
        System.out.println("a = " + a);
        
        // *= /= %=
        a *= 4;//a = a - 4
        System.out.println("a = " + a);
        
        a /= 5;//a = a - 5
        System.out.println("a = " + a);
        
        a %= 6;//a = a - 6
        System.out.println("a = " + a);
        
    }
    
}
