import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String unsortedOP = sc.nextLine();
        String[] numbers = unsortedOP.split("\\+");
        bubble(numbers);

        String respuesta = "";
        for (int i=0; i<numbers.length;i++){
            respuesta +=numbers[i]+"+";

        }
        System.out.println(respuesta.substring(0,respuesta.length()-1));

    }

    public static void bubble(String[] arr) {
        for (int i = 0; i < arr.length ; i++) {

            for (int z = 1; z < arr.length; z++) {

                if (arr[z - 1].compareTo(arr[z]) < 0) {

                } else {
                    String actual = arr[z];
                    String anterior = arr[z - 1];
                    arr[z - 1] = actual;
                    arr[z] = anterior;
                }

            }
        }
    }
}
