package observer.example;

public interface Subject {

	public void removeObserver(ConcreteObserver obs);

	public void registerObserver(ConcreteObserver obs);

	public void notifyObservers(String m);

}
