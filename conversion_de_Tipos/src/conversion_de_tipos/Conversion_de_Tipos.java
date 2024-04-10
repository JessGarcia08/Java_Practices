package conversion_de_tipos;

public class Conversion_de_Tipos {

    public static void main(String[] args) {
        /*Ampliación de conversión
        conversión de un tipo más pequeño a un tamaño de tipo más grande
        byte-> short-> char-> int-> long-> float->double
         */
        int myInt = 9;
        double myDouble = myInt;//conversion de int a double

        System.out.println(myInt);//int = 9
        System.out.println(myDouble);//double = 9.0


        /*Reducción de conversión
         conversión de un tipo más grande a un tipo de tamaño más pequeño
         double-> float-> long-> int-> char-> short->byte
         */
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble; //conversion de double a int

        System.out.println(myDouble2);//double = 9.78
        System.out.println(myInt2);// int = 9
        

    }

}
