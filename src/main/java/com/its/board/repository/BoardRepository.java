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
    public int save(BoardDTO boardDTO) {
        System.out.println("Repository boardDTO = " + boardDTO);
        return sql.insert("Board.titleSave", boardDTO);
    }

    public List<BoardDTO> findAll() {
       return sql.selectList("Board.findAll");
    }

    public BoardDTO findById(Long id) {
        System.out.println("repository =" + id);
       return sql.selectOne("Board.findById",id);
    }
}
