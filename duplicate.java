import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicate {

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 2, 1, 6};

        // Create a set to store the unique elements of the array.
        Set<Integer> set = new HashSet<>();

        // Add each element of the array to the set.
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Create a new array to store the unique elements.
        int[] uniqueArray = new int[set.size()];

        // Add each element of the set to the new array.
        int index = 0;
        for (int element : set) {
            uniqueArray[index++] = element;
        }

        // Print the unique array.
        System.out.println(Arrays.toString(uniqueArray));
    }
}