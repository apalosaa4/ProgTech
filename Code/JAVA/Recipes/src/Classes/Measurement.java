package Classes;

import Exceptions.*;

import javax.swing.*;

import static java.util.Objects.isNull;

public class Measurement {
    private static int measurementId;
    private String measurementName;
    private double measurementAmount;

    public static int getMeasurementId() {
        return measurementId;
    }

    public static void setMeasurementId(int measurementId) {
        if (measurementId == 0){
            JOptionPane.showMessageDialog(null,
                    "The ID cannot be zero.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new MeasurementIDCannotBeEmptyException();
        }
        Measurement.measurementId = measurementId;
    }

    public String getMeasurementName() {
        return measurementName;
    }

    public void setMeasurementName(String measurementName) {
        if (measurementName.length() < 3)
        {
            JOptionPane.showMessageDialog(null,
                    "The length of the measurement name must be at least 3 characters long!",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new MeasurementNameTooShortException();
        }
        this.measurementName = measurementName;
    }

    public double getMeasurementAmount() {
        return measurementAmount;
    }

    public void setMeasurementAmount(double measurementAmount) {
        if (measurementAmount < 0)
        {
            JOptionPane.showMessageDialog(null,
                    "The amount of measurement must not be less than zero.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new MeasurementAmountTooShortException();
        }
        if (measurementAmount == 0){
            JOptionPane.showMessageDialog(null,
                    "The amount of measurement cannot be zero.",
                    "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            throw new MeasurementAmountCannotBeEmptyException();
        }
        this.measurementAmount = measurementAmount;
    }

    public Measurement(int measurementId, double measurementAmount, String measurementName){
        setMeasurementId(measurementId);
        setMeasurementName(measurementName);
        setMeasurementAmount(measurementAmount);
    }
}
