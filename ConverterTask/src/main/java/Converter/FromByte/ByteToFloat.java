package Converter.FromByte;
import Converter.Converter;
public class ByteToFloat implements Converter{
    private final static Class<Byte> CLASSFROM = Byte.class;
    private final static Class<Float> CLASSТО = Float.class;
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
        if (obj instanceof Byte) {
            Byte val = (Byte) obj;
            return val.floatValue();
        }
        else {
            return null;
        }
    }
}