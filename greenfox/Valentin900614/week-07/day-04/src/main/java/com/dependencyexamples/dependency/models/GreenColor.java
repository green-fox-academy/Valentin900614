package com.dependencyexamples.dependency.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green") //ha nincs primary, és ezt átadom a main-ben, ezt fogja kiírni
public class GreenColor implements MyColor {

    private Printer printer;

    @Autowired
    public GreenColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is green in color...");
    }

}
