package sorting;

import java.util.Arrays;

public class BuiltInSorting {
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

        Arrays.sort(namesArray);
        System.out.println("Array after using the built-in sorting algorithm");
        printArray(namesArray);

        Arrays.sort(namesArray, new ReverseCompare());
        System.out.println("Array after sorting alphabetically when string is reversed");
        printArray(namesArray);
    }
}
