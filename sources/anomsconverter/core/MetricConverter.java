package anomsconverter.converters;

import anomsconverter.core.ConverterInterface;

public class MetricConverter implements ConverterInterface {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        fromUnit = fromUnit.toLowerCase();
        toUnit = toUnit.toLowerCase();

        // Length Conversions
        if (isLengthUnit(fromUnit) && isLengthUnit(toUnit)) {
            return convertLength(value, fromUnit, toUnit);
        }
        // Weight Conversions
        else if (isWeightUnit(fromUnit) && isWeightUnit(toUnit)) {
            return convertWeight(value, fromUnit, toUnit);
        }

        return -1; // Indicates an invalid conversion
    }

    private boolean isLengthUnit(String unit) {
        return unit.equals("meters") || unit.equals("kilometers") || unit.equals("centimeters") || unit.equals("millimeters");
    }

    private boolean isWeightUnit(String unit) {
        return unit.equals("grams") || unit.equals("kilograms");
    }

    private double convertLength(double value, String fromUnit, String toUnit) {
        // Convert everything to meters first for simplicity
        double meters;
        switch (fromUnit) {
            case "kilometers":
                meters = value * 1000;
                break;
            case "centimeters":
                meters = value / 100;
                break;
            case "millimeters":
                meters = value / 1000;
                break;
            default: // meters
                meters = value;
                break;
        }
        // Convert from meters to the target unit
        switch (toUnit) {
            case "kilometers":
                return meters / 1000;
            case "centimeters":
                return meters * 100;
            case "millimeters":
                return meters * 1000;
            default: // meters
                return meters;
        }
    }

    private double convertWeight(double value, String fromUnit, String toUnit) {
        // Convert everything to grams first
        double grams;
        if (fromUnit.equals("kilograms")) {
            grams = value * 1000;
        } else { // grams
            grams = value;
        }

        // Convert from grams to the target unit
        if (toUnit.equals("kilograms")) {
            return grams / 1000;
        } else { // grams
            return grams;
        }
    }
}
