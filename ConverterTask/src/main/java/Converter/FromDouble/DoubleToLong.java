package Converter.FromDouble;
import Converter.Converter;
public class DoubleToLong implements Converter{
    private final static Class<Double> CLASSFROM = Double.class;
    private final static Class<Long> CLASSТО = Long.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Double copy = Double.class.cast(obj);
            return copy.longValue();
        }
        else {
            return null;
        }
    }
}