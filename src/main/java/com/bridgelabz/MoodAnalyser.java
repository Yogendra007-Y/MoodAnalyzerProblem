package com.bridgelabz;

/**
 * Purpose  - I am in Sad Mood” message Should Return HAPPY
 * @author  - Yogendra Lalit Sharma
 * @version - 16.0
 * @since   - 2021-11-08
 */

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("Any")) {
        }
        return "Happy";
    }
}