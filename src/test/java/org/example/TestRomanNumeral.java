package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;

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

    @Test
    public void convertYear7(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("VII", appRomanNumeral.convertToRomanNumeral(7));
    }

    @Test
    public void convertYear10(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("X", appRomanNumeral.convertToRomanNumeral(10));
    }

    @Test
    public void convertYear12(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("XII", appRomanNumeral.convertToRomanNumeral(12));
    }

    @Test
    public void convertYear30(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("XXX", appRomanNumeral.convertToRomanNumeral(30));
    }

    @Test
    public void convertYear4(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("IV", appRomanNumeral.convertToRomanNumeral(4));
    }

    @Test
    public void convertYear9(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("IX", appRomanNumeral.convertToRomanNumeral(9));
    }

    @Test
    public void convertYear2023(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("MMXXIII", appRomanNumeral.convertToRomanNumeral(2023));
    }

    @Test
    public void convertYear2000(){
        AppRomanNumeral appRomanNumeral = new AppRomanNumeral();
        Assert.assertEquals("MM",appRomanNumeral.convertToRomanNumeral(2000));
    }
}
