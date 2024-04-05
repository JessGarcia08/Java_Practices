package practicaTPrimitivosFlotantes;

//11 programa
public class practicaTPrimitivosFlotantes {

    public static void main(String[] args) {
        /*
        Tipos primitivos flotante: Float y double
         */
        //imprime el rango minimo y maximo de float
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE);//-45 posisiones a la izquierda
        System.out.println("valor maximo tipo float: " + Float.MAX_VALUE);//E38 posisiones a la derecha
        
       //imprime el rango minimo y maximo de double
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
         System.out.println("valor minimo tipo Double : " +Double.MIN_VALUE);//E-324 posisiones a la izquierda
        System.out.println("valor maximo tipo Double: " + Double.MAX_VALUE);//E308 posisiones a la derecha
        
    }

}
