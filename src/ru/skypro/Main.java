package ru.skypro;

public class Main {

    public static void main(String[] args) {

        ServiceWorks [] vehicleAtService = new ServiceWorks[] { new Car("car1", 4),
        new Car("car2", 4),
        new Truck("truck1", 6),
        new Truck("truck2", 6),
        new Bicycle("bicycle1", 2),
        new Bicycle("bicycle2", 2)};

        ServiceStation station = new ServiceStation();

        for (ServiceWorks vehicle: vehicleAtService) {
            station.check(vehicle);
        }
    }
}
