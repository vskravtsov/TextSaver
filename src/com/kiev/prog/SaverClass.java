package com.kiev.prog;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaverClass {

    public void saveWithAnnotation() throws InvocationTargetException, IllegalAccessException {
        TextContainer tc = new TextContainer();
        Class<?> cls = TextContainer.class;
        if (cls.isAnnotationPresent(SaveTo.class)) {
            SaveTo st = cls.getDeclaredAnnotation(SaveTo.class);
            String path = st.path();

            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(Saver.class)) {
                    method.invoke(tc, path);
                }
            }
        }
    }
}