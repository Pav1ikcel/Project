import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final String LOG_FILE = "calculator_log.txt";

    public void log(String message) {
        String logMessage = getCurrentDateTime() + " " + message;
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(logMessage + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}
