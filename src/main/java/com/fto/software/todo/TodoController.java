package com.fto.software.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {
    @RequestMapping(value = "todo", method = RequestMethod.GET)
    public String getTodoPage(ModelMap model){
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1l, "JWS", "JWS for soft", LocalDate.now().plusMonths(5)));
        todos.add(new Todo(2l, "Azure", "Azure for soft", LocalDate.now().plusYears(2)));

        model.put("todos", todos);
        return "todo";
    }
}
