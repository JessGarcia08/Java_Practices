package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona persona1  = new Persona();//crear un nuevo objeto de tipo persona, en memoria
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);//@723279cf se almacena en diferente posision de memoria
        System.out.println("persona2 = " + persona2);//@10f87f48 se almacena en diferente posision de memoria
        //imprime null por que no tiene asignado ningun valor
        persona2.desplegarInformacion();
        
    }

}

