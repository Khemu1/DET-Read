package DET;

public class Main {
    public static void main(String[] args) {

        ReadWrite readWrite = new ReadWrite(10);

        System.out.println("Initial Value: " + readWrite.getVal());
        System.out.println("Is Dirty: " + readWrite.isDirty());

        readWrite.setVal(20);

        System.out.println("Updated Value: " + readWrite.getVal());
        System.out.println("Is Dirty: " + readWrite.isDirty());
    }
}
