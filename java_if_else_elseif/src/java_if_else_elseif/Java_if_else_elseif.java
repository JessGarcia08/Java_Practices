package java_if_else_elseif;

public class Java_if_else_elseif {

    public static void main(String[] args) {
        // uso de if else, else if
//        int time = 22;
//        if (time < 10) {
//            System.out.println("Good morning.");
//        } else if (time < 18) {
//            System.out.println("Good day.");
//        } else {
//            System.out.println("Good evening.");
//        }

        int tiempo = 5;//dependiendo el valaor de la variable imprime el else
        if (tiempo < 10) {
            System.out.println("buenos dias");
        } else if (tiempo < 18) {
            System.out.println("buenas tardes");
        } else {
            System.out.println("buenas noches");
        }

        //ternarios con if
        //escritura normal de if
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        //escritura de if ternario
        //se recomienda utilizar solo en estructuras sensillas 
        int time2 = 21;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        
       

    }

}
