package de.cwansart.application;

import de.cwansart.domain.TodoService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class TodoListController implements Serializable {

    @Inject
    private TodoService service;

    private List<TodoDTO> todos;

    @PostConstruct
    public void init() {
        todos = service.getTodos();
    }

    public TodoService getService() {
        return service;
    }

    public void setService(TodoService service) {
        this.service = service;
    }

    public List<TodoDTO> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoDTO> todos) {
        this.todos = todos;
    }
}
