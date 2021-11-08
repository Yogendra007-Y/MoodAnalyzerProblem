package com.bridgelabz;

/**
 * Purpose  - Given null Mood Should Throw MoodAnalysisException
 * @author  - Yogendra Lalit Sharma
 * @version - 16.0
 * @since   - 2021-11-08
 */

public class MoodAnalyser {
    public static String message;

    public MoodAnalyser() {
    }

    // Constructor
    public MoodAnalyser(String message) throws MoodAnalysisException {
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

    public static String analyseMood() throws MoodAnalysisException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Entered Invalid mood");
        }
    }
}