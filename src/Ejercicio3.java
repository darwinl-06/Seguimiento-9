import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fisrtWord = sc.nextLine();
        String secondWord = sc.nextLine();
        String thirdWord = sc.nextLine();

        String firstAndSecondWord = new String(bubble((fisrtWord+secondWord).getBytes()));
        String goal = new String(bubble((thirdWord.getBytes())));

        compare(firstAndSecondWord,goal);

    }

    public static byte[] bubble(byte[] arr) {
        for (int i = 0; i < arr.length ; i++) {

            for (int z = 1; z < arr.length; z++) {

                if (arr[z - 1] < (arr[z])) {

                } else {
                    byte actual = arr[z];
                    byte anterior = arr[z - 1];
                    arr[z - 1] = actual;
                    arr[z] = anterior;
                }

            }
        }

        return arr;
    }

    public static void compare(String firstWord, String secondWord) {
        if(firstWord.equals(secondWord)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
