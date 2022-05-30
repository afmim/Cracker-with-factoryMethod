
import javax.swing.*;
import java.util.Arrays;

public class BruteForce implements Cracker{

    @Override
    public void hack(String mdp ) {
        char[] charset = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String tentative = new String();

        outerloop: for (int i = 0; i < charset.length; i++) {
            for (int j = 0; j < charset.length; j++) {
                for (int j2 = 0; j2 < charset.length; j2++) {
                    for (int k = 0; k < charset.length; k++) {
                        for (int k2 = 0; k2 < charset.length; k2++) {
                            tentative = "" + charset[i] + charset[j] + charset[j2] + charset[k] + charset[k2];

                            System.out.println(tentative);
                            if (tentative.equals(mdp)) {
                                System.out.println();
                                JOptionPane.showMessageDialog(null, "Your password is  : " + tentative);
                                break outerloop;
                            } else {
                                tentative = "";
                            }

                        }
                    }
                }
            }
        }
    }
}