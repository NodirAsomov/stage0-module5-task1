package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5,6,7,8,9,10};
        String[] arr3 = new String[]{"baba","zaza","mama","nanana"};
        ArrayTasks arrayTasks = new ArrayTasks();
        arrayTasks.seasonsArray();
        arrayTasks.generateNumbers(4);
        arrayTasks.totalSum(arr);
       arrayTasks.findIndexOfNumber(arr, 4);
       arrayTasks.reverseArray(arr3);
    }

    public String[] seasonsArray() {

        String[] seasons = new String[5];
        seasons[0] = " ";
        seasons[1] = "winter";
        seasons[2] = "spring";
        seasons[3] = "summer";
        seasons[4] = "autumn";
        for (int i = 1; i < 5; i++) {
            System.out.println(seasons[i]);
        }
        return seasons;
    }

    public int[] generateNumbers(int length) {
        int[] intArr = {1, 2, 3, 4, 5, 6};

        for (int i = 1; i <= length; i++) {
            //System.out.print();
            System.out.print("[");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + ",");
            }
            System.out.print("]");
            System.out.println();
        }
        return intArr;
    }


    public int totalSum(int[] arr) {
        //arr = new int [] {1, 2, 3, 4, 5};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {


        for (int i:arr) {
            if (number == arr[i]) {
                System.out.println(i);
                //break;
            }
            System.out.println(-1);

        }return -1;
    }

    public String[] reverseArray(String[] arr3) {
        for(int i=0;i<arr3.length;i++)
            System.out.print(arr3[i] + "  ");

        System.out.println();
        for(int i=arr3.length-1;i>=0;i--)
            System.out.print(arr3[i] + "  ");
     return arr3;
}

    public int[] getOnlyPositiveNumbers(int[] arr) {
    return arr;}

    public Object[] sortRaggedArray(int[][] arr) {return arr;

    };
}








































