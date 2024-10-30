/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sum.and.average;

import javax.swing.JOptionPane;
/*
 * Name: Joseph Karl V. Boncavil
 * Course: Computer Engineering - Section 1
 * Lab Activity: Array Implementation and For Loop Practice - Problem 3
 * Submission Date: October 24, 2024
 */
public class reversearray {
    public static void main(String[] args) {
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++) {
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
//Building a message for the message box
        StringBuilder result = new StringBuilder("You entered the following values:\n");
        for (double num : numbers) {
            result.append(formatDouble(num)).append(" ");
        }
//Building string for output
StringBuilder output = new StringBuilder("The reverse of the array :\n");
        for (int a = 4; a >= 0; a--) {
            output.append(formatDouble(numbers[a])).append(" ");
        }
        //Building a final message for the message box
JOptionPane.showMessageDialog(null, result +"\n"+output);
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