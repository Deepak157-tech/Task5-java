public class LogAnalyzer {
    public static void main(String[] args) {
        String log = """
                INFO: Server started
                ERROR: Database failed
                INFO: User login
                ERROR: Null pointer exception
                """;

        String[] lines = log.split("\n");
        int count = 0;

        for (String line : lines) {
            if (line.contains("ERROR")) {
                count++;
            }
        }

        System.out.println("Total ERROR lines: " + count);
    }
}
