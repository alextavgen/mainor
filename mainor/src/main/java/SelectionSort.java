import mainor.*;

import java.util.ArrayList;
import java.util.Random;

public class SelectionSort {


    public static Integer[] arrayToSort = new Integer[] {1,4,6,34,76,45,27,24,754,78,534,21};

    public static boolean less(Comparable thisValue, Comparable thatValue){
        return thisValue.compareTo(thatValue) < 0;
    }

    public static void exchange(Comparable[] array, int indexFrom, int indexTo){
        Comparable temp = array[indexFrom];
        array[indexFrom] = array[indexTo];
        array[indexTo] = temp;
    }

    public static void printArray(Object[] array){
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.println("   End of array");
    }
    public static void main(String[] args){

        var five = 5;
        var six = 6;

        System.out.println(less(5,6));

        var arrayLength = arrayToSort.length;

        printArray(arrayToSort);


        for (int i=0; i < arrayLength; i++){
            int min = i;

            for (int internalIndex = i + 1; internalIndex < arrayLength; internalIndex++){
                if (less(arrayToSort[internalIndex], arrayToSort[min])){
                    min = internalIndex;
                }
            }
            exchange(arrayToSort, i, min);
        }

        printArray(arrayToSort);
    }
}
