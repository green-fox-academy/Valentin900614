package com.dependencyexamples.dependency.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary //mindig ezt fogja fogadni a main-ben
@Service
public class BlueColor implements MyColor{

    @Override
    public void printColor() {
        System.out.println("It is blue in color...");
    }

}
