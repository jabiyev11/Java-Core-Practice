package week10.specific;

public class PalindromeStringChecker implements PropertyChecker<String> {

    @Override
    public boolean checkProperty(String element) {
        return element.equals(new StringBuilder(element).reverse().toString());
    }
}
