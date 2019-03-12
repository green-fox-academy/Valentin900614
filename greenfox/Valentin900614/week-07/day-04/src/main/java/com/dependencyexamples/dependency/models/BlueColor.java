package com.dependencyexamples.dependency.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary //mindig ezt fogja fogadni a main-ben
@Service
public class BlueColor implements MyColor{

    private Printer printer;

    @Autowired
    public BlueColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is blue in color...");
    }

}
