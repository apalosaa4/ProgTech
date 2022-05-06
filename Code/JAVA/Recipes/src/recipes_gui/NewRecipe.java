package recipes_gui;

import javax.swing.*;

public class NewRecipe extends JFrame{
    private JLabel addNewRecipeLbl;
    private JLabel recipeNameLbl;
    private JTextField recipeNameTf;
    private JLabel freeLbl;
    private JCheckBox glutenFreeCb;
    private JCheckBox milkFreeCb;
    private JCheckBox veganCb;
    private JLabel glutenFreeLbl;
    private JLabel veganLbl;
    private JLabel milfFreeLbl;
    private JLabel ingredientsLbl;
    private JList ingredientsList;
    private JLabel directionsLbl;
    private JTextArea directionsTa;
    private JButton upload_btn;
    private JButton homepage_btn;
    private JPanel newRecipe_panel;


    public NewRecipe(){
        setContentPane(newRecipe_panel);
        setTitle("Recipe Searcher");
        setVisible(true);
        setSize(550,400);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
