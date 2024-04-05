package tiposprimitivos;
//10 programa

public class TiposPrimitivos {

    public static void main(String[] args) {
        /*
            Tipos primitivos enteros:  byte, short, int, long
         */
        //se utiliza para almacenar números enteros pequeños. Es un tipo primitivo de datos y ocupa 8 bits en la memoria
        //byte contiene 8bits
        byte numeroByte = (byte) 129;
        System.out.println("valor byte:" + numeroByte);//no almacena el valor 129
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);//valor negativo
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);//valor positivo

        //almacenar números enteros que no requieren tanta memoria como un int
        //short contiene 16bits
        short numeroShort = (short) 32768;//imprime negativo debido a perdida de bits
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short:" + Short.MIN_VALUE);//short almacena numeros enteros cortos
        System.out.println("valor maximo short:" + Short.MAX_VALUE);
        
        
        //es una clase que encapsula un valor entero de tipo primitivo int,se convierte en long con L al final
        //int contiene 32bits
        int numeroInt = (int) 2147483648L;//rango maximo que alcanza
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo int:" + Integer.MAX_VALUE);
        
        //se utiliza para almacenar números enteros largos
        //long contiene 64bits
        long numeroLong = 9223372036854775807L;//valor maximo que alcanza 
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo long:" + Long.MAX_VALUE);
    }

}
