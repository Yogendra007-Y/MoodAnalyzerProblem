package com.bridgelabz;

/**
 * Purpose  - Handle Exception if User Provides Invalid Mood
 * @author  - Yogendra Lalit Sharma
 * @version - 16.0
 * @since   - 2021-11-08
 */

public class MoodAnalyser {
    public static String message;

    // Constructor
    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Exception Handled";
        }
    }
}