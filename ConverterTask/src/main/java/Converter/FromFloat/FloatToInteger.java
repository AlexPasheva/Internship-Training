package Converter.FromFloat;
import Converter.Converter;
public class FloatToInteger implements Converter{
    private final static Class<Float> CLASSFROM = Float.class;
    private final static Class<Integer> CLASSТО = Integer.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Float copy = Float.class.cast(obj);
            return copy.intValue();
        }
        else {
            return null;
        }
    }
}
