package projects.stuff;

public class Bubble {

    private final double BUBBLE_VOLUME = 0.3;
    private String bubbleGasComposition;

    //содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
    public Bubble(String bubbleGasComposition) {
        this.bubbleGasComposition = bubbleGasComposition;
    }

    public String getBubbleGasComposition() {
        return bubbleGasComposition;
    }

    public void setBubbleGasComposition(String bubbleGasComposition) {
        this.bubbleGasComposition = bubbleGasComposition;
    }

    //есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
    public void bubbleBurst() {
        System.out.println("Cramp!");
    }

    //есть публичный метод double getVolume(), возвращающий обьем пузырьк
    public double getVolume() {
        return BUBBLE_VOLUME;
    }
}
