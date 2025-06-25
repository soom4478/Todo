package kr.hs.study.todoPrj.service;

import kr.hs.study.todoPrj.dto.todoDTO;
import kr.hs.study.todoPrj.mapper.todoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class todoServiceImpl implements todoService {
    @Autowired
    private todoMapper mapper;

    @Override
    public void add(todoDTO dto) {
        mapper.add(dto);
    }

    @Override
    public void update(todoDTO dto) {
        mapper.update(dto);
    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
    }

    @Override
    public List<todoDTO> selectAll() {
        List<todoDTO> list = mapper.selectAll();
        return list;
    }

    @Override
    public todoDTO select(int id) {
        todoDTO dto = mapper.select(id);
        return dto;
    }

    @Override
    public void complete(int id) {
        mapper.complete(id);
    }
}
