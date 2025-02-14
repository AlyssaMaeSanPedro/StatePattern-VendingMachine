public class OutOfOrderState implements VendingMachineState {
    public void selectItem(VendingMachine vm) {
        System.out.println("Sorry! The vending machine is currently out of order.");
    }

    public void insertCoin(VendingMachine vm) {
        System.out.println("Sorry! The vending machine is currently out of order.");
    }

    public void dispenseItem(VendingMachine vm) {
        System.out.println("Sorry! The vending machine is currently out of order.");
    }

    public void setOutOfOrder(VendingMachine vm) {
        System.out.println("The vending machine is already set to 'out of order.'");
    }
}
