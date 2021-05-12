package stepdefinitions;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class FormFieldFinder {
//https://www.codegrepper.com/code-examples/java/generate+random+string+of+specific+length+in+java
    private int max = 8;
    public void getName(String email) {

        if(email == "random email"){
           String randomString = setName(new Random(),max);
        }
    }

    private String setName(Random random, int max) {

    }
}
