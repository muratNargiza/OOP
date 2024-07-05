package lab5;

public interface AnimalList {
	int size();
	boolean add(Animal animal);
	Animal get(int index);
	void set(int index, Animal element);
	void clear();
}
