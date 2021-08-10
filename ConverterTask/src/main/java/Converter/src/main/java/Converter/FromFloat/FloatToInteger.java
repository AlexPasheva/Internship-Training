package Converter.FromFloat;
import Converter.Converter;
public class FloatToInteger implements Converter{
    private final static Class<Float> CLASSFROM = Float.class;
    private final static Class<Integer> CLASSТО = Integer.class;
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
        if (obj instanceof Float) {
            Float val = (Float) obj;
            return val.intValue();
        }
        else {
            return null;
        }
    }
}
