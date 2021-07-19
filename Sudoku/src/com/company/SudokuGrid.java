package com.company;
import java.util.HashSet;


public class SudokuGrid {
    private char[][] grid;

    SudokuGrid(char[][] input) {
        this.grid = input;
    }

    private boolean notInRow(int row) {
        HashSet<Character> st = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            if (st.contains(grid[row][i])) {
                return false;
            }
            if (grid[row][i] != '-') {
                st.add(grid[row][i]);
            }
        }
        return true;
    }

    private boolean notInCol(int col) {
        HashSet<Character> st = new HashSet<>();

        for(int i = 0; i < 9; i++) {
            if (st.contains(grid[i][col])){
                return false;
            }
            if (grid[i][col] != '-'){
                st.add(grid[i][col]);
            }
        }
        return true;
    }

    private boolean notInBox(int startRow, int startCol) {
        HashSet<Character> st = new HashSet<>();

        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 3; col++) {
                char curr = grid[row + startRow][col + startCol];
                if (st.contains(curr)){
                    return false;
                }
                if (curr != '-'){
                    st.add(curr);
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col) {
        return notInRow(row) && notInCol(col) &&
                notInBox(row - row % 3, col - col % 3);
    }

    public boolean isValidConfig() {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if (!isValid(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

