package com.dependencyexamples.dependency;

import com.dependencyexamples.dependency.classes.MyColor;
import com.dependencyexamples.dependency.classes.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor myColor;

    @Autowired
    DependencyApplication(Printer printer, MyColor myColor) {
        this.printer = printer;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependencyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
        printer.log("U-N-I-T-E-D, United are the team for me...");
    }

}
