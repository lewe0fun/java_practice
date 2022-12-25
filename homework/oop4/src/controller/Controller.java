package controller;

import data.GroupStream;

public interface Controller<E, I> {
    E save(E entity);

    E findBuId(I id);
}
