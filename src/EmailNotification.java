import java.lang.CloneNotSupportedException;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body) {
        super(subject, body);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (!getRecipient().equals(that.getRecipient())) return false;
        return getSmtpProvider().equals(that.getSmtpProvider());
    }

    @Override
    public int hashCode() {
        int result = getRecipient().hashCode();
        result = 31 * result + getSmtpProvider().hashCode();
        return result;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    //TODO: In EmailNotification override the method
    public void printSome() {
        System.out.println("Hello, This is protected method that's :::NOT::: from ParentClass but called out from ChildClass ^~^");
    }

    @Override
    public void transport() {
        getSubject();
        getBody();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new EmailNotification(getSubject(), getBody());
    };
}
