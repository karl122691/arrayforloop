/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.and.average;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class SumAndAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[10];
        double sum = 0;
        double ave = 0;
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
                    numbers[i] = Integer.parseInt(val.trim());  // Parse valid input
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
//adding all the numbers in the array
        for (double add : numbers) {
            sum += add;
        }
//computing the average
        ave = sum / 10;
        //Building the final message for the message box
        String messagesumave = result + "\nThe sum of all values is:" + formatDouble(sum) + "\nand average of all values is:" + formatDouble(ave);
        //displaying the message
        JOptionPane.showMessageDialog(null, messagesumave);
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
