
import javax.swing.*;
import java.util.Scanner;

public class CrackerService {
    public static void main(String[] args) {
        CrackerFactory crackerFactory = new CrackerFactory();
        Scanner sc = new Scanner(System.in);
        String mdp;
        mdp = JOptionPane.showInputDialog("Enter password : ");
        int type =Integer.parseInt(JOptionPane.showInputDialog("Make a choice : \n1) Brute Force\n2) Dictionnaire"));
        Cracker cracker = crackerFactory.createAlgorithm(type);
        double start = System.currentTimeMillis();
        cracker.hack(mdp);
        double end = System.currentTimeMillis();
        System.out.println();
        JOptionPane.showMessageDialog(null, "temp :" + (end - start) / 1000 + "s");
    }
}