class strongornot {
    public static void main(String args[]) {
        int num = 123;
        int originalNum = num;  // Store the original number for comparison
        int sum = 0;
        while (num > 0) {
            int r = num % 10;  // Get the last digit
            num = num / 10;    // Remove the last digit
            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;  // Compute factorial
            }
            sum = sum + fact;  // Add factorial to sum
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is a strong number");
        } else {
            System.out.println(originalNum + " is not a strong number");
        }
    }
}

