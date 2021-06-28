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

    private static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {9, 9, 9, 9};
        printArray(plusOne(arr));
    }

}
