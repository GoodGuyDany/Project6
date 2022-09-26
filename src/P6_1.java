// Part 1. Array Syntax
public class P6_1 {
    public static void main(String[] args) {

        // 1.1
        int[] arr1 = new int[10];

        // 1.2
        int size1 = 5;
        int[] arr2 = new int[size1];

        // 1.3
        int[] arr3 = {1, 4, 2, 7};

        // 1.4
        int[] Int = {1, 2, 3, 4, 5};
        double[] Double = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] string = {"String1", "String2", "String3", "String4", "String5"};
        char[] Char = {'A', 'B', 'C', 'D', 'E'};
        boolean[] Boolean = {true, true, false, true, true};

        // 1.5
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr4length = arr4.length;
        System.out.println("Arr4 length is: " + arr4length);

        // 2.1
        int[] arr5 = new int[5];
        arr5[4] = 45;
        System.out.println("5th element value: " + arr5[4]);
        // Error
//      System.out.println("1001st element value: " + arr5[1000]);

        // 3.1
        int[] arr6 = {1, 2, 3, 4, 5};
        int arr6length = arr6.length;
        for (int i = 0; i <= arr6length - 1; i++){
            System.out.println(arr6[i]);
        }

        // 3.2
        int[] arr7 = {-1, -2, -3, -4, -5};
        for (int count: arr7){
            System.out.println(count);
        }

        // 3.3
        boolean arrgo = true;
        int[] arr8 = {5, 4, 3, 2, 1};
        int j = 0;
        while (arrgo){
            System.out.println(arr8[j]);
            j++;
            if (j >= arr8.length){
                arrgo = false;
            }
        }

    } // Main
} // Class
