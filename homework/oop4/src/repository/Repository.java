package repository;

public interface Repository <E,I>{
    E save (E entity);
    E findBuId(I id);
}
