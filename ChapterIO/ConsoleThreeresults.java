package ChapterIO;

import java.io.Console;

public class ConsoleThreeresults {
    public static void main(String... robots) {
        Console c = System.console();
        final String response = c.readLine("Are you human ? ");
                System.err.print(response);
    }
}
