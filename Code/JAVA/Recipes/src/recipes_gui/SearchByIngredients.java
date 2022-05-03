package recipes_gui;

import javax.swing.*;
import java.awt.*;

public class SearchByIngredients extends JPanel{

    private JPanel NewRecipe;
    private JTextField ingredient_1;
    private JTextField ingredient_2;
    private JTextField ingredient_3;
    private JTextField ingredient_4;
    private JTextField ingredient_5;
    private JTextField ingredient_6;
    private JTextField ingredient_7;
    private JButton SearchButton;
    private JCheckBox MilkFreeCheck;
    private JCheckBox GlutenFreeCheck;
    private JCheckBox VeganCheck;

    public SearchByIngredients(){
        JFrame NewRecipe = new JFrame("New Recipe");
        NewRecipe.add(NewRecipe, BorderLayout.CENTER);
        NewRecipe.setContentPane(NewRecipe);
        NewRecipe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NewRecipe.pack();
        NewRecipe.setLocationRelativeTo(null);
        NewRecipe.setVisible(true);
    }
}
