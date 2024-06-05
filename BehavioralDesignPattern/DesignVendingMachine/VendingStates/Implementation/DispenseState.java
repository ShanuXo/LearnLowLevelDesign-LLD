package DesignVendingMachine.VendingStates.Implementation;

import DesignVendingMachine.Coin;
import DesignVendingMachine.Item;
import DesignVendingMachine.VendingStates.State;
import DesignVendingMachine.VendingMachine;
import java.util.List;

public class DispenseState implements State {
    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently Vending Machine is in Dispense state");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Insert coin button can not clicked on Dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("product selection button can not be clicked in dispense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Coin can not be inserted in Dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not returned in dispense state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("refund can not be happen in dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in dispense state");
    }
}