package recipes_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectedRecipes {
    private JButton button1;
    private JPanel mainPanel;

    public SelectedRecipes() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Valami");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Recipes");
        frame.setContentPane(new SelectedRecipes().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
