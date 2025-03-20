package nested.annoymous;

import nested.local.Printer;

public class AannoymousOuter {
    private int outerInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("LocalVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outerInstanceVar = " + outerInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer..class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AannoymousOuter localOuterV1 = new AannoymousOuter();
        localOuterV1.process(2);
    }
}
