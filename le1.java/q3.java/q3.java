
class Mother {
    public static void show() {
        System.out.println("Hello World");
    }
}


class Child extends Mother {
    public static void show() {
        System.out.println("Hello JUET");
    }
}


public class TestPolymorphism {
    public static void main(String[] args) {
        
        
        System.out.println("Scenario 1: Non-static method in Mother and Child");
        Mother m1 = new Child();  
        m1.show();  
       
        System.out.println("\nScenario 2: Static method in Mother only");
        m1 = new Child();  
        m1.show(); 
        
        System.out.println("\nScenario 3: Static method in Child only");
        m1 = new Child();  
        m1.show();  
        
        System.out.println("\nScenario 4: Static method in both Mother and Child");
        m1 = new Child();  
        m1.show();  
    }
}
