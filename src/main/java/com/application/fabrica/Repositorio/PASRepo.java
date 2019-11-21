package com.application.fabrica.Repositorio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface PASRepo extends CrudRepository {
    Iterable findAll(Sort arg0);

    Page findAll(Pageable arg0);
}
