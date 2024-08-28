package feature.IGeneric;

public interface IGeneric <T,E>{
    void addOrUpdate(T t);
    void delete(E id);
    void findById(E id);
}
