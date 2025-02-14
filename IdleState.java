public class IdleState implements VendingMachineState {
    
    public void selectItem(VendingMachine vm) {
        System.out.println("You have selected an item.");
        vm.setState(new ItemSelectedState());
    }

    public void insertCoin(VendingMachine vm) {
        System.out.println("Please select an item first.");
    }

    public void dispenseItem(VendingMachine vm) {
        System.out.println("There is no selected item to dispense. Please pick an item first!");
    }

    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Sorry! The vending machine is currently out of order.");
        vm.setState(new OutOfOrderState());
    }
}
