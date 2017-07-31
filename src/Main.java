public class Main {
    public static void main(String[] args) {

        Notification noti = new Notification("x", "y");
        EmailNotification eNoti = new EmailNotification("x", "y");
        TextNotification tNoti = new TextNotification("x", "y");

        eNoti.transport();
        eNoti.getRecipient();
        eNoti.getSmtpProvider();

        tNoti.transport();
        tNoti.getRecipient();
        tNoti.getSmsProvider();

        tNoti.printSome();//TODO: subclass can call the method in its constructor or in any instance method
        eNoti.printSome();//TODO: In the overridden method print out some more text after the original text from

        eNoti.status = "new status";

        eNoti.equals(eNoti);//TODO: check of the clone and the original instance are equal by calling the equals()
    }
}
