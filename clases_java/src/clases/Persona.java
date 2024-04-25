package clases;

public class Persona {

    //Atributos de la clase 
    String nombre;
    String apellido;

    //METODOS DE LA CLASE
    //void indica que no regresa ningun tipo de informacion
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);//imprimimos el atributo
        System.out.println("Apellido: " + apellido);
    }

   
}
