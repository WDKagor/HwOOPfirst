public abstract class Transport implements Maintanable {
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void chek(){
        System.out.println("Обслуживанием " + modelName);
        for (int i=0; i<wheelsCount; i++){
            updateTyre();
        }
    }


}
