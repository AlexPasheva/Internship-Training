package Converter.FromDouble;
import Converter.Converter;
public class DoubleToFloat implements Converter{
    private final static Class<Double> CLASSFROM = Double.class;
    private final static Class<Float> CLASSТО = Float.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Double copy = Double.class.cast(obj);
            return copy.floatValue();
        }
        else {
            return null;
        }
    }
}
