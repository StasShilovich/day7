package com.shilovich.day7;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("1-английский \n 2-русский \n 3-белоруский");
            char j = 0;
            try {
                j = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String country = "";
            String language = "";
            switch (j) {
                case '1':
                    country = "US";
                    language = "EN";
                    break;
                case '2':
                    country = "RU";
                    language = "ru";
                    break;
                case '3':
                    country = "BY";
                    language = "be";
                    break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle bundle = ResourceBundle.getBundle("datares.text", current);
            System.out.println(bundle.getString("prop.task"));
            System.out.println(bundle.getString("prop.name"));
        }
    }
}
