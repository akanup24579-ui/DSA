package DSA;

import java.util.ArrayList;

public class BackTrackingPermutation {
    static void generate(int[] arr, ArrayList<Integer> current, boolean used[]) {
        if (current.size() == arr.length) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i] == false) {
                current.add(arr[i]);
                used[i] = true;
                generate(arr, current, used);
                current.remove(current.size() - 1);
                used[i] = false;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        boolean used[] = new boolean[arr.length];
        generate(arr, new ArrayList<>(),used );
    }
}

