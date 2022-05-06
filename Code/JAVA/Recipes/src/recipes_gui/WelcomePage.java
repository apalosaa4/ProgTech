package recipes_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {
    private JButton newrecipe_btn;
    private JPanel WelcomePage;
    private JButton searchrecipe_btn;
    private JLabel WelcomeLabel;

    public WelcomePage() {
        JFrame frame = new JFrame("Recipe Searcher");
        frame.add(WelcomePage, BorderLayout.CENTER);
        frame.setContentPane(WelcomePage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        newrecipe_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewRecipe newRecipe = new NewRecipe();
            }
        });

        searchrecipe_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectedRecipes selectedRecipes = new SelectedRecipes();
            }
        });
    }
}
