package task3904;

/*
Лестница
*/
public class Solution {
    private static int n = 70;

    public static void main(String[] args) {
        System.out.println("The number of possible ascents for " + n + " steps is: " + numberOfPossibleAscents(n));
    }

    public static long numberOfPossibleAscents(int n) {
        if (n == 0 || n == 1) return 1;
        if (n < 0) return 0;
        long result = 0;
        long[] list = new long[n+1];
        list[0] = 1;
        list[1] = 1;
        list[2] = 2;
        for (int i = 3; i < n+1; i++) {
            result = list[i-3] + list[i-2] + list[i-1];
            list[i] = result;
        }
        return result;
    }
}

