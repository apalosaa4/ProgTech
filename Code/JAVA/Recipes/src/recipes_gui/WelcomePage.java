package recipes_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage {
    private JButton NewRecipe;
    private JPanel WelcomePage;
    private JButton SearchRecipe;
    private JLabel WelcomeLabel;

    public WelcomePage() {
        NewRecipe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Valami");
            }
        });

        JFrame frame = new JFrame("Recipe Searcher");
        frame.add(WelcomePage, BorderLayout.CENTER);
        frame.setContentPane(WelcomePage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
