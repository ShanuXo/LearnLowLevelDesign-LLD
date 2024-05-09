package DesignVendingMachine.VendingStates.Implementation;

import java.util.List;

import DesignVendingMachine.Coin;
import DesignVendingMachine.Item;
import DesignVendingMachine.VendingMachine;
import DesignVendingMachine.VendingStates.State;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Currently Vending Machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection State");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert coin in Selection State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // Step-1 Get item of codeNumber
        Item item = machine.getInventory().getItem(codeNumber);
        // Step-2 Total amount paid by User
        int paidByUser = 0;
        for (Coin coin : machine.getCoinList()) {
            paidByUser = paidByUser + coin.value;
        }

        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price : " + item.getPrice()
                    + " and you paid : " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("Insufficient amount");
        } else if (paidByUser >= item.getPrice()) {
            if (paidByUser > kitem.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in the Coin Dispense Tray " + returnChangeMoney);
        return returnChangeMoney;
    }

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in Selection State");
    }

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in Coin Dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection State");
    }
}
