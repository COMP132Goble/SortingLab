package sorting;

import java.util.Comparator;

public class ReverseCompare implements Comparator<String> {
    public int compare(String s1, String s2) {
        String reverse1 = "";
        String reverse2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            reverse1 = reverse1 + s1.charAt(i);
        }
        for (int i = s2.length() - 1; i >= 0; i--) {
            reverse2 = reverse2 + s2.charAt(i);
        }
        reverse1 = reverse1.toLowerCase();
        reverse2 = reverse2.toLowerCase();

        return reverse1.compareTo(reverse2);
    }
}
