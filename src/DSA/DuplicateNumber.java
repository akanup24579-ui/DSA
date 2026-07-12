package DSA;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    boolean isDuplicate(int []arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;

    }
    public static void main(String[] args) {
        DuplicateNumber d = new DuplicateNumber();
        System.out.println("Contains Dupliacte:"+d.isDuplicate(new int[]{5,5,5,}));
    }
}
