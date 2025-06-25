package kr.hs.study.todoPrj.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class todoDTO {
    private int id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime regDate;
}
