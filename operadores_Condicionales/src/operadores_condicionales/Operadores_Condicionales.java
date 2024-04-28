package operadores_condicionales;

public class Operadores_Condicionales {

    public static void main(String[] args) {
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        //se compara si a esta dentro del rango del valor  maximo
        var resultado = a >= 0 && a <= 10;//se realiza la comparacion del valor maximo que es 10
        if (resultado) {
            System.out.println("dentro del rango");//por lo tanto esta dentro del rango ya que a = 8
        } else {
            System.out.println("Fuera de rango");
        }
        //comparamos si la persona tiene dia de descanso con verdadero y falso
        var vacaciones = false;
        var diaDescanso = false;//se le da el valor de falso 
        if (vacaciones || diaDescanso){
            System.out.println("el padre puede asistir al juego");
              } else {
            System.out.println("el padre esta ocupado");
            //ya que ambas variables son falsas nos dara que el padre esta ocupado
        }
    }

}
