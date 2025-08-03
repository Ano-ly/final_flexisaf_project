# AnomsConverter - Temperature and Metric Unit Conversion Tool

## Description

AnomsConverter is a Java-based command-line utility that provides accurate unit conversion capabilities for temperature and metric measurements. Built with a modular architecture using interfaces and separate converter classes, this tool offers a user-friendly interface for converting between different units of measurement.

## Features

### 🌡️ Temperature Conversion
- **Supported Units**: Celsius, Fahrenheit, Kelvin
- **Conversion Capabilities**:
  - Celsius ↔ Fahrenheit
  - Celsius ↔ Kelvin  
  - Fahrenheit ↔ Kelvin
- **Accurate Formulas**: Uses standard conversion formulas with precise calculations

### 📏 Metric Unit Conversion
- **Length Units**: meters, kilometers, centimeters, millimeters
- **Weight Units**: grams, kilograms
- **Conversion Capabilities**:
  - All length-to-length conversions (e.g., km to m, cm to mm)
  - All weight-to-weight conversions (e.g., kg to g)
  - Cross-category conversions are not supported (e.g., length to weight)

### 🛠️ Technical Features
- **Modular Design**: Uses interface-based architecture for extensibility
- **Error Handling**: Robust input validation and error messages
- **User-Friendly Interface**: Interactive command-line menu system
- **Precision**: Results displayed with 2 decimal places for accuracy

## How to Use

### Prerequisites
- Java Runtime Environment (JRE) 8 or higher
- Command line/terminal access

### Running the Program

1. **Navigate to the project directory**:
   ```bash
   cd final_flexisaf_project
   ```

2. **Compile the Java files** (if not already compiled):
   ```bash
   javac -d classes sources/anomsconverter/**/*.java
   ```

3. **Run the program**:
   ```bash
   java -cp classes anomsconverter.userinterface.AnomsConverter
   ```

### Usage Instructions

1. **Start the Program**: The program will display a welcome message and main menu.

2. **Select Conversion Type**:
   - Enter `1` for Temperature conversion
   - Enter `2` for Metric Units conversion
   - Enter `3` to exit the program

3. **Temperature Conversion**:
   - Enter the numerical value to convert
   - Enter the initial unit (Celsius, Fahrenheit, or Kelvin)
   - Enter the target unit (Celsius, Fahrenheit, or Kelvin)
   - View the conversion result

4. **Metric Conversion**:
   - Enter the numerical value to convert
   - Enter the initial unit (meters, kilometers, centimeters, millimeters, grams, kilograms)
   - Enter the target unit (same options as above)
   - View the conversion result

### Example Usage

```
Welcome to the AnomsConverter Tool!
Let's do some converting!

Please select a conversion type:
1. Temperature
2. Metric Units (Length/Weight)
3. Exit
Enter your choice (1, 2, or 3): 1

Temperature Conversion:
Enter the value: 25
Enter the initial unit (Celsius, Fahrenheit, Kelvin): Celsius
Enter the target unit (Celsius, Fahrenheit, Kelvin): Fahrenheit
25.00 Celsius is equal to 77.00 Fahrenheit
```

## Supported Conversions

### Temperature Conversions
| From | To | Formula |
|------|----|---------|
| Celsius | Fahrenheit | °F = (°C × 9/5) + 32 |
| Celsius | Kelvin | K = °C + 273.15 |
| Fahrenheit | Celsius | °C = (°F - 32) × 5/9 |
| Fahrenheit | Kelvin | K = (°F - 32) × 5/9 + 273.15 |
| Kelvin | Celsius | °C = K - 273.15 |
| Kelvin | Fahrenheit | °F = (K - 273.15) × 9/5 + 32 |

### Metric Conversions
**Length Units**:
- 1 kilometer = 1000 meters
- 1 meter = 100 centimeters
- 1 meter = 1000 millimeters

**Weight Units**:
- 1 kilogram = 1000 grams

## Project Structure

```
final_flexisaf_project/
├── classes/                    # Compiled Java classes
│   └── anomsconverter/
│       ├── converters/
│       │   ├── MetricConverter.class
│       │   └── TemperatureConverter.class
│       ├── core/
│       │   └── ConverterInterface.class
│       └── userinterface/
│           └── AnomsConverter.class
├── sources/                    # Source code
│   └── anomsconverter/
│       ├── converters/
│       │   ├── MetricConverter.java
│       │   └── TemperatureConverter.java
│       ├── core/
│       │   └── ConverterInterface.java
│       └── userinterface/
│           └── AnomsConverter.java
└── README.md
```

## Error Handling

The program includes comprehensive error handling for:
- Invalid menu selections
- Non-numerical input values
- Invalid unit names
- Incompatible conversion types (e.g., length to weight)

## Technical Architecture

- **ConverterInterface**: Defines the contract for all converter implementations
- **TemperatureConverter**: Handles all temperature-related conversions
- **MetricConverter**: Manages length and weight conversions with internal validation
- **AnomsConverter**: Main user interface class with menu system and input handling

## Contributing

This project follows a modular design pattern, making it easy to extend with new conversion types. To add a new converter:

1. Implement the `ConverterInterface`
2. Add the new converter to the main menu
3. Create appropriate conversion logic

## License

This project is part of the Final FlexiSAF Project assignment.
