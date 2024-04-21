package clase_atributo_metodo;

public class Clase_atributo_metodo {

    public static void main(String[] args) {
        inicio://etiqueta
        //esto rompe el ciclo y ciclos anidados
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0 ){
                continue inicio;//ir a linea de codigo de la etiqueta
            }
            System.out.println("contador = " + contador);
        }

        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);

       for ( var contador1 = 0; contador1 < 3; contador1++ ){//si es true se vuelve a repetir la evaluacion
           //termina la primera iteracion se sigue a las  otras
           System.out.println("contador1 = " + contador1);
           break;//rompe el ciclo
       }

        for (var contador2 = 0; contador2 < 3; contador2++) {
            if (contador % 2 != 0 ){
                continue ;//ir a la siguiente iteracion
            }
            System.out.println("contador2 = " + contador2);
        }


    }
}
