package ru.skypro.transport;

import ru.skypro.ITransport;

public class Truck extends Transport implements ITransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем грузовик " + modelName);
        checkEngine();
        checkTrailer();
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
