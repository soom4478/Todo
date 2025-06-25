package kr.hs.study.todoPrj.controller;

import kr.hs.study.todoPrj.dto.todoDTO;
import kr.hs.study.todoPrj.service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class homeController {
    @Autowired
    private todoService service;

    @GetMapping()
    public String home(Model model) {
        List<todoDTO> list = service.selectAll();
        model.addAttribute("dto", list);
        return "index";
    }

}
