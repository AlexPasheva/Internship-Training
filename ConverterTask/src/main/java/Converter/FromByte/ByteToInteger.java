package Converter.FromByte;
import Converter.Converter;
public class ByteToInteger implements Converter{
    private final static Class<Byte> CLASSFROM = Byte.class;
    private final static Class<Integer> CLASSТО = Integer.class;
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
            return val.intValue();
        }
        else {
            return null;
        }
    }
}