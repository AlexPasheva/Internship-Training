public class ReverseCommand implements Command{
    String name = "reverse";
    @Override
    public String execute(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public String getName() {
        return name;
    }
}