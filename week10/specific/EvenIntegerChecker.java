package week10.specific;

public class EvenIntegerChecker implements PropertyChecker<Integer>{

    @Override
    public boolean checkProperty(Integer element) {
        return element % 2 == 0;
    }
    
}
