package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecipeDescription extends JFrame{
    private JTextField Recipe_name;
    private JCheckBox GlutenFreeCheck;
    private JCheckBox MilkFreeCheck;
    private JCheckBox VeganCheck;
    private JList ingredientsList;
    private JTextArea directionsTa;
    private JButton homePage_btn;
    private JPanel recipeDirections_panel;

    public RecipeDescription(){
        setContentPane(recipeDirections_panel);
        setTitle("Recipe Directions");
        setVisible(true);
        setSize(550,400);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        homePage_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomePage welcomePage = new WelcomePage();
                dispose();
            }
        });
    }
}
