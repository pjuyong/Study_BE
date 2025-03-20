package nested.inner.ex1;

public class Car {
    private String model;
    private int chargLevel;
    private Engine engine;

    public Car(String model, int chargLevel) {
        this.model = model;
        this.chargLevel = chargLevel;
        this.engine = new Engine(this);
    }

    // Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    // Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
