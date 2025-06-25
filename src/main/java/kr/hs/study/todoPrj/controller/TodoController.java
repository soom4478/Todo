package kr.hs.study.todoPrj.controller;

import kr.hs.study.todoPrj.dto.todoDTO;
import kr.hs.study.todoPrj.service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private todoService service;

    @GetMapping("input")
    public String input() {
        return "input";
    }

    @PostMapping("input_done")
    public String input_done(todoDTO dto) {
        service.add(dto);
        return "index";
    }

    @GetMapping("todo")
    public String todo(Model model) {
        List<todoDTO> list = service.selectAll();
        model.addAttribute("dto", list);
        return "todo";
    }

    @GetMapping("/updateInput/{id}")
    public String updateInput(@PathVariable int id, Model model) {
        todoDTO dto = service.select(id);
        System.out.println(id);
        model.addAttribute("dto", dto);
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        service.delete(id);
        List<todoDTO> list = service.selectAll();
        model.addAttribute("dto", list);
        return "todo";
    }

    @PostMapping("/update_done")
    public String update_done(todoDTO dto, Model model) {
        System.out.println(dto);
        service.update(dto);
        List<todoDTO> list = service.selectAll();
        model.addAttribute("dto", list);
        return  "todo";
    }

    @PostMapping("/complete/{id}")
    public String complete(@PathVariable int id, Model model) {
        service.complete(id);
        List<todoDTO> list = service.selectAll();
        model.addAttribute("dto", list);
        return "todo";
    }
}
