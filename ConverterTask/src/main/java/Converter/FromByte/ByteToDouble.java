package Converter.FromByte;
import Converter.Converter;
public class ByteToDouble implements Converter{
    private final static Class<Byte> CLASSFROM = Byte.class;
    private final static Class<Double> CLASSТО = Double.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Byte copy = Byte.class.cast(obj);
            return copy.doubleValue();
        }
        else {
            return null;
        }
    }
}