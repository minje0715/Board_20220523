package com.its.board.controller;

import com.its.board.dto.BoardDTO;
import com.its.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("/save")
    public String titleSave(@ModelAttribute BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        boolean saveResult = boardService.titleSave(boardDTO);
        if (saveResult) {
            return "list";
        } else {
            return "index";
        }
    }

    @GetMapping ("/findAll")
    public String findAll(Model model) {
        List<BoardDTO>boardDTOList = boardService.findAll();
        model.addAttribute("boardList", boardDTOList);
        return "list";
    }
}
