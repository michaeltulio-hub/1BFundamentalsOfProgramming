import java.util.Arrays; // Ini-import ang Arrays class para magamit ang deepToString() method.

public class Array1 {
    public static void main(String[] args) {

        // Gumagawa at naglalagay ng mga pangalan sa isang 2D String array.
        String[][] seats = {
                {"Alice", "Bob", "Charlie"}, // Ito ang unang row na naglalaman ng tatlong pangalan.
                {"David", "Emma", "Frank"}   // Ito ang pangalawang row na naglalaman ng tatlong pangalan.
        };

        // Ipinapakita ang pangalan ng taong nakaupo sa second row at third column.
        System.out.println("Person in second row, third column: " + seats[1][2]);

        // Pinapalitan ang pangalan ni Bob ng Vacant.
        seats[0][1] = "Vacant";

        // Ipinapakita ang buong seating arrangement sa isang linya gamit ang Arrays.deepToString().
        System.out.println("Updated seating arrangement: " + Arrays.deepToString(seats));
    }
}
