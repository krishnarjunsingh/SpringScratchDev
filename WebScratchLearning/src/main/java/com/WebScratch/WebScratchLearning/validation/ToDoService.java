package com.WebScratch.WebScratchLearning.validation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.WebScratch.WebScratchLearning.todo.model.Todo;

@Service
public class ToDoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int toDoCount = 3;
	
	static {
		todos.add(new Todo(1, "krishna", "Learning First", new Date(), true));
		todos.add(new Todo(2, "krishna", "Learnind Second", new Date(), false));
		todos.add(new Todo(3, "krishna", "Learning Third", new Date(), false));
	}
	public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
	
}
