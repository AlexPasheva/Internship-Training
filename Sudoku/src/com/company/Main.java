package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    SudokuGrid problem = new SudokuGrid(input);
        System.out.println(problem.isValidConfig());
    }
}
