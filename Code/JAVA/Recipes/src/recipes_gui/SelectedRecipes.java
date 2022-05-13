package recipes_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectedRecipes extends JFrame{
    private JButton button1;
    private JPanel selectedRecipes_panel;
    private JLabel RecipesLbl;
    private JList recipesList;
    private JButton homepage_btn;
    private JButton goRecipeBtn;

    public SelectedRecipes() {
        setContentPane(selectedRecipes_panel);
        setTitle("Selected Recipes");
        setVisible(true);
        setSize(550,400);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        homepage_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomePage welcomePage = new WelcomePage();
                dispose();
            }
        });

        goRecipeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RecipeDescription recipeDescription = new RecipeDescription();
                dispose();
            }
        });
    }

    public static void main(String[] args){
    }
}
