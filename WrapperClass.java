public class WrapperClass {
    public static void main(String[] args) {
        int num = 10;
        
        // Autoboxing: converting primitive to object
        Integer obj = num; 
        
        // Unboxing: converting object to primitive
        int primitive = obj; 
        
        System.out.println("Wrapper Object: " + obj);
        System.out.println("Primitive Value: " + primitive);
    }
}
