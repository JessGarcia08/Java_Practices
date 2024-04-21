package bucle_for_each;

public class Bucle_for_each {

    public static void main(String[] args) {
        //se utiliza exclusivamente para recorrer los elementos de una matriz

//        for (type variableName : arrayName) {
//            // code block to be executed
//        }
        //se genera todos los elementos de la matriz cars, utilizando un bucle"for-each"
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //Break and Continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {//termina en el valor 4 
                break;
            }
            System.out.println(i);
        }

        //continue
        //la declaracion continue interrumpe una iteracion en el buble
        //si se produce una condicion espesifica y continua con la siguiente iteracion en el bucle
        //Este ejemplo omite el valor de 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {//imprime hasta el 9 
                continue;
            }
            System.out.println(i);
        }

        //Break and Continue in While Loop
        //tambien se puede usar un break y conitnue en bucles while
        //break
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {//termina en valor de 4
                break;
            }
        }
        //continue
        int e = 0;
        while (e < 10) {
            if (e == 4) {
                e++;
                continue;//contunua hasta llegar a 10
            }
            System.out.println(e);
            e++;
        }

        //se detiene si j es 5
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;//termina en 5
            }
            System.out.println(j);
        }

        /*
        cuando i es igual a 3, continue salta a la siguiente iteración sin imprimir 3.
        Cuando i es igual a 7, break termina el bucle por completo.
         */
        for (int x = 0; x < 10; x++) {
            if (x == 3) {
                continue; // Salta a la siguiente iteración si i es igual a 3
            }
            if (x == 7) {
                break; // Termina el bucle si i es igual a 7
            }
            System.out.println(x);
        }  
    }

}
