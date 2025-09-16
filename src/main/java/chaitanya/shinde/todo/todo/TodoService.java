package chaitanya.shinde.todo.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo(1, "Chaitanya Shinde", "Learn Spring Boot", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "Aryan Shinde", "Learn Node.js", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(3, "Chaitanya Shinde", "Learn Docker", LocalDate.now().plusYears(1), false));
	}

	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
