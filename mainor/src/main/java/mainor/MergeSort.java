package mainor;

public class MergeSort {

    public static Comparable[] auxArray;

    public static Integer[] arrayToSort = new Integer[] {1,4,6,34,76,45,27,24,754,78,534,21};

    public static String[] arrayOfStrings = new String[]{"Implementing", "Merge", "Sort", "In", "A", "Recursive", "Way"};

    public static boolean less(Comparable thisValue, Comparable thatValue){
        return thisValue.compareTo(thatValue) < 0;
    }

    public static void merge(Comparable[] array, int low, int middle, int high){
        int leftIndex = low;
        int rightIndex = middle +1;

        for (int i=low; i<= high; i++){
            auxArray[i] = array[i];
        }
        for(int i = low; i <= high; i++){
            if (leftIndex > middle){
                array[i] = auxArray[rightIndex++];
            } else if (rightIndex > high){
                array[i] = auxArray[leftIndex++];
            } else if (less(auxArray[rightIndex], auxArray[leftIndex])){
                array[i] = auxArray[rightIndex++];
            } else {
                array[i] = auxArray[leftIndex++];
            }
        }
    }

    public static void sort(Comparable[] array, int low, int high){
        if (high <= low) return;
        int mid = low + (high-low) /2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void printArray(Object[] array){
        for (int i=0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.println("   End of array");
    }

    public static void main(String[] args){
        auxArray = new Comparable[arrayOfStrings.length];

        printArray(arrayOfStrings);

        sort(arrayOfStrings,0,arrayOfStrings.length - 1);

        printArray(arrayOfStrings);

    }
}
