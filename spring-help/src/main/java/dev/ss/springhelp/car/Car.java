package dev.ss.springhelp.car;

public class Car {

  private final String make;
  private final String model;

  private Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public void displayInfo() {
    System.out.println("Make: " + this.make + ", Model: " + this.model);
  }

  public void method1() {
    System.out.println("Method 1 is called.");
  }

  public void method2() {
    System.out.println("Method 2 is called.");
  }

}