package StructuralDesignPattern.AdapterDesignPattern;

import StructuralDesignPattern.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapterImple;

public class Client {
    public static void main(String[] args)
    {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImple(new WeightMachineForBabies());
        System.out.println("Weight of Baby in KG : " + weightMachineAdapter.getWeightInKg());
    }
}
