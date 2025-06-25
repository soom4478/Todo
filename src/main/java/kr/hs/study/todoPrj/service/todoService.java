package kr.hs.study.todoPrj.service;

import kr.hs.study.todoPrj.dto.todoDTO;

import java.util.List;

public interface todoService {
    public void add(todoDTO dto);
    public void update(todoDTO dto);
    public void delete(int id);
    public List<todoDTO> selectAll();
    public todoDTO select(int id);
    public void complete(int id);
}
