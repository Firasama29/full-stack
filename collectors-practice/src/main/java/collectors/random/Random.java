package collectors.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Random {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        integers.add(null);
        integers.add(20);
        integers.add(null);
        integers.add(40);
        integers.add(10);
        integers.add(250);
        int sum = 0;
        for(int i = 0; i < integers.size(); i++) {
             sum = i + i;
        }
        if(sum < 20) {
            System.out.println(integers);
        }
        //System.out.println(integers);

        List<String> strings = new ArrayList<>();
        strings.add("twenty");
        strings.add("forty");
        strings.add("ten");
        strings.add("hundred");

        List<Integer> stringList= new ArrayList<>();

        for(int i = 0; i < strings.size(); i++) {
                stringList.add(strings.get(i).length());
        }
        //System.out.println(strings.stream().sorted().collect(Collectors.toList()));

        int my_array[] = {5, 20, 14, 17, 1, 6, 7, 15, 8, 16, 3, 19, 13, 4, 11, 9, 10, 18, 12, 2};

        List<Integer> list = new ArrayList<>();

//        for() {
//            if(integers.get(i) - (integers.get(i)-1) != 0) {
//                ints.add(integers.get(i));
//            }
//        }
        //System.out.println(ints);

        //System.out.println(list);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car(11.500, "nissan", false));
        carList.add(new Car(40000.00, "honda civic", true));
        carList.add(new Car(7.599, "kia", false));
        carList.add(new Car(95.730, "toyota camri", true));
        carList.add(new Car(43.700, "BMW", true));
        carList.add(new Car(22.199, "audi", false));
        carList.add(new Car(114.600, "Land Rover", true));
        carList.add(new Car(18.695, "Mitsubishi", false));
        carList.add(new Car(19.990, "honda cr-v", false));

        List<Car> cars = new ArrayList<>();

        for(int c = 0; c <= carList.size()-1; c++) {
            if(carList.get(c).isNew()) {
                carList.remove(carList.get(c));
                //System.out.println(carList.get(c).getModel().length());
            }
        }
        //System.out.println("hello" + carList.stream().map(c -> c.getModel().length()).collect(Collectors.toList()));
    }

}

class Car {

    private double price;
    private String model;
    private boolean isNew;

    public Car(double price, String model, boolean isNew) {
        this.price = price;
        this.model = model;
        this.isNew = isNew;
    }

    public Car(){}

    public double getPrice() {
        return this.price;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
