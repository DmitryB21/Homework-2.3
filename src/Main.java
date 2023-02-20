import ru.skypro.transport.Bicycle;
import ru.skypro.transport.Car;
import ru.skypro.ITransport;
import ru.skypro.transport.Truck;

public class Main {

        public static void main(String[] args) {

            ITransport[] transports = {
                    new Bicycle("Урал", 2),
                    new Bicycle("Планета", 2),
                    new Car("Лада", 4),
                    new Car("Жигули", 4),
                    new Truck("МАЗ", 6),
                    new Truck("Камаз", 8)
            };
            for(ITransport iter: transports){
                iter.check();
            }
        }
}