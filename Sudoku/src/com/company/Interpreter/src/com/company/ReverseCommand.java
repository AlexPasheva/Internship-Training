package com.company;

public class ReverseCommand implements Command{
    @Override
    public String execute(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
