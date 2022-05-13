package Test;

import Classes.IngredientsClass;
import Exceptions.IngredientsAmountTooShortException;
import Exceptions.IngredientsNameTooShortException;
import org.junit.Assert;
import org.junit.Test;

public class IngredientsTest {

    @Test
    public void getIngredientsNameSameIngredient()
    {
        IngredientsClass testIngredients = new IngredientsClass("testIngredientName", 1);
        Assert.assertEquals("testIngredientName", testIngredients.getingredientsName());
    }

    @Test
    public void getIngredientsNameOtherIngredient()
    {
        IngredientsClass testIngredients = new IngredientsClass("testIngredientName", 1);
        Assert.assertNotEquals("otherIngredietsName", testIngredients.getingredientsName());
    }

    @Test
    public void getPositiveAmount(){
        IngredientsClass testAmount = new IngredientsClass("Alma", 2);
        Assert.assertEquals(2, testAmount.getAmount());
    }

    @Test
    public void getNegativeAmount(){
        IngredientsClass testAmount = new IngredientsClass("Alma", 10);
        Assert.assertNotEquals(9, testAmount.getAmount());
    }

    @Test
    public void IngredientsAmountCannotBeEmpty(){

    }

    @Test
    public void IngredientsAmountTooShortException(){
        Exception exception = Assert.assertThrows(IngredientsAmountTooShortException.class, () ->{
            IngredientsClass testAmount = new IngredientsClass("Tej", -1);
        });
    }

    @Test
    public void IngredientsIDCannotBeEmptyException(){

    }

    @Test
    public void IngredientsNameCannotBeEmptyException(){

    }

    @Test
    public void IngredientsNameTooShortException(){
        Exception exception = Assert.assertThrows(IngredientsNameTooShortException.class, () ->{
            IngredientsClass testIngredientsName = new IngredientsClass("Al", 1);
        });
    }

}
