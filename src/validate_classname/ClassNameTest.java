package validate_classname;

public class ClassNameTest {
    public static ClassName className;
    public static final String[] validClassName = new String[] {"A1234G", "C1020K", "P0000M", "A9010I", "P0101H"};
    public static final String[] invalidClassName = new String[] {"B1234G", "AB1230H", "A10009M", "a1234M", "P12M" , "A2345Z", "C1234g", "C0000Gh"};

    public static void main(String[] args) {
        className = new ClassName();
        for(String name: validClassName){
            boolean isvalid = className.validate(name);
            System.out.println("Class name: " + name + " is valid: " + isvalid);
        }
        for(String name: invalidClassName){
            boolean isvalid = className.validate(name);
            System.out.println("Class name: " + name + " is valid: " + isvalid);
        }
    }
}
