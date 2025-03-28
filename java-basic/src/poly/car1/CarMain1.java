package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.driver();

        //차량 변경(Model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.driver();

        //차량 변경(NewCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.driver();
    }
}
