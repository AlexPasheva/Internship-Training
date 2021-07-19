package com.company;
import java.util.Scanner;

public class SudokuGridReader {

    public SudokuGrid parseProblem(Scanner input)
    {
        String[] contents= new String[9];
        int r=0;
        while (r<9){
            contents[r]= input.nextLine();
            r++;
        }

        char[][] problem = new char[9][9];
        for (int i = 0; i < 9; i++) {
            String row = contents[i];
            for (int j = 0; j < 9; j++) {
                problem[i][j] = row.charAt(j);
            }
        }
        return new SudokuGrid(problem);
    }
}
