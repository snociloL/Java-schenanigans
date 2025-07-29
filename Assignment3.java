public class Assignment3 {

    // Student ID : 2024869478
    // Last 2 Digit from ID : 78
    private static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8}; 
    private static String str = "study"; 

    public static int sumArray(int[] arr, int idx) {
        
        if (idx >= arr.length)
            return 0;

        return arr[idx] + sumArray(arr, idx + 1);
    }

    public static boolean isPalindrome(String s, int left, int right) {
       
        if (left >= right)
            return true;
        if (s.charAt(left) != s.charAt(right)) 
            return false;
       
        return isPalindrome(s, left + 1, right - 1);
    }

    public static int countEvens(int[] arr, int idx) {
        
        if (idx >= arr.length) //if idx lebih dr array
            return 0;

        int currentCount = (arr[idx] % 2 == 0) ? 1 : 0;
        return currentCount + countEvens(arr, idx + 1);
    }

    public static void main(String[] args) {
        System.out.println("Personalized Data:");
        System.out.println("Array size (N): " + arr.length);
        System.out.println("String length (S): " + str.length());
        System.out.println("Array arr: " + java.util.Arrays.toString(arr));
        System.out.println("String str: \"" + str + "\"");
        System.out.println("\n--- Recursive Function Outputs ---");

        System.out.println("Sum of array elements: " + sumArray(arr, 0));
        System.out.println("Is \"" + str + "\" a palindrome? \n" + isPalindrome(str, 0, str.length() - 1));
        System.out.println("Number of even elements in array: " + countEvens(arr, 0));
    }
}