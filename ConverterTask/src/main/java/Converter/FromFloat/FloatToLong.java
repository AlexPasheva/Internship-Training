package Converter.FromFloat;
import Converter.Converter;
public class FloatToLong implements Converter{
    private final static Class<Float> CLASSFROM = Float.class;
    private final static Class<Long> CLASSТО = Long.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Float copy = Float.class.cast(obj);
            return copy.longValue();
        }
        else {
            return null;
        }
    }
}