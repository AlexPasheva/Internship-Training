package com.company;
import java.util.*;
public class ReverseWordsCommand implements Command{
    public String execute(String input){
        StringTokenizer st = new StringTokenizer(input, " ");
        String reversedLine = "";

        while(st.hasMoreTokens()) {
            reversedLine = st.nextToken() + " " + reversedLine;
        }

        return new StringBuilder(input).reverse().toString();
    }
}
