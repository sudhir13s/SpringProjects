package dev.ss.springhelp.car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CarReflection {

  public static void main(String[] args) {

    try {
      Class<?> carClass = Class.forName("dev.ss.springhelp.car.Car");
      Constructor<?> constructor = carClass.getDeclaredConstructor(String.class, String.class);
      constructor.setAccessible(true);

      Object carInstance = constructor.newInstance("Toyota", "Camry");
      Car car = (Car) carInstance;
      car.displayInfo();

      Method method1 = carClass.getDeclaredMethod("method1");
      Method method2 = carClass.getDeclaredMethod("method2");

      // Invoke the methods on the instance
      method1.invoke(carInstance);
      method2.invoke(carInstance);

      //
      Field makeField = carClass.getDeclaredField("make");
      Field modelField = carClass.getDeclaredField("model");

      makeField.setAccessible(true);
      modelField.setAccessible(true);

      String makeValue = (String) makeField.get(carInstance);
      String modelValue = (String) modelField.get(carInstance);

      System.out.println("Make: " + makeValue);
      System.out.println("Model: " + modelValue);


    } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
             IllegalAccessException | NoSuchFieldException e) {
      throw new RuntimeException(e);
    }
  }
}