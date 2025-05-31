package start.poly.car0;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car;

    public void setCar(K3Car k3Car){
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("자동차 운전 시작");
        if(k3Car!=null){k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.endEngine();

        }else if(model3Car != null){

            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.endEngine();
        }

    }
}
