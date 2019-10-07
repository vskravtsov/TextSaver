package com.kiev.prog;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args){
        SaverClass sc = new SaverClass();
        try{
            sc.saveWithAnnotation();
        } catch (IllegalAccessException|InvocationTargetException e) {

        }

    }
}
