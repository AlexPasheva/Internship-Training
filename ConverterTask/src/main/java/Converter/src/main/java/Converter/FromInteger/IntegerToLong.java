package Converter.FromInteger;
import Converter.Converter;
public class IntegerToLong implements Converter{
    private final static Class<Integer> CLASSFROM = Integer.class;
    private final static Class<Long> CLASSТО = Long.class;
    private final static boolean PRECISSIONLOSS = false;
    public static boolean isPrecissionloss() {
        return PRECISSIONLOSS;
    }
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if (obj instanceof Integer) {
            Integer val = (Integer) obj;
            return val.longValue();
        }
        else {
            return null;
        }
    }
}