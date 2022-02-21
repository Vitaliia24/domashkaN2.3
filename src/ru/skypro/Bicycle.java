package ru.skypro;

public class Bicycle extends Vehicle implements ServiceWorks {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("На обслуживании " + getModelName());
        updateTyre();
    }

}
