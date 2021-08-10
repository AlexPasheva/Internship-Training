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
                new (), new LongConverter(), new IntegerConverter());
        for (Converter converter : converters) {
            classes.put(converter.getType(), converter);
        }
    }
}

