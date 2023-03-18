package com.itche.chapter03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class setProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name","tom");
        properties.setProperty("age","5");
        properties.setProperty("color","red");
        properties.store(new FileWriter("src\\com\\itche\\chapter03\\dog.properties"),null);

    }
}
