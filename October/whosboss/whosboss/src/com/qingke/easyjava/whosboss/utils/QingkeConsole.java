package com.qingke.easyjava.whosboss.utils;

import java.util.Scanner;

import com.qingke.easyjava.whosboss.bean.MessageConstants;

/**
 * The wrapper object for system Scanner to handle the interactive of Java Console.
 * @author Qingke.me
 */
public class QingkeConsole {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Print the prompt message to ask user to input.
     * @param prompt the prompt message
     * @param nullable identify if the user input is nullable
     * @return the user input value in String format
     */
    public static String askUserInput(String prompt, boolean nullable) {
        System.out.print(prompt + "> ");
        String userInput = null;
        while(true) {
            userInput = scanner.nextLine();

            // skip the empty check if the input is nullable
            if (nullable) {
                break;
            }
            // check if the empty is null or empty
            if (userInput != null && !"".equals(userInput.trim())) {
                break;
            }

            System.out.println(MessageConstants.WARN_EMPTY_USER_INPUT);
        }
        
        return userInput;
    }

    /**
     * Print message with line break.
     * @param message the message
     */
    public static void println(String message) {
        System.out.println(message);
    }

    /**
     * Print object with line break.
     * @param object the object
     */
    public static void println(Object object) {
        System.out.println(object);
    }

    /**
     * Print the message without line break.
     * @param message the message
     */
    public static void print(String message){
        System.out.print(message);
    }
}
