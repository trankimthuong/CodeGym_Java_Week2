package adapter_design;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\NewCodeGym";
        FileCalculator fileCalculator = new FileCalculatorAdapter();
        Client client = new Client(fileCalculator);
        client.printFileSize(path);
    }
}
