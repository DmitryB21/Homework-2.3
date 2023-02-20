package ru.skypro.transport;

import ru.skypro.ITransport;

public class Car extends Transport implements ITransport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем автомобиль " + modelName);
        checkEngine();
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
