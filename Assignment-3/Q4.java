//4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.

class Vehicle {
    int vehicle_id=0;
    String brand_name;
    double price;
    static int count = 1;
    Vehicle(int vehicle_id,String brand_name,double price){
        this.vehicle_id = vehicle_id+1;
        this.brand_name = brand_name;
        this.price = price;
        count++;
    }
    void display(){
        
    }
    public static void main(String[] args){
        Vehicle v1 = new Vehicle(100,"Audi",100000);
        Vehicle v2 = new Vehicle(101,"Audi",100000);
        Vehicle v3 = new Vehicle(100,"Audi",100000);
        Vehicle v4 = new Vehicle(100,"Audi",100000);

    }
}
