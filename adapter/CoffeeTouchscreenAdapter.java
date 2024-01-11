package DesignPatterns.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{
    OldCoffeeMachine OldVendingMachine ;
    public CoffeeTouchscreenAdapter(OldCoffeeMachine OldVendingMachine){
        this.OldVendingMachine = OldVendingMachine;
    }
    @Override
    public void ChooseFirstSelection() {
        OldVendingMachine.SelectA();
    }

    @Override
    public void ChooseSecondSelection() {
        OldVendingMachine.SelectB();
    }
    
}
