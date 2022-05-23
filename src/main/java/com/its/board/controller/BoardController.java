package com.its.board.controller;

import com.its.board.dto.BoardDTO;
import com.its.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    //글쓰기 화면 요청
    @GetMapping("/board/save")
    public String saveForm() {
        return "/board/save"; // => views/board/save.jsp 라는 곳에 위치한 파일을 찾음
    }
    // 글작성 메서드
    @PostMapping("/board/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        boolean saveResult = boardService.save(boardDTO);
        if (saveResult) {
            return "redirect:/board/findAll";
        } else {
            return "index";
        }
    }

    // 글목록조회 메서드
    @GetMapping ("/board/findAll")
    public String findAll(Model model) {
        List<BoardDTO>boardDTOList = boardService.findAll();
        model.addAttribute("boardList", boardDTOList);
        return "board/list";
    }

    @GetMapping("/detail")
    public String findById(@RequestParam("id") Long id, Model model) {
        BoardDTO boardDTO = boardService.findById(id);
        System.out.println("boardDTO = " + boardDTO);
        model.addAttribute("board", boardDTO);
        return "detail";
    }

}
