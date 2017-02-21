package week4;

/**
 *
 * @author Administrator
 */
public class C11PetDog extends C11Pet {

    @Override
    public String speak() {
        return "Ruff Ruff";
    }
    
    @Override
    public String toString(){
        return "My name is " + getPetName() + " I am a dog";
    }
}
