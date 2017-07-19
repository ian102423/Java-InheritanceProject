import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;

    public Notification(String subject, String body) {
        createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    //TODO: transport
}
