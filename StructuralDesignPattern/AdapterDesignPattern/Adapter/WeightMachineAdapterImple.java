package StructuralDesignPattern.AdapterDesignPattern.Adapter;

import StructuralDesignPattern.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImple implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImple(WeightMachine weightMachine)
    {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg()
    {
        double weightInPounds = weightMachine.getWeightInPound();

        double weightInKG = weightInPounds * 0.75;

        return weightInKG;
    }
    
}
