package Converter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import Converter.common.Pair;
import Converter.FromByte.*;
import Converter.FromFloat.*;
import Converter.FromDouble.*;
import Converter.FromInteger.*;
import Converter.FromLong.*;

public class ConverterFactory {
    private final Map<Pair<Class<?>,Class<?>>, Converter> supportedConvertions = new HashMap<>();

    public ConverterFactory(){
        fillMap();
    }

    public Object convert(Object obj, Class<?> targetClass) {
        Pair<Class<?>,Class<?>> key = new Pair<>(obj.getClass(),targetClass);
        if(supportedConvertions.containsKey(key)) {
            return supportedConvertions.get(key).convert(obj, targetClass);
        } else {
            throw new IllegalArgumentException("Class conversion not supported");
        }
    }

    private void fillMap() {
        List<Converter> converters = Arrays.asList(new ByteToDouble(), new ByteToFloat(),
                new ByteToInteger(), new ByteToLong(), new DoubleToByte(), new DoubleToFloat(), new DoubleToInteger(),
                new DoubleToInteger(), new DoubleToLong(), new FloatToDouble(), new FloatToByte(), new FloatToInteger(),
                new FloatToLong(), new IntegerToByte(), new IntegerToDouble(), new IntegerToFloat(), new IntegerToLong(),
                new LongToByte(), new LongToDouble(), new LongToFloat(), new LongToInteger());
        for (Converter converter : converters) {
            Pair<Class<?>, Class<?>> key = new Pair<>(converter.getClassFrom(), converter.getClassTo());
            supportedConvertions.put(key, converter);
        }
    }

    public Map<Pair<Class<?>, Class<?>>, Converter> getSupportedConvertions() {
        return supportedConvertions;
    }
}

