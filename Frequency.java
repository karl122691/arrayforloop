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
public class Frequency {

    public static void main(String[] args) {

        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
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
                    if (numbers[i] > 1 && numbers[i] < 100) {//between 1 and 100
                        validInput = true;
                    }  // Exit loop if successful.
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

//validating values
        boolean validInput2 = false;
        double free = 0;
        while (!validInput2) {
            String fre = JOptionPane.showInputDialog("Enter the value to find the frequency");

            // Check for Cancel, closed dialog, or empty input
            if (fre == null || fre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Input cannot be empty. Please enter a value.");
                continue;  // Ask for input again
            }

            try {
                free = Double.parseDouble(fre.trim());  // Parse valid input
                validInput2 = true;  // Exit loop if successful
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Invalid input! Please enter a valid number.");
            }
        }
        //finding the frequency
        double freq = 0;
        for (double fer : numbers) {
            if (fer == free) {
                freq++;
            }

        }
//computing the average
        //Building the final message for the message box

        //displaying the message
        JOptionPane.showMessageDialog(null, result + "\nThe frequency of " + formatDouble(free) + " is " + formatDouble(freq));

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
