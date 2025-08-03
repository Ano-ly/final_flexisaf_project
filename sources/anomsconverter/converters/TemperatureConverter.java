package anomsconverter.converters;

import anomsconverter.core.ConverterInterface;

//TemperatureConverter class
public class TemperatureConverter implements ConverterInterface {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        fromUnit = fromUnit.toLowerCase();
        toUnit = toUnit.toLowerCase();

        if (fromUnit.equals("celsius")) {
            if (toUnit.equals("fahrenheit")) {
                return (value * 9/5) + 32;
            } else if (toUnit.equals("kelvin")) {
                return value + 273.15;
            }
        } else if (fromUnit.equals("fahrenheit")) {
            if (toUnit.equals("celsius")) {
                return (value - 32) * 5/9;
            } else if (toUnit.equals("kelvin")) {
                return ((value - 32) * 5/9) + 273.15;
            }
        } else if (fromUnit.equals("kelvin")) {
            if (toUnit.equals("celsius")) {
                return value - 273.15;
            } else if (toUnit.equals("fahrenheit")) {
                return ((value - 273.15) * 9/5) + 32;
            }
        }
        return -1;
    }
}
