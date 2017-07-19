import javax.xml.soap.Text;

public class Main {
    public static void main(String[] args) {
        EmailNotification eNoti = new EmailNotification("x", "y");
        TextNotification tNoti = new TextNotification("x", "y");

        eNoti.transport();
        tNoti.transport();
    }
}
