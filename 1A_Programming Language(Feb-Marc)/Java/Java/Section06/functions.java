class functions {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");

        int value3 = addTwo(12, 56);

        System.out.println(value3);
    }

    static int addTwo(int a, int b) {
        int sum = a + b;
        return sum;
    }
}