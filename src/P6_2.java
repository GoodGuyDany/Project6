import java.util.Arrays;
import java.util.Scanner;
// Part 2
public class P6_2 {
    static Scanner sc = new Scanner(System.in);

    // 1.
    public static int[] getUserArray(){
        System.out.println("How big would you like your array to be?");
        int arraylength = sc.nextInt();
        int[] array = new int[arraylength];
        for(int i = 0; i < arraylength; i++){
            System.out.println("Please input a number.");
            array[i] = sc.nextInt();
        }
        return array;
    }

    // 2.
    public static int[] getRandomUserArray(){
        System.out.println("How big would you like your array to be?");
        int arraylength = sc.nextInt();
        int[] array = new int[arraylength];
        for(int i = 0; i < arraylength; i++){
            array[i] = (int) (100 * Math.random());
        }
        return array;
    }

    // 3.
    public static void printArray(int[] array){
        int arraylength = array.length;
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    // 4.
    public static void printArraySum(int[] array){
        int sum = 0;
        int arraylength = array.length;
        for (int j = 0; j < arraylength; j++) {
            sum += array[j];
            // !last
            if (j != (arraylength - 1)) {
                System.out.print(array[j] + " + ");
            } else {
                // last
                System.out.print(array[j] + " = " + sum + " ");
            }
        }
    }

    // 5.
    public static int findLargestInArray(int[] array){
        int largest = array[0];
        for (int j : array) {
            if (j > largest) {
                largest = j;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] anArray = getUserArray();
        printArraySum(anArray);
        System.out.println(" ");
        int[] anArray2 = getRandomUserArray();
        System.out.println("Your array is:");
        printArray(anArray2);
        System.out.println(" ");
        System.out.println("The largest number in it is:");
        System.out.println(findLargestInArray(anArray2));
    } // Main
} // Class
