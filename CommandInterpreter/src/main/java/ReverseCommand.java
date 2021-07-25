public class ReverseCommand implements Command{
    String name = "reverse";
    @Override
    /**
     * Returns the result of the execution of a reverse command.
     *
     * This method executes the reverse command and returns as a result
     * a string with the input written backwards.
     *
     * @param  input  the string that is going to be reversed
     * @return        the result of the execution as a string
     */
    public String execute(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public String getName() {
        return name;
    }
}
