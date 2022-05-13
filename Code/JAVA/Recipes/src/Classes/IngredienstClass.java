package Classes;

import javax.swing.*;

public class IngredienstClass {
    private static long ingredientsId = 0;
    private String ingredientsName;
    private int amount;

    public long getIngredientsId()
    {
        return ingredientsId;
    }

    public static synchronized String createId()
    {
        return String.valueOf(ingredientsId++);
    }

    public String getingredientsName()
    {
        return ingredientsName;
    }

    public void setIngredientsName(String ingredientsName) {
        if (ingredientsName.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the ingredients name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.ingredientsName = ingredientsName;
        }
    }

    public int getAmount(){ return amount; }
    public void setAmount(int amount){
        if (amount < 0)
        {
            JOptionPane.showMessageDialog(null,
                    "The amount of the ingredient should not be zero or less.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.amount = amount;
        }
    }

    public IngredienstClass(String ingredientsName, int amount){
        createId();
        if (ingredientsName.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the ingredients name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.ingredientsName = ingredientsName;
        }
        if (amount < 0){
            JOptionPane.showMessageDialog(null,
                    "The amount of the ingredient should not be zero or less.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.amount = amount;
        }
    }
}
