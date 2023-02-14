package repository;

public interface IRepositoryWork<T> {
    void add(T t);
    void delete(T t);
    void save(T t);
    T read();
}
