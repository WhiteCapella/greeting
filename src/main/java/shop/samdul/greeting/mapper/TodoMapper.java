package shop.samdul.greeting.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.samdul.greeting.entity.TodoEntity;

@Mapper
public interface TodoMapper {
    List<TodoEntity> findAll();

    TodoEntity findById(Integer id);
}
