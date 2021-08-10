package Converter.FromLong;
import Converter.Converter;
public class LongToFloat implements Converter{
    private final static Class<Long> CLASSFROM = Long.class;
    private final static Class<Float> CLASSТО = Float.class;
    private final static boolean PRECISSIONLOSS = true;
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
        if (obj instanceof Long) {
            Long val = (Long) obj;
            return val.floatValue();
        }
        else {
            return null;
        }
    }
}