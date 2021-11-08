package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest
{
    // Test case to analyze sad mood of the user
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String actualResult = moodanalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("Sad", actualResult);
    }

    // Test case to analyze happy mood of the user
    @Test
    public void givenMessage_ContainsAny_init_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String actualResult = moodanalyser.analyseMood("I am in Happy Mood");
        Assert.assertEquals("Happy", actualResult);
    }
}