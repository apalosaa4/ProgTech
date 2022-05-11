package Observer;

import org.w3c.dom.Text;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RecipesClass {
    private String recipeName;
    public String getRecipeName()
    {
        return recipeName;
    }
    public void setRecipeName(String s)
    {
        if (s.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the recipe's name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.recipeName = s;
        }
    }

    private String freefromName;
    public String getFreefromName()
    {
        return freefromName;
    }
    public void setFreefromName(String s)
    {
        if (s.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the ingredient's name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.freefromName = s;
            notifyAllObservers();
        }
    }

    private Text description;
    public Text getDescription()
    {
        return description;
    }
    public void setRecipeName(Text t)
    {
        if (t.getLength() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the description must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.description = t;
        }
    }

    public RecipesClass(String recipeName, String freefromName, Text description)
    {
        if (recipeName.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the recipe's name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.recipeName = recipeName;
        }

        if (freefromName.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the ingredient's name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.freefromName = freefromName;
        }

        if (description.getLength() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the description must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            this.description = description;
        }

    }

    private List<Observer> observers = new ArrayList<Observer>();
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.sendMessage();
        }
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    private ArrayList<RecipesClass> recipes = new ArrayList<RecipesClass>();

    public void AddRecipes(RecipesClass e)
    {
        if (!e.equals(null))
        {
            recipes.add(e);
        }
    }

    public void ListRecipes()
    {
        for(int i = 0; i < recipes.size(); i++)
        {
            System.out.println(recipes.get(i).getRecipeName() + " "
                    + recipes.get(i).getFreefromName() + " "
                    + recipes.get(i).getDescription());
        }
    }

    public void DeleteByName(String name)
    {
        for(int i = 0; i < recipes.size(); i++)
        {
            if(recipes.get(i).getRecipeName() == name)
            {
                recipes.remove(i);
            }
        }
    }
}
