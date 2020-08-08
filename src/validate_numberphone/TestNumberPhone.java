package validate_numberphone;

public class TestNumberPhone {
    private static NumberPhone numberPhone;

    public static final String[] validNumberPhone = new String[] {"(84)-(0978489648)", "(04)-(0178489648)", "(84)-(0123456789)"};
    public static final String[] invalidNumberPhone = new String[] {"(84))-(0978489648)", "(84)(0978489648)", "(84)-(097848968)", "84)-(0978489648)"};

    public static void main(String[] args) {
        numberPhone = new NumberPhone();
        for(String number:validNumberPhone){
            boolean isvalid = numberPhone.validate(number);
            System.out.println("Numberphone is: " + number + " is valid: " + isvalid);
        }
        for(String number:invalidNumberPhone){
            boolean isvalid = numberPhone.validate(number);
            System.out.println("Numberphone is: " + number + " is valid: " + isvalid);
        }
    }
}
