package com.example.cookieclicker

import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CookieClickerKotlinTest {


    @Rule
    var activityTestRule = ActivityTestRule(
        MainActivity::class.java
    )

    @Test
    @Throws(Exception::class)
    fun totalStartsAtZero() {
        Espresso.onView(withId(R.id.lblTotal))
            .check(ViewAssertions.matches(ViewMatchers.withText("0")))
    }

    @Test
    @Throws(Exception::class)
    fun totalIncreasesWhenCookieClicked() {
        Espresso.onView(withId(R.id.imgCookie))
            .perform(ViewActions.click())
        Espresso.onView(withId(R.id.lblTotal))
            .check(ViewAssertions.matches(ViewMatchers.withText("1")))
    }

    @Test
    @Throws(Exception::class)
    fun achieveHighScore() {
        for (i in 0..99) {
            Espresso.onView(withId(R.id.imgCookie))
                .perform(ViewActions.click())
        }
        Espresso.onView(withId(R.id.lblTotal))
            .check(ViewAssertions.matches(ViewMatchers.withText("100")))
    }
}