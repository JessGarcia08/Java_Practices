package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
       var  resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
       /*
        en el operador ternario se recomienda utilizar solamente en expresiones 
        sencillas, si son expresiones mas complejas se recomienda utiizar 
        otro tio de estructuras como if, else
        */
       var numero = 9;
       resultado = (numero % 2 == 0) ? "numero par" : "numero inpar";
        System.out.println("resultado = " + resultado);
        
    }
}
