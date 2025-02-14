public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.insertCoin();  
        vm.selectItem();  
        vm.insertCoin(); 
        vm.dispenseItem();

        vm.setOutOfOrder();
        vm.selectItem(); 
    }
}
