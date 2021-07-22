package com.company;

public abstract class CommandEngine {
    public static Command getCommand(String commandName){
        if(commandName.equalsIgnoreCase("reverse")){
            return new ReverseCommand();
        }else if(commandName.equalsIgnoreCase("reverse-words")){
            return new ReverseWordsCommand();
        }else if(commandName.equalsIgnoreCase("count-words")){
            return new CountWordsCommand();
        }
        else{
            return null; //не знам това дали е добре така
        }
    }
}
