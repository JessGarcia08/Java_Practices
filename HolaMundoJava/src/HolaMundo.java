
public class HolaMundo {

    public static void main(String args[]) {
        /*
            Tipos primitivos enteros:  byte, short, int, long
         */
        byte numeroByte = (byte) 129;
        System.out.println("valor byte:" + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo short:" + Short.MAX_VALUE);

        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo int:" + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo long:" + Long.MAX_VALUE);
        
    }

}
