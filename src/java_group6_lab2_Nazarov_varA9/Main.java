package java_group6_lab2_Nazarov_varA9;

import javax.swing.*;
import java.io.*;

public class Main {

    public static void create() throws IOException {

        DataOutputStream f = new DataOutputStream(new FileOutputStream("123.bin"));

        for (double x = -15; x <= 15; x += 0.05) {
            double y = x * Math.sin(x);

            System.out.println(x + " " + y);

            f.writeDouble(x);
            f.writeDouble(y);
        }
    }

    public static void main(String[] args) throws IOException {
        create();
        Plot plot = new Plot();
        plot.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        plot.setVisible(true);
    }
}