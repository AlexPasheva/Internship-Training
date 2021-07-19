package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SudokuGridReader gr = new SudokuGridReader();
        SudokuGrid problem = gr.parseProblem(input);
        System.out.println(problem.isValidConfig());
    }
}
