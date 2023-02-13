package repository;

public interface IRepository<T> {
    void add(T t);
    void delete(T t);
    void save(T t);
    T read();
}
