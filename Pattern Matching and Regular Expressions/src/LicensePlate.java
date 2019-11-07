import javax.swing.*;

    /**
     * Created by hp on 9/21/2019.
     */
    public class LicensePlate {
        private static final String STOP = "0";
        private static final String VALID = "Valid License plate number";
        private static final String INVALID = "Not License plate number";

        private static final String VALID_LICENSE_PLATE_PATTERN
            = "[A-Za-z]{2}[0-9]{4}[a-zA-Z]{3}";

    // = "[0-9]{3}-[0-9]{3}-[0-9]{4}";

    // = "\\d{3}-\\d{3}-\\d{4}";

    public static void main(String[] args) {

        String LicensePlateStr, reply;

        while (true) {

            LicensePlateStr = JOptionPane.showInputDialog(null, "License Plate#:");

            if (LicensePlateStr.equals(STOP)) break;

            if (LicensePlateStr.matches(VALID_LICENSE_PLATE_PATTERN)) {
                reply = VALID;

            } else {
                reply = INVALID;
            }

            JOptionPane.showMessageDialog(null, reply + "\n" +
                            LicensePlateStr + "\n" +
                            LicensePlateStr.replaceAll("\\D", "eight")
            );
        }
    }
}
