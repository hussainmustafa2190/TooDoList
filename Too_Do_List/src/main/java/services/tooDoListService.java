package services;

import java.util.Collection;

public interface tooDoListService<T, K> {
	
		Collection<T> getAll();
		T getById(K key);
		T add(T t);
		T deleteById(String key);
		T update(T t);
		 void delAll();
}
