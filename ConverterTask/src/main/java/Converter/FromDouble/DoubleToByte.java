package Converter.FromDouble;
import Converter.Converter;
public class DoubleToByte implements Converter{
    private final static Class<Double> CLASSFROM = Double.class;
    private final static Class<Byte> CLASSТО = Byte.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Double copy = Double.class.cast(obj);
            return copy.byteValue();
        }
        else {
            return null;
        }
    }
}
