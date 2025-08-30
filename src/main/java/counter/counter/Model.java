package counter.counter;

import counter.AbstractModel;

import java.beans.PropertyChangeListener;

public class Model extends AbstractModel {
    int counter;
    public static final String CURRENT = "current";

    public Model() {
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
        firePropertyChange(CURRENT);
    }

    public void incrementCounter() {
        counter++;
        firePropertyChange(CURRENT);
    }

    public void decrementCounter() {
        counter--;
        firePropertyChange(CURRENT);
    }

    public void resetCounter() {
        counter = 0;
        firePropertyChange(CURRENT);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
        firePropertyChange(CURRENT);
    }
}
