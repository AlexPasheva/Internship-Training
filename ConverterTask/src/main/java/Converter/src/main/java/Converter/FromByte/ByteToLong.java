package Converter.FromByte;
import Converter.Converter;
public class ByteToLong implements Converter{
    private final static Class<Byte> CLASSFROM = Byte.class;
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
        if (obj instanceof Byte) {
            Byte val = (Byte) obj;
            return val.longValue();
        }
        else {
            return null;
        }
    }
}