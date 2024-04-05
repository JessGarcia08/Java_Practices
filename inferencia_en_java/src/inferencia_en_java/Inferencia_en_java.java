package inferencia_en_java;

//cuarto programa
public class Inferencia_en_java {

    public static void main(String[] args) {
        //var - inferencias de tipos en java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        //imprime nuestro nombre de variable y el valor de la variable
        var miVariableCadena2 = "Nueva cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);//concatenacion
        
        
        //reglas para definir una variable permitidas
        var $miVariable = 1;
        var _mivariable =2;
        var miVariable = 3;
        //var áVariable = 10; no se recomienda utilizar 
         //var #miVariable = 2; no se recomienda utilizar 
    }

}
