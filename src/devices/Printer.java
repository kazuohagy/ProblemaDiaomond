package devices;

public class Printer extends Device {
    public Printer(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        // TODO Auto-generated method stub
        System.out.println("Printer processing:" + doc);
    }

    public void print(String doc) {
        System.out.println("Printer printing:" + doc);
    }
}
