package chaitanya.shinde.todo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello World";
	}

	@RequestMapping("/html")
	@ResponseBody
	public String testHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Test</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Test Hello World</h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

	@RequestMapping("/say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHelloJSP";
	}

	@RequestMapping("/greetings")
	public String helloPage() {
		return "hello.html";
	}
}
