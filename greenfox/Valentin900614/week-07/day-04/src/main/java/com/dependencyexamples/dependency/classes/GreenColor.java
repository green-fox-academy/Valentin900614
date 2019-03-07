package com.dependencyexamples.dependency.classes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green") //ha nincs primary, és ezt átadom a main-ben, ezt fogja kiírni
public class GreenColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is green in color...");
    }

}
