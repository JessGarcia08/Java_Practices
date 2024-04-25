package arrays_java;

public class Arrays_Java {

    public static void main(String[] args) {

        //aqui se prueba si x es mayor que y
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x es mayor que y");
        }

        //Declaraciones con else
        int time = 20;
        if (time < 18) {//aqui el timpo (20) es mayor que 18
            System.out.println("buenos dias");
        } else {//como la condicion es falsa pasa difecto a else
            System.out.println("buenas noches");
        }
        //declaraciones else if
        int time1 = 22;
        if (time1 < 10) {//aqui 22 es mayor que 10
            System.out.println("buenos dias");
        } else if (time1 < 18) {
            System.out.println("buenas tardes");
        } else {//por lo tanto es false y pasa directo a else
            System.out.println("buenas noches");
        }
        //pero si time fueran las 14 nestro programa imprimiria buenos dias

        //short hand if else
        //if else normal
        int time2 = 20;
        if (time2 < 18) {
            System.out.println("buenos dias");
        } else {
            System.out.println("buenas noches");
        }

        //short if else
        int time3 = 20;
        String result = (time < 18) ? "buenos dias" : "buenas noches";
        System.out.println(result);

        //Declaraciones de switch if else
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");

                break;
            case 7:
                System.out.println("Sunday");
                break;//la pabara breack sale del bloque de cambio
            //lo cual hace que se detenga el codigo y haga la prueba de case
            //ya que se hace el trabajo de los casos pasa a break

        }
    }
}

    
