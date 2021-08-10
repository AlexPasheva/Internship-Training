package Converter.FromLong;
import Converter.Converter;
public class LongToByte implements Converter{
    private final static Class<Long> CLASSFROM = Long.class;
    private final static Class<Byte> CLASSТО = Byte.class;
    public Class<?> getClassFrom(){
        return CLASSFROM;
    }
    public Class<?> getClassTo(){
        return CLASSТО;
    }
    public Object convert(Object obj, Class<?> targetClass) {
        if(obj.getClass()==CLASSFROM){
            Long copy = Long.class.cast(obj);
            return copy.byteValue();
        }
        else {
            return null;
        }
    }
}