package Converter.FromInteger;
import Converter.Converter;
public class IntegerToLong implements Converter{
    private final static Class<Integer> CLASSFROM = Integer.class;
    private final static Class<Long> CLASSТО = Long.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Integer copy = Integer.class.cast(obj);
            return copy.longValue();
        }
        else {
            return null;
        }
    }
}