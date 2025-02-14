public class ItemSelectedState implements VendingMachineState {

    public void selectItem(VendingMachine vm) {
        System.out.println("You have already selected an item!");
    }

    public void insertCoin(VendingMachine vm) {
        System.out.println("The coin has been accepted.");
        vm.setState(new DispensingState());
    }

    public void dispenseItem(VendingMachine vm) {
        System.out.println("Please insert a coin first.");
    }

    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("Sorry! The vending machine is currently out of order.");
        vm.setState(new OutOfOrderState());
    }
}
