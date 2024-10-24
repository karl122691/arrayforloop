/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sum.and.average;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Minmax {

    public static void main(String[] args) {
        {

            double[] numbers = new double[15];
            for (int i = 0; i < 15; i++) {
                boolean validInput = false;
//validating values
                while (!validInput) {
                    String val = JOptionPane.showInputDialog(
                            "Enter an integer value for element " + (i + 1) + ":");

                    // Check for Cancel, closed dialog, or empty input
                    if (val == null || val.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "Input cannot be empty. Please enter a value.");
                        continue;  // Ask for input again
                    }

                    try {
                        numbers[i] = Double.parseDouble(val.trim());  // Parse valid input
                        validInput = true;  // Exit loop if successful
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                                "Invalid input! Please enter a valid number.");
                    }
                }
            }
//building string for final output
            StringBuilder result = new StringBuilder("You entered the following values:\n");
            for (double num : numbers) {
                result.append(formatDouble(num)).append(" ");
            }
            //finding the minimum
            double min = numbers[0];
            for (double minimum : numbers) {
                if (min > minimum) {
                    min = minimum;
                }
            }
            //finding the maximum
            double max = numbers[0];
            for (double maximum : numbers) {
                if (max < maximum) {
                    max = maximum;
                }
            }
            //building the final message
            String toolong = result + "\nThe minimum value in the array is " + formatDouble(min) + "\nThe maximum value in the array is " + formatDouble(max);
            JOptionPane.showMessageDialog(null, toolong);

        }

    }
// Method to format double values to remove the .0
private static String formatDouble(double value) {
        if (value == (long) value) {
            return String.format("%d", (long) value);
        } else {
            return String.format("%.2f", value);
        }
    }
}

