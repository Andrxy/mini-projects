package counter.counter;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.setController(this);
        view.setModel(model);
    }

    public void incrementCounter() {
        model.incrementCounter();
    }

    public void decrementCounter() {
        model.decrementCounter();
    }

    public void resetCounter() {
        model.resetCounter();
    }
}
