package Classes;

import Exceptions.IngredientsAmountCannotBeEmpty;
import Exceptions.IngredientsAmountTooShortException;
import Exceptions.IngredientsNameCannotBeEmptyException;
import Exceptions.IngredientsNameTooShortException;

import javax.swing.*;

import static java.util.Objects.isNull;

public class IngredientsClass {
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
            throw new IngredientsNameTooShortException();
        }
        if (isNull(ingredientsName)){
            JOptionPane.showMessageDialog(null,
                    "Ingredient name cannot be null.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new IngredientsNameCannotBeEmptyException();
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
            throw new IngredientsAmountTooShortException();
        }
        if (isNull(amount))
        {
            JOptionPane.showMessageDialog(null,
                    "The amount of the ingredient cannot be null",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new IngredientsAmountCannotBeEmpty();
        }

        else
        {
            this.amount = amount;
        }
    }

    public IngredientsClass(String ingredientsName, int amount){
        createId();
        if (ingredientsName.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the ingredients name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new IngredientsNameTooShortException();
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
            throw new IngredientsAmountTooShortException();
        }
        if (isNull(amount))
        {
            JOptionPane.showMessageDialog(null,
                    "The amount of the ingredient cannot be null",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new IngredientsAmountCannotBeEmpty();
        }
        else
        {
            this.amount = amount;
        }
    }
}
