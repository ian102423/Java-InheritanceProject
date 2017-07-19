public class TextNotification extends Notification{

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body) {
        super(subject, body);
    }

    public void transport(){
        getSubject();
        getBody();
    }
}
