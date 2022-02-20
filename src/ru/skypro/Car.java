package ru.skypro;

public class Car extends Vehicle implements ServiceWorks {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        System.out.println("На обслуживании " + getModelName());
        updateTyre();
        checkEngine();
    }

}
