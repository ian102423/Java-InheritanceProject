public class Main {
    public static void main(String[] args) {

        EmailNotification eNoti = new EmailNotification("x", "y", "z", "i");
        TextNotification tNoti = new TextNotification("x", "y");

        callEverythihg(eNoti, tNoti);

        // clone clone clone clone clone
        try {
            System.out.println("\nCloning...");
            Object emailNotificationClone = eNoti.clone();
            System.out.println("Clone == Clone: " + emailNotificationClone.equals(eNoti));
            System.out.println("OG Noti: " + eNoti);
            System.out.println("Clone: " + emailNotificationClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void callEverythihg(EmailNotification eNoti, TextNotification tNoti) {
        eNoti.transport();
        eNoti.getRecipient();
        eNoti.getSmtpProvider();

        tNoti.transport();
        tNoti.getRecipient();
        tNoti.getSmsProvider();

        tNoti.printSome();// subclass can call the method in its constructor or in any instance method
        eNoti.printSome();// In the overridden method print out some more text after the original text from

        eNoti.status = "new status";
    }
}

