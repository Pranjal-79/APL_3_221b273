// Class One with a parameterized constructor
class One {
    // Parameterized constructor in class One
    public One(int x) {
        System.out.println("Parameterized constructor in class One: " + x);
    }
}

// Class Two extends One
class Two extends One {
    // Constructor in class Two that calls the parameterized constructor of class One
    public Two() {
        // Explicitly calling the constructor of class One with an integer argument
        super(5);  // Now, class Two calls One's constructor with an integer argument
        System.out.println("Constructor in class Two.");
    }
}

// Application class
public class TestParameterizedConstructor {
    public static void main(String[] args) {
        Two obj = new Two();  // Creating an object of class Two
    }
}
