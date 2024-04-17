package while_loop;

public class While_Loop {

    public static void main(String[] args) {
        // El whilebucle recorre un bloque de código siempre que una condición especificada sea true:

        //el código del bucle se ejecutará una y otra vez, siempre que una variable (i) sea menor que 5:
        int i = 0;
        while (i < 5) {//si i es menor que 5 terminara en 4
            System.out.println(i);
            i++;// se ejecuta, 0,1,2,3,4
        }

        //bucle do/while
        //si la condición es verdadera, luego repetirá el bucle mientras la condición sea verdadera.
        int e = 0;
        do {
            System.out.println(e);
            e++;
        } while (e < 8);

        //for en bucle
        //imprimirá los números del 0 al 4
        for (int a = 0; a < 5; a++) {
            System.out.println(a);
        }

        //imprimirá valores pares entre 0 y 10
        for (int j = 0; j <= 10; j = j + 2) {
            System.out.println(j);
        }

        //bucles animados el "bucle interno" se ejecutará una vez por cada iteración del "bucle externo"
        // Outer loop
        for (int c = 1; c <= 2; c++) {
            System.out.println("Outer: " + c); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
        
        
    }

}
