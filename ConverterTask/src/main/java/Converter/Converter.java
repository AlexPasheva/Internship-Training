package Converter;
import java.util.Collection;

public interface Converter {
    Class<?> getClassFrom();
    Class<?> getClassTo();
    Object convert(Object obj, Class<?> targetClass);
}
