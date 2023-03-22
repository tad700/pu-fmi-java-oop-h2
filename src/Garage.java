import javax.swing.*;
import java.util.ArrayList;

public class Garage {
    public String name = "I Need Speed";


    ArrayList<Car> cars = new ArrayList<Car>();


    public void addCar(Car obj) {
        cars.add(obj);
    }

    /*public void removeCar(Car car, JComboBox comboBox) {
        for (Car car1: cars) {
            if (car.getLicensePlate()==comboBox.getSelectedItem()) {
                comboBox.removeItem(comboBox.getSelectedItem());
                cars.remove(car1);

            }
        }


    }*/
    public void deleteAnimal(int id) {

        cars.removeIf(car -> car.getId() == id);

    }

    public void fillCarsCombo(JComboBox combo) {

        combo.removeAllItems();
        for (Car car : cars) {
            combo.addItem(car.toString());

        }

    }

    }










