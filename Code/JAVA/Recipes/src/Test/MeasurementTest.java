package Test;

import Classes.IngredientsClass;
import Classes.Measurement;
import Exceptions.IngredientsNameTooShortException;
import Exceptions.MeasurementIDCannotBeEmptyException;
import Exceptions.MeasurementNameCannotBeEmptyException;
import Exceptions.MeasurementNameTooShortException;
import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {
    @Test
    public void getMeasurementIDSameMeasurement()
    {
        Measurement testMeasurementID = new Measurement(1,2, "testMeasurementName");
        Assert.assertEquals(1, testMeasurementID.getMeasurementId());
    }

    @Test
    public void getMeasurementNameSameMeasurement()
    {
        Measurement testMeasurementName = new Measurement(1,2, "testMeasurementName");
        Assert.assertEquals("testMeasurementName", testMeasurementName.getMeasurementName());
    }

    //Amount test

    @Test
    public void MeasurementIDCannotBeEmptyException(){
        Exception exception = Assert.assertThrows(MeasurementIDCannotBeEmptyException.class, () ->{
            Measurement testMeasurementID = new Measurement(0, 3, " ");
        });
    }
    @Test
    public void MeasurementNameTooShortException(){
        Exception exception = Assert.assertThrows(MeasurementNameTooShortException.class, () ->{
            Measurement testMeasurementName = new Measurement(3, 6, "Dk");
        });
    }
}
