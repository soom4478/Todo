package kr.hs.study.todoPrj.mapper;

import kr.hs.study.todoPrj.dto.todoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface todoMapper {
    public void add(todoDTO dto);
    public void update(todoDTO dto);
    public void delete(int id);
    public List<todoDTO> selectAll();
    public todoDTO select(int id);
    public void complete(int id);
}
