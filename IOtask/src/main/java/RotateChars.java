public class RotateChars {
    static char rotateChar(char c, int distance) {
        assert 32 <= c && c < 127;
        if (distance < 0) distance = distance % (127 - 32) + 127 - 32;
        return (char) ((c + distance - 32) % (127 - 32) + 32);
    }
    public String rotateString(String input){
        if(input==null || input.isBlank()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        StringBuilder res = new StringBuilder();
        for (char c: input.toCharArray()) {
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                res.append(rotateChar(c,13));
            }
        }
        return res.toString();
    }
}
