package pl.sda.poznan.observer;

public class PropertyChangedEventArgs<T> {

    private T source;
    private String propertyName;
    private Object newValue;
    private Object oldValue;

    public PropertyChangedEventArgs(T source, String propertyName, Object newValue, Object oldValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
        this.oldValue = oldValue;
    }

    public T getSource() {
        return source;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public Object getNewValue() {
        return newValue;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public void setOldValue(Object oldValue) {
        this.oldValue = oldValue;
    }
}
