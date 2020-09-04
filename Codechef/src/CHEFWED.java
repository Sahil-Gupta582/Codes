import java.io.*;
import java.util.*;
class CHEFWED {
    public static void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int cost = k;
        int repeats = RepeatCounter(arr);
        int costprim = cost + repeats;
        ArrayList<Integer> costList = new ArrayList<>();
        costList.add(costprim);
        if (n % 2 == 0) {
            int repeat1;
            int repeat2;
            int kk = n / 2;
            int[] arr1 = new int[n / 2];
            int[] arr2 = new int[n / 2];
            for (int i = 0; i < n / 2; i++, kk++) {
                arr1[i] = arr[i];
                arr2[i] = arr[kk];
            }
            repeat1 = RepeatCounter(arr1);
            repeat2 = RepeatCounter(arr2);
            int costextra = repeat1 + repeat2 + 2 * k;
            costList.add(costextra);
        }
        for (int i = 0; i < n - 1; i++) {
            int[] leftarr = new int[i + 1];
            int zz = 0;
            for (int j = 0; j < leftarr.length; j++, zz++)
                leftarr[j] = arr[zz];
            int[] rightarr = new int[n - leftarr.length];
            for (int j = 0; j < rightarr.length; j++, zz++)
                rightarr[j] = arr[zz];
            int repeat1=RepeatCounter(leftarr);
            int repeat2=RepeatCounter(rightarr);
            int costExtra=2*k+repeat1+repeat2;
            costList.add(costExtra);
        }
        int tableCount = 1;
        int index = 0;
        while (repeats != 0) {
            repeats = 0;
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int i = index; i < n; i++) {
                if (count.containsKey(arr[i])) {
                    index = i;
                    tableCount++;
                    break;
                } else
                    count.put(arr[i], 1);
            }
            count.clear();
            for (int i = index; i < n; i++) {
                if (count.containsKey(arr[i]))
                    count.put(arr[i], count.get(arr[i]) + 1);
                else
                    count.put(arr[i], 1);
            }
            for (Map.Entry entry : count.entrySet()) {
                int val = (int) entry.getValue();
                if (val > 1)
                    repeats = repeats + val;
            }
            int l = (tableCount * k) + repeats;
            costList.add(l);
        }
        if (costList.size() != 0) {
            Collections.sort(costList);
            System.out.println(costList.get(0));
        } else
            System.out.println(costprim);
    }

    public static int RepeatCounter(int[] arr) {
        int repeats = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int j : arr) {
            if (hmap.containsKey(j))
                hmap.put(j, hmap.get(j) + 1);
            else
                hmap.put(j, 1);
        }
        for (Map.Entry entry : hmap.entrySet()) {
            int val = (int) entry.getValue();
            if (val > 1)
                repeats += val;
        }
        return repeats;
    }
}