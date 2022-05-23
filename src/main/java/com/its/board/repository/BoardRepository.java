package com.its.board.repository;

import com.its.board.dto.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public int titleSave(BoardDTO boardDTO) {
        System.out.println("Repository boardDTO = " + boardDTO);
        return sql.insert("Board.titleSave", boardDTO);
    }

    public List<BoardDTO> findAll() {
       return sql.selectList("Board.findAll");
    }
}