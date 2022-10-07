import java.util.Arrays;
import java.util.Scanner;

class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase=0;
        int items=0;
        int sonItems =0;
        testCase = sc.nextInt();

        for (int h=0;h<testCase;h++){
            items=sc.nextInt();
            sonItems=sc.nextInt();

            int totalItems[] = new int[items];

            for(int i=0;i<items;i++){
                totalItems[i]=sc.nextInt();
            }
            sortSelection(totalItems);
            int sumHijo=0;
            int sumPadre=0;


            if(sonItems<=(items-sonItems)){
                for(int i=0;i<sonItems;i++) {
                    sumHijo= sumHijo+totalItems[i];
                }
                for(int i=sonItems;i<items;i++) {
                    sumPadre=sumPadre+ totalItems[i];
                }
            }else{
                for(int i=0;i<items-sonItems;i++) {
                    sumHijo=sumHijo + totalItems[i];
                }
                for(int i=items-sonItems;i<items;i++) {
                    sumPadre=sumPadre + totalItems[i];
                }
            }

            System.out.println(sumPadre-sumHijo + "\n");

        }
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


}
