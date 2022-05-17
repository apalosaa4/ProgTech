package recipes_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel directionsLbl;
    private JTextArea directionsTa;
    private JButton upload_btn;
    private JButton homepage_btn;
    private JPanel newRecipe_panel;
    private JTextField ingredientsNameTf;
    private JButton plusIngredientBtn;
    private JScrollPane ingredientsScrollPane;
    private JComboBox measurementComboBox;

    public NewRecipe(){
        setContentPane(newRecipe_panel);
        setTitle("New Recipe");
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

        upload_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //...
            }
        });

        plusIngredientBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField plusIngredientTf = new JTextField();
                //...
            }
        });
    }
}
