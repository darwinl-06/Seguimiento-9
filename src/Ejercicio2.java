import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numS = scanner.nextInt();
        int[] n = new int[numS];
        int[] Array = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            int id = scanner.nextInt();
            n[i] = id;
        }



        sortSelection(n);

        for (int i = 0; i < Array.length; i++) {
            Array[i] = n[i];
        }
        int conta = Pairs(Array);
        System.out.println(conta);
    }



    private static void sortSelection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // get values to swap
                    int valorI = arr[i];
                    int valorJ = arr[j];
                    // swap
                    arr[i] = valorJ;
                    arr[j] = valorI;
                }
            }
        }
    }


    private static int Pairs(int[] arr) {
        int pairs = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && arr[i] != 0) {
                pairs++;
                if (arr.length - i > 1) {
                    if (arr[i] == arr[i - 1] && arr[i] == arr[i + 1]) {
                        return -1;
                    }

                }
            }
        }

        return pairs;


    }

}
