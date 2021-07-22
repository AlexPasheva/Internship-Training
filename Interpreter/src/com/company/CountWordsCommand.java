package com.company;
import java.util.*;
public class CountWordsCommand implements Command{
    @Override
    public String execute(String input){
        StringTokenizer st = new StringTokenizer(input, " ");
        int count = st.countTokens();
        return String.valueOf(count);
    }
}