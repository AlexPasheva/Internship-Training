package Converter.FromDouble;
import Converter.Converter;
public class DoubleToByte implements Converter{
    private final static Class<Double> CLASSFROM = Double.class;
    private final static Class<Byte> CLASSТО = Byte.class;
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
        if (obj instanceof Double) {
            Double val = (Double) obj;
            return val.byteValue();
        }
        else {
            return null;
        }
    }
}
