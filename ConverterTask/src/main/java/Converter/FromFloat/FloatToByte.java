package Converter.FromFloat;
import Converter.Converter;
public class FloatToByte implements Converter{
    private final static Class<Float> CLASSFROM = Float.class;
    private final static Class<Byte> CLASSТО = Byte.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Float copy = Float.class.cast(obj);
            return copy.byteValue();
        }
        else {
            return null;
        }
    }
}