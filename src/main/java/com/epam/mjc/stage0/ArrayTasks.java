package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {


    public static void main(String[] args) {
        ArrayTasks arrayTasks= new ArrayTasks();
        arrayTasks.seasonsArray();
        arrayTasks.generateNumbers(5);
    }

        public String[] seasonsArray() {

        String[] seasons=new String[5];
        seasons[0] = " ";
        seasons[1] = "winter";
        seasons[2] = "spring";
        seasons[3] = "summer";
        seasons[4] = "autumn";
        for (int i = 1; i < 5; i++) {
            System.out.println(seasons[i]);
        }
              return seasonsArray();}

    public int[] generateNumbers(int length) { int[] intArr = {1,2,3,4,5,6};
        for (int num : intArr) {
            for (int i = 1; i <=length; i++) {
                //System.out.print();
                System.out.print("[");
                for (int j = 1; j <=i; j++) {
                    System.out.print(j+",");
                }
                System.out.print("]");
                System.out.println();
            }
        }
        return generateNumbers(5);
    }

    public Object[] reverseArray(String[] arr) {
        Integer[] intArray = {10,20,30,40,50,60,70,80,90};

        //print array starting from first element
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
        return reverseArray(arr);
    }

    public int totalSum(int[] arr) {
         arr = new int [] {1, 2, 3, 4, 5};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            //System.out.println(sum);
        }
        System.out.println(sum);
        return totalSum(arr);
    }




    public int findIndexOfNumber(int[] arr, int number) {
        int target=102;
        int[] numbers = {99, -7, 102};
        for (int index = 0; index < numbers.length; index++) {
        if (numbers[index] == target) {
        return index;
        }
        }
        return -1;
        }



    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] numbers = {2,-1,5,-4,3};
        int[] nums= new int[10];
        System.out.print(numbers);




        for (int n : numbers)
        {
            if(n>0)
            {
                nums = numbers;
            }
        }

        return numbers;
    }

    public Object[] sortRaggedArray(int[][] arr) {
        int matrix[][] = { { 39, 27, 11, 42 },
                { 10, 93, 91, 90 },
                { 54, 78, 56, 89 },
                { 24, 64, 20, 65 } };
        // Sort this matrix by 3rd Column
        int col = 3;
        //sortbyColumn(matrix, col - 1);

        // Display the sorted Matrix
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();

        }return sortRaggedArray(arr);
    }
}






        //ArrayTasks arrayTasks=new ArrayTasks();
        //arrayTasks.



    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */














