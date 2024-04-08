package java_General;

public class java_General {

    public static void main(String[] args) {
        // Tipos de datos espesificos en java
        int myNum = 5; // Integer (numero entero)
        System.out.println("myNum = " + myNum);
        float myFloatNum = 5.99f;// Floating point number
        System.out.println("myFloatNum = " + myFloatNum);
        char myLetter = 'D';// Character
        System.out.println("myLetter = " + myLetter);
        boolean myBool = true;// Boolean
        System.out.println("myBool = " + myBool);
        String myText = "Hello";// String
        System.out.println("myText = " + myText);

        //tipos de numeros enteros
        //tipo byte imprime e valor de la variabe
        byte myNumero = 100;
        System.out.println(myNumero);
        //imrpime el valor  corto de la variable
        short myNumero2 = 5000;
        System.out.println(myNumero2);

        /*
        La precisión de floates de sólo seis o 
        siete dígitos decimales
         */
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        /*
        tipo long  puede almacenar números enteros desde -9223372036854775808 hasta 9223372036854775807.
        Esto se usa cuando int no es lo suficientemente grande para almacenar el valor.
        Tenga en cuenta que debe terminar el valor con una "L"
         */
        long myNumero3 = 15000000000L;//terminaen L 
        System.out.println(myNumero3);

        //Tipos boolean tipo de dato que imprime si, no, encendido, apagado, verdad, falso
        boolean isJavaFun = true;
        System.out.println(isJavaFun);//imprime si es true
        boolean isFishTasty = false;
        System.out.println(isFishTasty);// imprime si es false

        //Caracteres
        //caracter char valores ASCII, puede usarlos para mostrar ciertos caracteres
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        //instrumento de cuerda
        //se utiliza para almacenar una secuencia de caracteres (texto). 
        String saludo = "Hello World";//Los valores de cadena deben estar entre comillas dobles:
        System.out.println(saludo);

        //ampliacion de fundicion
        //el ensanchamiento se utiliza automaticamente al pasar un tipo
        //de tamaño mas pequeño a un tipo de tamano mas grande
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        // valor de 9
        System.out.println(myInt);
        //valor con decimal double 9.0
        System.out.println(myDouble);
        
    }

}
