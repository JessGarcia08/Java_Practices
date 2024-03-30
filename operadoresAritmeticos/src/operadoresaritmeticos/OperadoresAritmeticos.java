package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("resultado division = " + resultado);
        //se uso literal de punto float
        var resultado2 = 3.0 / b;
        System.out.println("resultado division = " + resultado2);
        //operador de modulo
        var resultado3 = a % b;
        System.out.println("resultado division = " + resultado3);
        //par e impar
        if (b % 2 == 0) {
            System.out.println("es numero par");
        } else {
            System.out.println("es numero impar");
        }

    }

}
