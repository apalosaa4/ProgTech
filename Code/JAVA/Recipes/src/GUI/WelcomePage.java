package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {
    private JButton newRecipe_btn;
    private JPanel WelcomePage_panel;
    private JButton searchRecipe_btn;
    private JLabel WelcomeLabel;

    public WelcomePage() {
        JFrame frame = new JFrame("Recipe Searcher");
        frame.add(WelcomePage_panel, BorderLayout.CENTER);
        frame.setContentPane(WelcomePage_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        newRecipe_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewRecipe newRecipe = new NewRecipe();
                dispose();
            }
        });

        searchRecipe_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchByIngredients searchByIngredients = new SearchByIngredients();
                dispose();
            }
        });
    }
}
