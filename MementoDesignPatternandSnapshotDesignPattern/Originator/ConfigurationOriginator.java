package MementoDesignPatternandSnapshotDesignPattern.Originator;

import java.lang.module.Configuration;

import MementoDesignPatternandSnapshotDesignPattern.Memento.ConfigurationMemento;

public class ConfigurationOriginator {
    public int height;
    public int width;

    public ConfigurationOriginator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigurationMemento createMomento() {
        return new ConfigurationMemento(this.height, this.width);
    }

    public void restoreMemento(ConfigurationMemento mementoTobeRestored) {
        this.height = mementoTobeRestored.height;
        this.width = mementoTobeRestored.width;
    }
}
