package chaitanya.shinde.todo.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TodoController {

	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String addTodoPage() {
		return "todo";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addNewTodo(@RequestParam String description, ModelMap model) {
		System.out.println((String) model.get("name"));
		todoService.addTodo((String) model.get("name"), description, LocalDate.now().plusYears(1), false);
		return "redirect:list-todos"; // redirect to a already present path redirect:path_name
	}

	@RequestMapping("/list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("Chaitanya Shinde");
		model.addAttribute("todos", todos);

		return "listTodos";
	}

}
