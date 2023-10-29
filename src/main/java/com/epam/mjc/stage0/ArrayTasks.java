package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5,6,7,8,9,10};
        String[] arr3 = new String[]{"aaaa","bbbb","cccc","dddddd","eeee","fffff"};
        ArrayTasks arrayTasks = new ArrayTasks();
        arrayTasks.seasonsArray();
        arrayTasks.generateNumbers(4,arr);
        arrayTasks.totalSum(arr);
       arrayTasks.findIndexOfNumber(arr, 4,7);
       arrayTasks.reverseArray(arr3);
    }

    public String[] seasonsArray() {

        String[] seasons = new String[4];

        seasons[0] = "winter";
        seasons[1] = "spring";
        seasons[2] = "summer";
        seasons[3] = "autumn";
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
        return seasons;
    }

    public int[] generateNumbers(int length,int [] arr) {


        for (int i = 1; i <= length; i++) {

            System.out.print("[");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + ",");
            }
            System.out.print("]");
            System.out.println();
        }
        return arr;
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

    public int findIndexOfNumber(int[] arr, int number, int expIndex) {


        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                expIndex = i;
                //System.out.println(expIndex);
                break;
            }
        }return expIndex;
    }

    public String[] reverseArray(String[] arr3) {
            for (int i = 0; i < arr3.length / 2; i++) {
                String temp = arr3[i];
                arr3[i] = arr3[arr3.length - 1 - i];
                arr3[arr3.length - 1 - i] = temp;
            }
        System.out.println();
        return arr3;
}

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int n : arr)
        {
            if(n>0)
            {
                count++;
            }
        }
        int [] nums = new int[count];
        int i =0;
        for (int n : arr)
        {
            if(n>0)
            {
                nums[i] = n;
                i++;
            }
        }

        return nums;
    }


    public Object[] sortRaggedArray(int[][] arr) {return arr;

    };
}








































