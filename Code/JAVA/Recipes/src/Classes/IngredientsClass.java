package Classes;

import Exceptions.IngredientsAmountCannotBeEmpty;
import Exceptions.IngredientsAmountTooShortException;
import Exceptions.IngredientsNameCannotBeEmptyException;
import Exceptions.IngredientsNameTooShortException;

import javax.swing.*;

import java.util.ArrayList;

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
            this.ingredientsName = ingredientsName;
    }

    public int getAmount(){ return amount; }
    public void setAmount(int amount){
        if (amount <= 0)
        {
            JOptionPane.showMessageDialog(null,
                    "The amount of the ingredient should not be zero or less.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new IngredientsAmountTooShortException();
        }
            this.amount = amount;
    }

    public IngredientsClass(String ingredientsName, int amount){
        createId();
        setIngredientsName(ingredientsName);
        setAmount(amount);
    }

    private ArrayList<IngredientsClass> ingredients = new ArrayList<IngredientsClass>();

    public void AddRecipes(IngredientsClass e)
    {
        if (!e.equals(null))
        {
            ingredients.add(e);
        }
    }

    public void ListRecipes()
    {
        for(int i = 0; i < ingredients.size(); i++)
        {
            System.out.println(ingredients.get(i).getIngredientsId() + " "
                    + ingredients.get(i).getingredientsName() + " "
                    + ingredients.get(i).getAmount());
        }
    }

    public void DeleteByName(String name)
    {
        for(int i = 0; i < ingredients.size(); i++)
        {
            if(ingredients.get(i).getingredientsName() == name)
            {
                ingredients.remove(i);
            }
        }
    }
}
