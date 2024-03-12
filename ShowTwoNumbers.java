import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String notificationString = "You've just entered ";
        strNum1 = JOptionPane.showInputDialog(null, "please enter the first number", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "please enter the second number", JOptionPane.INFORMATION_MESSAGE);
        notificationString += strNum2 + " .";
        JOptionPane.showMessageDialog(null, notificationString, "Show Two Numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
