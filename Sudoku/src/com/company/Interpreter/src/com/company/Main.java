package com.company;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    //може би е добре това да се измести в друг клас така изглежда обемно и грозно
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your command:");
        String input = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        String[] commandName = new String[2];
        int i=0;

        while (st.hasMoreTokens()) {
            commandName[i] = st.nextToken();
            i++;
        }

        Command command =CommandEngine.getCommand(commandName[0]);
        if(command!=null) {
            command.execute(commandName[1]);
        } else {
            System.out.println("Bad command. Try again or use help.");
        }

    }
}
