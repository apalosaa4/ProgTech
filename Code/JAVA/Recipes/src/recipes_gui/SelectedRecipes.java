package recipes_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectedRecipes extends JFrame{
    private JButton button1;
    private JPanel selectedRecipes_panel;
    private JLabel RecipesLbl;
    private JList recipesList;
    private JButton homePage;
    private JButton goRecipeBtn;

    public SelectedRecipes() {
        /*button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Valami");
            }
        });*/
        /*JFrame frame = new JFrame("Recipes");
        frame.setContentPane(new SelectedRecipes().selectedRecipes_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);*/
        setContentPane(selectedRecipes_panel);
        setTitle("Recipe Searcher");
        setVisible(true);
        setSize(550,400);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
    }
}
