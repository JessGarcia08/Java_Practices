package calculo_de_switch;

public class calculo_de_switch {

    public static void main(String[] args) {
       //VAOR DE NUMERO EN TEXTO
        var numero = 2;
        var numeroTexto = "numero desconocido";

        if (numero == 1) {//en cada if evalua cual es el numero asignado de la variable
            numeroTexto = "numero uno";
        } else if (numero == 2) {
            numeroTexto = "numero dos";
        } else if (numero == 3) {
            numeroTexto = "numero tres";
        } else if (numero == 4) {
            numeroTexto = "numero cuatro";
        } else {
            numeroTexto = "numero no enconteado";//en caso de que cambie valor de la variable  y este no este en los if da numero no encontrado
        }

         System.out.println("numeroTexto = " + numeroTexto);//imprime nuestra variable
         
         //IMPRIME ESTACION DEL MES
        var mes = 1;
        var estacion = "estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "invierno";
        }
        else if (mes == 3 || mes == 4 || mes ==5){
            estacion = "primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "otoño";
        }
        
        System.out.println("estacion = " + estacion);
        
        //IMPRIME TEXTO NUMERICO
        //esto tambien puede utilizarse en ves de if else
//        var numero = 2;
//        var numeroTexto = "valor desconocido";
//
//        switch (numero) {
//            case 1:
//                numeroTexto = "numero uno";
//                break;//se recomienda usar a menos que se siga reconociendo los demas casos
//            case 2:
//                numeroTexto = "numero dos";
//                break;
//            case 3:
//                numeroTexto = "numero tres";
//                break;
//            case 4:
//                numeroTexto = "numero cuatro";
//                break;
//            default:
//                numeroTexto = "caso no encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//        



            //ESTACION DEL MES
//        var mes = 12;// dependiendo el valor imprimira el case
//        var estacion = "estacion desconocida";
//
//        switch (mes) {
//            case 1: case 2: case 12:
//                estacion = "invierno";
//                break;
//            case 3: case 4: case 5:
//                estacion = "primavera";
//                break;
//            case 6: case 7: case 8:
//                estacion = "verano";
//            case 9: case 10: case 11:
//                estacion = "otonio";
//                break;   
//        }
//        System.out.println("estacion = " + estacion);
    }

}
