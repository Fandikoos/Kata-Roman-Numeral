package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestRomanNumeral {
    @Test
    public void ConvertYear1(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("I",appRomanNumeral.convertToRomanNumeral(1));
    }
}
