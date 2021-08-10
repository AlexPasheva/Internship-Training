package Converter;

import Converter.ConverterFactory;

public class Main {

    public static void main(String[] args) {
        ConverterFactory converter = new ConverterFactory();
        System.out.println(converter.convert(10.343434, Integer.class));
    }

}