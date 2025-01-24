<<<<<<< HEAD
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
=======
. Test for Inheritance
Make a class Mother with int x and void show ( ) as its members. Now create another 
class Child that is derived from the Mother class. Create another class Application to 
test the inheritance. 
class Mother {.......}
class Child extends Mother {// Empty Body } Note: “//” is used for single line comments 
 in java.
class Application {
 public static void main (String args[]){
 Mother m= new Mother ( );
 m.show( ); // show of Mother is called
 Child ch=new Child ( ); 
 ch. show ( ); // show ( ) inherited in Child from Mother is called
 }
>>>>>>> 3589a9621f38dd8077f842bebf5aa55d1ba6f880
