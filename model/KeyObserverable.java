package model;

public interface KeyObserverable {
	public void registerObserver(KeyObserver o);
	public void removeObserver(KeyObserver o);

}
