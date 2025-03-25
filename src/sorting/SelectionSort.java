package sorting;

/**
 * Implementation of the Selection Sort Algorithm.
 * 
 * @author William Goble
 * @author Student1, Student2
 */
public class SelectionSort {
    /**
     * Implementation of the Selection Sort algorithm. Returns a 
     * sorted array. Hint: create two helper functions to assist 
     * with the finding smallest element index operation and 
     * swapping indicies operation.
     * 
     * @param arr -- The array of Strings to be sorted
     * @return
     */
    public static String[] selectionSort(String[] arr) {
        return null;
    }
    
    static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] namesArray = {
            "Bob", "Fred", "Ralph",
            "Joe", "Wanda",  "Joanna",
            "billy Joe", "jennifer", "John"
        };
        System.out.println("Unsorted array");
        printArray(namesArray);
        namesArray = selectionSort(namesArray);
        System.out.println("Array after using the selection sorting algorithm");
        printArray(namesArray);
    }
}
