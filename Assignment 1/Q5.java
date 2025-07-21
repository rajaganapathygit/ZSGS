class Static{
    static{
        System.out.println("This is static block");
    }
    {
        System.out.println("This is instance block");
    }
}

public class Q5 {
    static{
        System.out.println("This is also static block");
    }
    public static void main(String[] args){
        System.out.println("Main Method");
        Static obj = new Static();
        Static obj1 = new Static();
    }
}
