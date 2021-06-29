public class test {

    private static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i=n-1; i>=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;

        return arr;
    }

    private static int[] productExceptIdx(int[] arr) {
        int[] result = new int[arr.length];
        int product = 1;
        for (int j : arr) {
            product *= j; // product of all numbers in arr[]
        }
        for (int i=0; i<arr.length; i++) {
            result[i] = product / arr[i];
        }
        return result;
    }

    private static int lengthOfLastWord(String s) {
        int n = s.length();

        if (s.equals(" "))   return 0;
        if (!s.contains(" "))   return n;

        int i = n-1;

        while (s.charAt(i) == ' ') {
            if (i == 0) return 0;
            i--;
        }

        int count=0;
        while (i >= 0) {
            if (s.charAt(i) == ' ') break;
            count++;
            i--;
        }

        return count;

//        One line solution
//        return s.trim().length()-s.trim().lastIndexOf(' ')-1
    }

    private static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {9, 9, 9, 9};
        printArray(plusOne(arr));
        String s = "    Hello           World       ";
        System.out.println(lengthOfLastWord(s));
        System.out.println(s.trim().length()-s.trim().lastIndexOf(' ')-1);
    }

}
