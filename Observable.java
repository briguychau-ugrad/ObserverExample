import java.util.*;
public class Observable {
	private Set<Observer> observers;
	public Observable() {
		observers = new HashSet<Observer>();
	}
	public boolean addObserver(Observer obs) {
		return observers.add(obs);
	}
	public boolean removeObserver(Observer obs) {
		if (observers.contains(obs)) {
			observers.remove(obs);
			return true;
		} else {
			return false;
		}
	}
	public void updateObservers(int num) {
		for (Observer obs : observers) {
			obs.update(num);
		}
	}
}
