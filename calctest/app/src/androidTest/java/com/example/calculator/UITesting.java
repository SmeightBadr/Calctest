package com.example.calculator;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;



import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class UITesting {

    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void clicking_one(){
        onView(withId(R.id.button17)).perform(click()).check(matches(isDisplayed()));

    }
    public void clicking_two(){
        onView(withId(R.id.button16)).perform(click()).check(matches(isDisplayed()));

    }

    public void clicking_three(){
        onView(withId(R.id.button15)).perform(click()).check(matches(isDisplayed()));

    }

    public void clicking_four(){
        onView(withId(R.id.button10)).perform(click()).check(matches(isDisplayed()));

    }
    public void clicking_five(){
        onView(withId(R.id.button13)).perform(click()).check(matches(isDisplayed()));

    }

    public void clicking_six(){
        onView(withId(R.id.button12)).perform(click()).check(matches(isDisplayed()));

    }

    public void clicking_seven(){
        onView(withId(R.id.button6)).perform(click()).check(matches(isDisplayed()));

    }

    public void clicking_eight(){
        onView(withId(R.id.button7)).perform(click()).check(matches(isDisplayed()));

    }

    public void clicking_nine(){
        onView(withId(R.id.button8)).perform(click()).check(matches(isDisplayed()));

    }


}
