package MementoDesignPatternandSnapshotDesignPattern;

import MementoDesignPatternandSnapshotDesignPattern.CareTaker.ConfigurationCareTaker;
import MementoDesignPatternandSnapshotDesignPattern.Originator.ConfigurationOriginator;

import MementoDesignPatternandSnapshotDesignPattern.Memento.ConfigurationMemento;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();
        // Initialize the state of the originator
        ConfigurationOriginator originatorObject = new ConfigurationOriginator(5, 10);

        // save it
        ConfigurationMemento sanpshot1 = originatorObject.createMomento();

        // add it to history
        careTakerObject.addMemento(sanpshot1);

        // originator changing to new state
        originatorObject.setHeight(7);
        originatorObject.setWidth(15);

        // save it
        ConfigurationMemento snapShot2 = originatorObject.createMomento();

        // add it to history

        careTakerObject.addMemento(snapShot2);

        // originator changing to new state

        originatorObject.setHeight(9);
        originatorObject.setWidth(14);

        // UNDo

        ConfigurationMemento restoredStateMememntoObject = careTakerObject.undo();
        originatorObject.restoreMemento(restoredStateMememntoObject);

        System.out.println("Height " + originatorObject.height + " Width : " + originatorObject.width);

    }
}
