package com.disagreed.independentrepo.repository.mybatis;

import com.disagreed.independentrepo.model.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface CategoryMapper {

    Optional<CategoryEntity> getByCategoryId(@Param("categoryId") Long categoryId);

    List<CategoryEntity> getAll();
}