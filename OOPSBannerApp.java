public class OOPSBannerApp {
    public static void main(String args[]) {
        // UC5: Combining array declaration and initialization with String.join()
        // This removes repetitive individual assignment lines
        String[] banner = {
            String.join(" ", " ****** ", " ****** ", " ****** ", " ****** "),
            String.join(" ", "**    **", "**    **", "**    **", "**      "),
            String.join(" ", "**    **", "**    **", "**    **", "**      "),
            String.join(" ", "**    **", "**    **", "**    **", "**      "),
            String.join(" ", "**    **", "**    **", " ****** ", " ****** "),
            String.join(" ", "**    **", "**    **", "**      ", "      **"),
            String.join(" ", "**    **", "**    **", "**      ", "      **"),
            String.join(" ", "**    **", "**    **", "**      ", "      **"),
            String.join(" ", " ****** ", " ****** ", "**      ", " ****** ")
        };

        // UC5: Use an enhanced for loop to iterate through the array efficiently
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
