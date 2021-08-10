package Converter.FromInteger;
import Converter.Converter;
public class IntegerToDouble implements Converter{
    private final static Class<Integer> CLASSFROM = Integer.class;
    private final static Class<Double> CLASSТО = Double.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Integer copy = Integer.class.cast(obj);
            return copy.doubleValue();
        }
        else {
            return null;
        }
    }
}