package DesignVendingMachine;

import DesignVendingMachine.VendingStates.State;

public class Main {
    private static void fillUpInventory(VendingMachine machine) {
        ItemShelf[] slots = machine.getInventory().getInventory();

        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if (i >= 0 && i < 3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i >= 3 && i < 5) {
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            } else if (i >= 5 && i < 7) {
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(13);
            } else if (i >= 7 && i < 9) {
                newItem.setType(ItemType.SODA);
                newItem.setPrice(15);
            } else {
                newItem.setType(ItemType.REDBULL);
                newItem.setPrice(17);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        try {
            System.out.println("|");
            System.out.println("Filling up the inventory");
            System.out.println("|");

            fillUpInventory(machine);
            displayInventory(machine);

            System.out.println("|");
            System.out.println("Clicking on InsertCoinButton");
            System.out.println("|");

            State vendingState = machine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(machine);

            vendingState = machine.getVendingMachineState();
            vendingState.insertCoin(machine, Coin.NICKEL);
            vendingState.insertCoin(machine, Coin.QUATER);

            System.out.println("|");
            System.out.println("Clicking on ProductSelectionButton");
            System.out.println("|");
            vendingState.clickOnStartProductSelectionButton(machine);

            vendingState = machine.getVendingMachineState();
            vendingState.chooseProduct(machine, 102);

            displayInventory(machine);

        } catch (Exception e) {
            displayInventory(machine);
        }
    }

    private static void displayInventory(VendingMachine machine) {
        ItemShelf[] slots = machine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            System.out.println("CodeNumber: " + slots[i].getCode() + "Item: " + slots[i].getItem().getType().name()
                    + "Price: " + slots[i].getItem().getPrice() + "isAvailable: " + !slots[i].isSoldOut());
        }
    }

}
