package operadores_condicionales;

public class Operadores_Condicionales {

    public static void main(String[] args) {
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= 0 && a <= 10;
        if (resultado) {
            System.out.println("dentro del rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = false;
        var diaDescanso = false;
        if (vacaciones || diaDescanso){
            System.out.println("el padre puede asistir al juego");
              } else {
            System.out.println("el padre esta ocupado");
        }
    }

}
