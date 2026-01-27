package com.dws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegisterPositiveTest() {
        clickOnRegisterLink();
        fillRegisterForm("Karl", "Adam", newEmail(), "Karl1234");
        clickOnRegisterButton();
        Assert.assertTrue(isEmailInHeaderPresent());
    }

}
