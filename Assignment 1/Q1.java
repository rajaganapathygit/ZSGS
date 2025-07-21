public class Q1{
    //Scope of a variable
    int instance;
    static int a;

    public static void main(String[] args){
        int local = 10;
        Q1 var = new Q1();
        System.out.println("Local Variable: "+ local);
        System.out.println("Instance Variable: "+var.instance );
        System.out.println("Static Variable: "+a);
        {
            int b = 20;
            System.out.println("Block Variable: "+b);
        }
    
        final String name = "Raja";
        System.out.println("Final Variable: "+name);
    }
    
}