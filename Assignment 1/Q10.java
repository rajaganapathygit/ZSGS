class Friends{
}
public class Q10 {
    public static void main(String[] args){
        Friends obj1 = new Friends();
        if(obj1 instanceof Friends){
            System.out.print("It is the instance of the class");
        }
        else{
            System.out.print("It is not the instance of the class");
        }
    }
}
