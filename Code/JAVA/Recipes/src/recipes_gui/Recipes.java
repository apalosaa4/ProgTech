package recipes_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Recipes {
    private JButton button1;
    private JPanel mainPanel;

    public Recipes() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Valami");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Recipes");
        frame.setContentPane(new Recipes().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
