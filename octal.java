class Octal {
    public static void main(String[] args) {
        int n = 15;
        StringBuilder octal = new StringBuilder();
        while (n > 0) {
            int x = n % 8;
            octal.insert(0, x);
            n = n / 8;
        }
        System.out.println("Equivalent Octal No: " + octal);
    }
}
