package Converter.FromLong;
import Converter.Converter;
public class LongToDouble implements Converter{
    private final static Class<Long> CLASSFROM = Long.class;
    private final static Class<Double> CLASSТО = Double.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Long copy = Long.class.cast(obj);
            return copy.doubleValue();
        }
        else {
            return null;
        }
    }
}
