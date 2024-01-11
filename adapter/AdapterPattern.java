package DesignPatterns.adapter;

public class AdapterPattern {
    public static void main(String[] args){
        OldCoffeeMachine machine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(machine);
        adapter.ChooseFirstSelection();
        adapter.ChooseSecondSelection();
    }
}
