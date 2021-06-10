public class test {
    private static int[] foo(int[] arr) {
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

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {1, 2, 3, 4};
        int[] res = foo(arr);
        for (int re : res) {
//            System.out.println("res[" + i + "] = " + res[i]);
            System.out.print(re + " ");
        }
    }

}
