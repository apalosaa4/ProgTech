package Classes;

import javax.swing.*;

public class IngredienstClass {
    private static long ingredientsId = 0;
    public long getIngredientsId()
    {
        return ingredientsId;
    }
    public static synchronized String createId()
    {
        return String.valueOf(ingredientsId++);
    }
    private String ingredientsName;
    public String getingredientsName()
    {
        return ingredientsName;
    }
    public void setIngredientsName(String s) {
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
    private int amount;
    public int getAmount(){return amount;}
    public void setAmount(int a){
        if (a > 0){
            JOptionPane.showMessageDialog(null,
                    "The amount of the ingredient should not be zero or less.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public IngredienstClass(String ingredientsName, int amount){
        createId();
        setIngredientsName(ingredientsName);
        setAmount(amount);
    }
}
