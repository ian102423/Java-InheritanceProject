import java.time.LocalDateTime;

public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        this.status = "Waiting...";
    }

    protected void printSome(){
        System.out.println("Hello, This is protected method that's from ParentClass but will called out from ChildClass ಥ_ಥ");
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

    // transport ::: method is to be overridden by a subclass
    public abstract void transport() throws NoTransportException;

    // public method that prints out (System.out.println) the protected variable
    public void showStatus(){
        System.out.println(status);
    }
}
