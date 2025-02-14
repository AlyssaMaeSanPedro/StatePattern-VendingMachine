public class DispensingState implements VendingMachineState {

    public void selectItem(VendingMachine vm) {
        System.out.println("Dispensing in progress. Please wait for the item to be dispensed before another purchase.");
    }

    public void insertCoin(VendingMachine vm) {
        System.out.println("Coin not accepted. Dispensing in progress");
    }

    public void dispenseItem(VendingMachine vm) {
        System.out.println("You may now claim your item. Enjoy!");
        vm.setState(new IdleState());
    }

    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Sorry! The vending machine is currently out of order.");
        vm.setState(new OutOfOrderState());
    }
}
