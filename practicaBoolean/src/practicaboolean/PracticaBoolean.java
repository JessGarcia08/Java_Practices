package practicaboolean;
//16 programa
public class PracticaBoolean {

    public static void main(String[] args) {
        //valores de tipo bandera tipo semaforo si esta en rojo es false y si esta verde es true
        
        
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        //dependiendo del valor de la variable si es false o true
        if (varBoolean) {
            System.out.println("la bandera es verdadera");
        } else {
            System.out.println("la bandera es falsa");
        }
        //imprime dependiendo de la definicion de la variabe
        var edad = 10;
        //var esAdulto = edad >= 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
            
            
        }
    }

}
