public class EmailNotification extends Notification{

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body){
        super(subject, body);

    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    public void transport(){
        getSubject();
        getBody();
    }
}
