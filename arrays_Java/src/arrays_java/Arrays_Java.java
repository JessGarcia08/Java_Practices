package arrays_java;

public class Arrays_Java {

    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";//si el valor (cars[0]) permanece en 0 imprime opel
        System.out.println(cars[0]);//modificando su valor imprime volvo,bmw,ford,mazda
        // Now outputs Opel instead of Volvo

        //en la matriz comienzan con 0 [0] el primer elemento [1] es el segundo elemento
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "opel";
        System.out.println(cars2[1]);//el valor cars[0] si cambia imprime el nombre de las 4 
        // Now outputs Opel instead of Volvo

        //para saber cuantos elementos tiene una matriz
        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};//modificando su valor numerico imprime volvo,bmw,ford,mazda
        System.out.println(cars3.length);//length es para saber la propiedad
        // Outputs 4

        //matriz de array
        String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars4.length; i++) {
            System.out.println(cars4[i]);
        }

        // for each se utiliza para recorrer elementos de la matriz
        String[] cars5 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars5) {
            System.out.println(i);
        }

        //Matrices multidimencionales
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][2]); // Outputs 7

        //cambiamos los valores de elementos
        int[][] myNumbers1 = {{1, 2, 3, 4}, {5, 6, 7}};
        myNumbers1[1][2] = 9;
        System.out.println(myNumbers1[1][2]); // Outputs 9 instead of 7

        //for loop en una array
        //para obtener una matriz bidimencional
        int[][] myNumbers2 = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers2.length; ++i) {
            for (int j = 0; j < myNumbers2[i].length; ++j) {
                System.out.println(myNumbers2[i][j]);
            }
        }

    }

}
