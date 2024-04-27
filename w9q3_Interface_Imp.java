interface Car {
    void engineCapacity();

    void price();

    void modelYear();

    void company();

}

class Baleno implements Car{

    @Override
    public void company() {
        // TODO Auto-generated method stub
        System.out.println("The company of the car is Maruti");
    }

    @Override
    public void engineCapacity() {
        // TODO Auto-generated method stub
        System.out.println("The capacity of the engine is 1197cc");
    }

    @Override
    public void modelYear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void price() {
        // TODO Auto-generated method stub
        
    }
    
}

public class w9q3_Interface_Imp {

}
