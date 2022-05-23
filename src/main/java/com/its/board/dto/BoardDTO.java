package com.its.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private int id;
    private String boardTitle;
    private String boardWriter;
    private String boardPassword;
    private String boardContents;
    private int boardHits;
    private Timestamp boardCreatedDate;
}
