// Mother class
class Mother {
    // Mother class method
    public void show() {
        System.out.println("Hello World");
    }
}

// Child class
class Child extends Mother {
    // Overriding the show() method in the child class
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}

// Application class (to run the program)
public class TestOverriding {
    public static void main(String[] args) {
        // Creating an object of Mother class
        Mother mother = new Mother();
        mother.show();  // Output: Hello World
        
        // Creating an object of Child class
        Child child = new Child();
        child.show();   // Output: Hello JUET
    }
}
