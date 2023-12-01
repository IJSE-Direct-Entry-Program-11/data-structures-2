import java.util.Arrays;
import java.util.HashSet;

public class DetectDuplicates {

    public static void main(String[] args) {
        int[] nums = {10, 20, 23, 20, 30, 40, 50, 60};
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) numbers.add(num);
        System.out.println("Duplicates:" + (numbers.size() - nums.length != 0));

        System.out.println("-------------------------");

        String[] names = {"Kasun", "Nuwan", "Ruwan", "Kasun", "Ruwan"};
        HashSet<String> nameSet = new HashSet<>(Arrays.asList(names));
        System.out.println("Duplicates:" + (nameSet.size() - names.length != 0));

        System.out.println("-------------------------");

        String word = "abccdefeef";
        HashSet<String> charSet = new HashSet<>(Arrays.asList(word.split("")));
        System.out.println("Duplicates:" + (charSet.size() - word.length() != 0));
    }
}
