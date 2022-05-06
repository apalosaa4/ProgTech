package recipes_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchByIngredients extends JFrame{

    private JPanel searchByIngredients_panel;
    private JTextField ingredient_1;
    private JTextField ingredient_2;
    private JTextField ingredient_3;
    private JTextField ingredient_4;
    private JTextField ingredient_5;
    private JTextField ingredient_6;
    private JTextField ingredient_7;
    private JButton search_btn;
    private JCheckBox MilkFreeCheck;
    private JCheckBox GlutenFreeCheck;
    private JCheckBox VeganCheck;
    private JButton homePage_btn;

    public SearchByIngredients(){
        setContentPane(searchByIngredients_panel);
        setTitle("Search By Ingredients");
        setVisible(true);
        setSize(550,400);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        search_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectedRecipes selectedRecipes = new SelectedRecipes();
                dispose();
            }
        });

        homePage_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomePage welcomePage = new WelcomePage();
                dispose();
            }
        });
    }
}
