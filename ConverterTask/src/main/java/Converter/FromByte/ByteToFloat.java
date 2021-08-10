package Converter.FromByte;
import Converter.Converter;
public class ByteToFloat implements Converter{
    private final static Class<Byte> CLASSFROM = Byte.class;
    private final static Class<Float> CLASSТО = Float.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Byte copy = Byte.class.cast(obj);
            return copy.floatValue();
        }
        else {
            return null;
        }
    }
}