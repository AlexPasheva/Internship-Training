package Converter.FromByte;
import Converter.Converter;
public class ByteToDouble implements Converter{

    private final static Class<Byte> CLASSFROM = Byte.class;
    private final static Class<Double> CLASSТО = Double.class;
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
        if (obj instanceof Byte) {
            Byte val = (Byte) obj;
            return val.doubleValue();
        }
        else {
            return null;
        }
    }
}