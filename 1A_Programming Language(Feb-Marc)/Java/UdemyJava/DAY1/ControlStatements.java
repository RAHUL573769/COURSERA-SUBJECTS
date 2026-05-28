public class ControlStatements {

    public static void main(String[] args) {

        double kilometers = (100 * 1.899);

        System.out.println(kilometers);

        int highScore = 50;

        if (highScore > 30) {
            highScore = 1000 + highScore;
        }

        if (highScore > 100) {
            System.out.println("You are a winner " + highScore);
        }
    }
}