package observer_design;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
