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

    //Hacemos el año 5 antes que el 4 porque primero tenemos que conocer la Sigla romana V
    @Test
    public void convertYear5(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("V", appRomanNumeral.convertToRomanNumeral(5));
    }

    @Test
    public void convertYear6(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("VI", appRomanNumeral.convertToRomanNumeral(6));
    }
}
