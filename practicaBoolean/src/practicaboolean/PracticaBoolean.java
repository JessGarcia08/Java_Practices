package practicaboolean;

public class PracticaBoolean {

    public static void main(String[] args) {

        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        if (varBoolean) {
            System.out.println("la bandera es verdadera");
        } else {
            System.out.println("la bandera es falsa");
        }

        var edad = 10;
        //var esAdulto = edad >= 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }
    }

}
