package ru.skypro.transport;

import ru.skypro.ITransport;

public class Bicycle extends Transport implements ITransport {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем мотоцикл " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
