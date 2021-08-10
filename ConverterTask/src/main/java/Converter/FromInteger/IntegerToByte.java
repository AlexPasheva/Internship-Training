package Converter.FromInteger;
import Converter.Converter;
public class IntegerToByte implements  Converter{
    private final static Class<Integer> CLASSFROM = Integer.class;
    private final static Class<Byte> CLASSТО = Byte.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Integer copy = Integer.class.cast(obj);
            return copy.byteValue();
        }
        else {
            return null;
        }
    }
}
