package de.cwansart.domain;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequestScoped
public class TodoRepository {

    @PersistenceContext(unitName = "todo-unit")
    private EntityManager entityManager;
}
