public class QuickSort {

    public static Integer[] arrayToSort = new Integer[] {1,4,6,34,76,45,27,24,754,78,534,21};

    public static String[] arrayOfStrings = new String[]{"Implementing", "Quick", "Sort", "In", "A", "Recursive", "Way"};


    public static boolean less(Comparable thisValue, Comparable thatValue){
        return thisValue.compareTo(thatValue) < 0;
    }

    public static void exchange(Comparable[] array, int indexFrom, int indexTo){
        Comparable temp = array[indexFrom];
        array[indexFrom] = array[indexTo];
        array[indexTo] = temp;
    }
    private static int partition(Comparable[] array, int low, int high){
        int leftIndex = low;
        int rightIndex = high + 1;
        Comparable temp = array[low];
        while(true){
            while (less(array[++leftIndex], temp)){
                if (leftIndex == high) break;
            }
            while (less (temp, array[--rightIndex])){
                if (rightIndex == low) break;
            }
            if (leftIndex >= rightIndex) break;
            exchange(array, leftIndex, rightIndex);
        }
        exchange(array, low, rightIndex);
        return rightIndex;
    }

    private static void sort(Comparable[] array, int low, int high){
        if (high <= low) return;
        int centeredElement = partition(array, low, high);
        sort(array, low, centeredElement-1);
        sort(array, centeredElement + 1, high);
    }

    public static void printArray(Object[] array){
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.println("   End of array");
    }


    public static void main(String[] args){

        printArray(arrayOfStrings);

        sort(arrayOfStrings,0,arrayOfStrings.length - 1);

        printArray(arrayOfStrings);

    }
}
