package practicaconcatenaciones;
//sexto programa
public class PracticaConcatenaciones {

    public static void main(String[] args) {
        
        var usuario = "Juan";
        var titulo = "Ingeniero";
        //se concatenaron las variables
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        //no se recomienda utilizar una sola letra
        var i = 3;
        var j = 4;
        //se realiza la suma de numeros
        System.out.println(i + j);
        
        //Evaluacion de izq a der, realiza suma
        System.out.println(i + j + usuario);
        
        //contexto cadena,todo lo toma como una cadena
        System.out.println(usuario + i + j);
        
        //uso de parentesis modifica la prioridad en la evaluacion
        System.out.println(usuario + (i + j));

    }

}
