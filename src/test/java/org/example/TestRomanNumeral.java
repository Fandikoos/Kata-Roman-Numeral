package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestRomanNumeral {
    @Test
    public void convertYear1(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("I",appRomanNumeral.convertToRomanNumeral(1));
    }

    @Test
    public void convertYear2(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("II", appRomanNumeral.convertToRomanNumeral(2));
    }

    @Test
    public void convertYear3(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("III", appRomanNumeral.convertToRomanNumeral(3));
    }
}
