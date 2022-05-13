package Observer;

import javax.swing.*;

public class IngredienstClass {
    private char ingredientsId;
    public char getIngredientsId()
    {
        return ingredientsId;
    }
    private String ingredientsName;
    public String getingredientsName()
    {
        return ingredientsName;
    }
    public void setIngredientsName(String s)
    {
        if (s.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the ingredients name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.ingredientsName = s;
        }
    }
}
