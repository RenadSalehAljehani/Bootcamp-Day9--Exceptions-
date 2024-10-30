import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /* Q1. Write a Java program to print the sum (addition), multiply, subtract,
         divide and remainder of two numbers , takes two numbers as input.  */

        // Header
        System.out.println("-------------------Q1-------------------");

        // 1. Create a Scanner object to take the user input (it will be used for all questions)
        Scanner user_input = new Scanner(System.in);

        int firstNum = 1;
        int secondNum = 1;

        // Var to track successful entries
        int validEntries1 = 0;

        // Loop till the user enter a correct numbers
        while (validEntries1 < 2) {
            // Handel exception 1
            try {
                if (validEntries1 == 0) {
                    // 2. Prompt the user to enter the first number
                    System.out.print("Enter the first integer: ");
                    firstNum = user_input.nextInt();
                    validEntries1++;
                } else if (validEntries1 == 1) {
                    // 3. Prompt the user to enter the second number
                    System.out.print("Enter the second integer: ");
                    secondNum = user_input.nextInt();
                    validEntries1++;
                }
            } catch (InputMismatchException e) {// If the user entered a wrong format handel it
                System.out.println("Please enter a number!");
                user_input.nextLine();  // Clear the invalid input
            }
        }

        try {
            // Handel exception 2
            // 4. Apply the operations on the two numbers and print the result
            // (+)
            System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
            // (-)
            System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
            // (*)
            System.out.println(firstNum + " x " + secondNum + " = " + (firstNum * secondNum));
            // (/)
            System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
            // (%)
            System.out.println(firstNum + " mod " + secondNum + " = " + (firstNum % secondNum));

        } catch (ArithmeticException e) {// If there is division by 0 handel it
            System.out.println("Division by 0!");
        }
        //----------------------------------------------------------------------
        /* Q2. Write a Java program that takes a number as input and prints its
         multiplication table up to 10. */

        // Header
        System.out.println("-------------------Q2-------------------");

        // Loop till the user enter a correct number
        do {
            // Handel exception 1
            try {
                // 2. Prompt the user to enter a number
                System.out.print("Enter a number: ");
                int num = user_input.nextInt();

                // 3. Loop from 1-10 to multiply and print the result
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + " x " + num + " = " + (i * num));
                }

                // Exit the loop if input is valid
                break;

            } catch (InputMismatchException e) {// If the user entered a wrong format handel it
                System.out.println("Please enter a number!");
                user_input.nextLine();  // Clear the invalid input
            }

        } while (true);

        //----------------------------------------------------------------------
        // Q3. Write a Java program to print the area and perimeter of a circle.

        // Header
        System.out.println("-------------------Q3-------------------");

        // Loop till the user enter a correct number
        do {
            // Handel exception 1
            try {
                // 2. Prompt the user to enter the radius
                System.out.print("Enter the radius: ");
                double radius = user_input.nextDouble();

                // 3. Calculate the perimeter and area of a circle
                double cirPerimeter = 2 * Math.PI * radius;
                double cirArea = Math.PI * (radius * radius);

                // 4. Print the result
                System.out.println("The Perimeter = " + cirPerimeter);
                System.out.println("The Area = " + cirArea);

                // Exit the loop if input is valid
                break;

            } catch (InputMismatchException e) {// If the user entered a wrong format handel it
                System.out.println("Please enter a number!");
                user_input.nextLine();  // Clear the invalid input
            }
        } while (true);

        user_input.nextLine();

        //----------------------------------------------------------------------
        // Q4. Write a Java program to find out the average of a set of integers.

        // Header
        System.out.println("-------------------Q4-------------------");

        // To store the total of the integers
        double sum = 0.0;

        // To store the count of numbers
        int count = 0;

        // To store the average
        double average = 0.0;

        // Var to track successful entries
        int validEntries2 = 0;

        // Loop till the user enter a correct count number
        do {
            // Handel exception 1
            try {
                // 2. Prompt the user to enter a count of numbers
                System.out.print("Enter the count of numbers: ");
                count = user_input.nextInt();

                if (count <= 0) System.out.println("Please enter a positive count number!");
                else break; // Exit if valid count is entered

            } catch (InputMismatchException e) {// If the user entered a wrong format handel it
                System.out.println("Please enter a number!");
                user_input.nextLine();  // Clear the invalid input
            }
        } while (true);

        // 3. Loop count numbers
        while (validEntries2 < count) {
            // Handel exception 2
            try {
                // 4. Prompt the user to enter an integer
                System.out.print("Enter an integer (" + (validEntries2 + 1) + " of " + count + "): ");
                int userNum = user_input.nextInt();
                sum += userNum;
                validEntries2++;  // 5. Increment only on successful entry

            } catch (InputMismatchException e) {// If the user entered a wrong format handel it
                System.out.println("Please enter a number!");
                user_input.nextLine();  // Clear the invalid input
            }
        }

        // 5. Calculate the average and print the result
        average = sum / count;

        // 6. Print the result
        System.out.printf("The average is: %.1f\n", average);

        user_input.nextLine();

        //----------------------------------------------------------------------
        /* Q5. Write a Java program that accepts three integers as input, adds the first
         two integers together, and then determines whether the sum is equal to the third integer. */

        // Header
        System.out.println("-------------------Q5-------------------");

        // Numbers vars
        int firNum = 0;
        int secNum = 0;
        int thiNum = 0;

        // Var to track successful entries
        int validEntries3 = 0;

        // 1. Loop till the user enter correct numbers
        while (validEntries3 < 3) {
            // Handel exception 1
            try {
                System.out.print("Enter an integer (" + (validEntries3 + 1) + " of " + 3 + "): ");
                int userNum = user_input.nextInt();

                // 2. Assign the input to the correct variable
                if (validEntries3 == 0) {
                    firNum = userNum;
                } else if (validEntries3 == 1) {
                    secNum = userNum;
                } else {
                    thiNum = userNum;
                }

                // 3. Increment only on successful entry
                validEntries3++;

            } catch (InputMismatchException e) {// If the user entered a wrong format handel it
                System.out.println("Please enter a number!");
                user_input.nextLine();  // Clear the invalid input
            }
        }

        // 4. Check for the condition and print the result
        boolean isEqual = (firNum + secNum == thiNum);
        System.out.println("The result is: " + isEqual);

        user_input.nextLine();

        //----------------------------------------------------------------------
        // Q6. Write a Java program to reverse a word.

        // Header
        System.out.println("-------------------Q6-------------------");

        // An empty string to store the reversed word
        String reversedWord = "";

        // Loop till the user enter a string
        do {
            // Handel exception 1
            try {
                // 1. Prompt the user to enter a word
                System.out.print("Enter a word: ");
                String actualWord = user_input.nextLine();

                // 2. Check if the input is empty
                if (actualWord.trim().isEmpty()) {
                    System.out.println("Input cannot be empty. Please enter a valid word.");
                    continue;
                }

                // 3. Reverse the promoted word
                for (int i = 0; i < actualWord.length(); i++) {
                    char letter = actualWord.charAt(i);//Returns the char at that index
                    reversedWord = letter + reversedWord;//Store the char in the reversedWord var
                }

                // Exit the loop if input is valid
                break;

            } catch (Exception e) {// If there are unexpected exceptions handel it
                System.out.println("An unexpected exception occurred: " + e.getMessage() + ". Please try again.");
                user_input.nextLine();  // Clear the invalid input
            }
        } while (true);

        // 4. Print the reversed word
        System.out.println("Reversed word: " + reversedWord);

        //----------------------------------------------------------------------
        // Q7. Write a Java program to check whether the given number is even or odd.

        // Header
        System.out.println("-------------------Q7-------------------");

        // Var
        int enteredNum = 0;

        // Loop till the user enter a correct number
        do {
            // Handel exception 1
            try {
                // 2. Prompt the user to enter a number
                System.out.print("Enter a number: ");
                enteredNum = user_input.nextInt();

                // Exit the loop if input is valid
                break;

            } catch (InputMismatchException e) {// If the user entered a wrong format handel it
                System.out.println("Please enter a number!");
                user_input.nextLine();  // Clear the invalid input
            }
        } while (true);

        // 3. Print the result
        if (enteredNum % 2 == 0) System.out.println("The number is Even");
        else System.out.println("The number is Odd");

        user_input.nextLine();

        //----------------------------------------------------------------------
        // Q8. Write a Java program to convert the temperature in Centigrade to Fahrenheit.

        // Header
        System.out.println("-------------------Q8-------------------");

        // Vars
        double centigradeTemp = 0.0;
        double fahrenheitTemp = 0.0;

        // Loop till the user enter a correct number
        do {
            // Handel exception 1
            try {
                // 2. Prompt the user to enter a temperature in Centigrade
                System.out.print("Enter temperature in Centigrade: ");
                centigradeTemp = user_input.nextDouble();

                user_input.nextLine();

                // 3. Convert the temperature in Centigrade to Fahrenheit
                fahrenheitTemp = centigradeTemp * 9 / 5 + 32;

                // Exit the loop if input is valid
                break;
            } catch (InputMismatchException e) {// If the user entered a wrong format handel it
                System.out.println("Please enter a number!");
                user_input.nextLine();  // Clear the invalid input
            }
        } while (true);

        // 4. Print the result
        System.out.println("Temperature in Fahrenheit is: " + fahrenheitTemp);

        //----------------------------------------------------------------------
        /* Q9. Write a Java program that takes a string and a number from the user,
        then prints the character in the given index. */

        // Header
        System.out.println("-------------------Q9-------------------");

        // Vars
        String text = "";
        int index = -1;

        // Var to track successful entries
        int validEntries4 = 0;

        // Loop until both inputs are successfully entered
        while (validEntries4 < 2) {
            try {
                // Prompt for text if validEntries is 0, otherwise prompt for index
                if (validEntries4 == 0) {
                    System.out.print("Enter a string: ");
                    text = user_input.nextLine();

                    // Check for empty string
                    if (text.isEmpty()) {
                        System.out.println("The string cannot be empty. Please enter a valid string.");
                        continue; // Restart loop if invalid
                    }

                } else if (validEntries4 == 1) {
                    System.out.print("Enter a number: ");
                    index = user_input.nextInt();

                    // Check for index out of bounds
                    if (index < 0 || index >= text.length()) {
                        System.out.println("Index out of bounds. Please enter a number between 0 and " + (text.length() - 1) + ".");
                        continue; // Restart loop if invalid
                    }
                }

                // Increment validEntries if input was valid
                validEntries4++;

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer for the index.");
                user_input.nextLine(); // Clear the invalid input
            }
        }

        // 3. Find the character in the given index and print the result
        System.out.println("The character in the given index is: " + text.charAt(index));

        user_input.nextLine();

        //----------------------------------------------------------------------
        // Q10. Write a Java program to print the area and perimeter of a rectangle.

        // Header
        System.out.println("-------------------Q10-------------------");

        // Vars
        double width = 0;
        double height = 0;

        // Var to track successful entries
        int validEntries5 = 0;

        // Loop until both width and height are successfully entered
        while (validEntries5 < 2) {
            try {
                // 2. Prompt for width if validEntries is 0, otherwise prompt for height
                if (validEntries5 == 0) {
                    System.out.print("Enter the width of the rectangle: ");
                    width = user_input.nextDouble();

                    // 3. Check for positive width
                    if (width <= 0) {
                        System.out.println("Width must be a positive number. Please try again.");
                        continue; // Restart loop if invalid
                    }

                } else if (validEntries5 == 1) {
                    System.out.print("Enter the height of the rectangle: ");
                    height = user_input.nextDouble();

                    // 4. Check for positive height
                    if (height <= 0) {
                        System.out.println("Height must be a positive number. Please try again.");
                        continue; // Restart loop if invalid
                    }
                }

                // 5. Increment validEntries if input was valid
                validEntries5++;

            } catch (InputMismatchException e) {//If the user entered a wrong format handel it
                System.out.println("Please enter a valid number.");
                user_input.nextLine(); // Clear invalid input
            }
        }

        // 6. Calculate the area and perimeter of the rectangle
        double recArea = width * height;
        double recPerimeter = 2 * (width + height);

        // 7. Print the result
        System.out.println("The Area is " + width + " * " + height + " = " + recArea);
        System.out.println("The Perimeter is 2 * (" + width + " + " + height + ") = " + recPerimeter);

        user_input.nextLine();

        //----------------------------------------------------------------------
        // Q11. Write a Java program to compare two numbers.

        // Header
        System.out.println("-------------------Q11-------------------");

        // Vars
        int firInt = 0;
        int secInt = 0;

        // Var to track successful entries
        int validEntries6 = 0;

        // Loop until both numbers are successfully entered
        while (validEntries6 < 2) {
            try {
                // 2. Prompt the user to enter two numbers
                if (validEntries6 == 0) {
                    System.out.print("Enter the first integer: ");
                    firInt = user_input.nextInt();
                } else if (validEntries6 == 1) {
                    System.out.print("Enter the second integer: ");
                    secInt = user_input.nextInt();
                }

                // 3. Increment validEntries if input was valid
                validEntries6++;

            } catch (InputMismatchException e) {//If the user entered a wrong format handel it
                System.out.println("Please enter a valid number.");
                user_input.nextLine(); // Clear invalid input
            }
        }

        // 4. Compare the two numbers and print the result
        if (firInt < secInt) {
            System.out.println(firInt + " != " + secInt);
            System.out.println(firInt + " < " + secInt);
            System.out.println(firInt + " <= " + secInt);

        } else {
            System.out.println(secInt + " != " + firInt);
            System.out.println(secInt + " < " + firInt);
            System.out.println(secInt + " <= " + firInt);
        }

        user_input.nextLine();

        //----------------------------------------------------------------------
        // Q12. Write a Java program to convert seconds to hours, minutes and seconds.

        // Header
        System.out.println("-------------------Q12-------------------");

        // Vars
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        // Loop until number of seconds are successfully entered
        do {
            try {
                // 2. Prompt the user to enter the seconds
                System.out.print("Enter the seconds: ");
                int userSeconds = user_input.nextInt();

                // 3. convert seconds to hours, minutes and seconds.
                hours = userSeconds / 3600;
                minutes = (userSeconds % 3600) / 60;
                seconds = userSeconds % 60;

                // Exit the loop if input is valid
                break;

            } catch (InputMismatchException e) {//If the user entered a wrong format handel it
                System.out.println("Please enter a valid number.");
                user_input.nextLine(); // Clear invalid input
            }
        } while (true);

        // 4. Print the result as (hh:mm:ss)
        System.out.println(hours + ":" + minutes + ":" + seconds);

        user_input.nextLine();

        //----------------------------------------------------------------------
        /* Q13. Write a Java program that accepts four integers from the user
        and prints equal if all four are equal, and not equal otherwise. */

        // Header
        System.out.println("-------------------Q13-------------------");

        // Vars
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;

        // Var to track successful entries
        int validEntries7 = 0;

        // Loop until all four numbers are successfully entered
        while (validEntries7 < 4) {
            try {
                // 2. Prompt the user to enter four integers
                if (validEntries7 == 0) {
                    System.out.print("Enter the first number: ");
                    firstNumber = user_input.nextInt();
                } else if (validEntries7 == 1) {
                    System.out.print("Enter the second number: ");
                    secondNumber = user_input.nextInt();
                } else if (validEntries7 == 2) {
                    System.out.print("Enter the third number: ");
                    thirdNumber = user_input.nextInt();
                } else if (validEntries7 == 3) {
                    System.out.print("Enter the fourth number: ");
                    fourthNumber = user_input.nextInt();
                }
                // 3. Increment validEntries if input was valid
                validEntries7++;

            } catch (InputMismatchException e) {//If the user entered a wrong format handel it
                System.out.println("Please enter a valid number.");
                user_input.nextLine(); // Clear invalid input
            }
        }

        // 4. Check if the four integers are equal
        if (firstNumber == secondNumber && firstNumber == thirdNumber && firstNumber == fourthNumber) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }

        user_input.nextLine();

        //----------------------------------------------------------------------
        /* Q14. Write a Java program that reads an integer and check whether
        it is negative, zero, or positive. */

        // Header
        System.out.println("-------------------Q14-------------------");

        // Var
        int checkNum = 0;

        // Loop until the number is successfully entered
        do {
            try {
                // 2. Prompt the user to enter an integer
                System.out.print("Enter a number: ");
                checkNum = user_input.nextInt();

                // Exit the loop if input is valid
                break;

            } catch (InputMismatchException e) {//If the user entered a wrong format handel it
                System.out.println("Please enter a valid number.");
                user_input.nextLine(); // Clear invalid input
            }
        } while (true);

        // 3. Check whether the integer is negative, zero, or positive. Then print a message
        if (checkNum == 0) System.out.println("The number is zero");
        else if (checkNum > 0) System.out.println("Th number is positive");
        else System.out.println("The number is negative");

        user_input.nextLine();

        //----------------------------------------------------------------------
        /* Q15. Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered (End loop use -1 , Don’t count -1). */

        // Header
        System.out.println("-------------------Q15-------------------");

        // Var to take the user input
        int userNum = 0;

        // Vars to count the number of positive, negative and zeros entered
        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;

        // Loop until all the numbers are successfully entered
        do {
            try {
                // 2. Prompt the user to enter a number
                System.out.print("Enter a number: ");
                userNum = user_input.nextInt();

                // 3. Check for the three cases
                if (userNum == 0) zeroNum = zeroNum + 1;
                else if (userNum > 0) positiveNum = positiveNum + 1;
                else if (userNum < -1) negativeNum = negativeNum + 1;

            } catch (InputMismatchException e) {//If the user entered a wrong format handel it
                System.out.println("Please enter a valid number.");
                user_input.nextLine(); // Clear invalid input
            }
        } while (userNum != -1);

        // 4. Print the result
        System.out.println(positiveNum + " positives" + "\n"
                + zeroNum + " zeros" + "\n"
                + negativeNum + " negatives");

        user_input.nextLine();

        //----------------------------------------------------------------------
        /* Q16. Write a program that prompts the user to input an integer and then
        outputs the number with the digits reversed. */

        // Header
        System.out.println("-------------------Q16-------------------");

        // Var to take the user input
        int userNumber;

        // Var to store the reversed integer
        String reversedNum = "";

        // Loop until the number is successfully entered
        do {
            try {
                // 2. Prompt the user to enter a number
                System.out.print("Enter a number: ");
                userNumber = user_input.nextInt();

                // 3. Convert the integer to a string
                String numberToString = Integer.toString(userNumber);

                // 4. Loop until the number becomes 0
                for (int i = numberToString.length() - 1; i >= 0; i--) {
                    reversedNum = reversedNum + numberToString.charAt(i);
                }

                // Exit the loop if input is valid
                break;

            } catch (InputMismatchException e) {//If the user entered a wrong format handel it
                System.out.println("Please enter a valid number.");
                user_input.nextLine(); // Clear invalid input
            }
        } while (true);

        // 5. Print the result
        System.out.println("The reversed number is: " + reversedNum);

        user_input.nextLine();

        //----------------------------------------------------------------------
        /* Q17. Write a program to enter the numbers till the user wants and at the end
        the program should display the largest and smallest numbers entered. */

        // Header
        System.out.println("-------------------Q17-------------------");

        // Var to take the user input
        int usrNum = 0;

        // Vars to store the largest and smallest numbers
        Integer largestNum = null;
        Integer smallestNum = null;

        // Loop until all the numbers are successfully entered
        do {
            try {
                // 2. Prompt the user to enter a number
                System.out.print("Enter any number or 0 to exit: ");
                usrNum = user_input.nextInt();

                //user_input.nextLine();

                // 3. Find the largest and smallest numbers
                if (usrNum != 0) {
                    // Initialize largest and smallest on the first valid entry
                    if (largestNum == null || smallestNum == null) {
                        largestNum = usrNum;
                        smallestNum = usrNum;
                    } else {
                        // Update largest and smallest numbers as needed
                        if (usrNum > largestNum) largestNum = usrNum;
                        if (usrNum < smallestNum) smallestNum = usrNum;
                    }
                }
            } catch (InputMismatchException e) {//If the user entered a wrong format handel it
                System.out.println("Please enter a valid number.");
                user_input.nextLine(); // Clear invalid input
                usrNum = 1;
            }
        } while (usrNum != 0);

        // 4. Print the largest and smallest numbers if they were entered
        if (largestNum != null && smallestNum != null) {
            System.out.println("The largest number is: " + largestNum);
            System.out.println("The smallest number is: " + smallestNum);
        }

        user_input.nextLine();

        //----------------------------------------------------------------------
        /* Q18. Determine and print the number of times the character
        ‘a’ appears in the input entered by the user. */

        // Header
        System.out.println("-------------------Q18-------------------");

        // A counter var
        int aCounter = 0;

        // Loop until the string is successfully entered
        do {
            try {
                // 2. Prompt the user to enter a string
                System.out.print("Enter a string: ");
                String usrText = user_input.nextLine();

                // Check for empty string
                if (usrText.isEmpty()) {
                    System.out.println("The string cannot be empty. Please enter a valid string.");
                    continue; // Restart loop if invalid
                }

                // 3. Loop through the string and check how many times the letter 'a' appears in the input
                for (int i = 0; i < usrText.length(); i++) {
                    if (usrText.charAt(i) == 'a') aCounter = aCounter + 1;
                }

                // Exit the loop if input is valid
                break;
            } catch (Exception e) {// If there are unexpected exceptions handel it
                System.out.println("An unexpected exception occurred: " + e.getMessage() + ". Please try again.");
                user_input.nextLine();  // Clear the invalid input
            }
        } while (true);

        // 4. Print the result
        System.out.println("Number of a's: " + aCounter);

        user_input.nextLine();

        //----------------------------------------------------------------------
        // Close the scanner
        user_input.close();
    }
}