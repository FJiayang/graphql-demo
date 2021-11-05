package top.fjy8018.graphsqldemo.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.graphql.data.GraphQlRepository;
import top.fjy8018.graphsqldemo.entity.CategoryEntity;

/**
 * TODO:
 *
 * @author F嘉阳
 * @date 2021/11/5 10:35
 */
@GraphQlRepository
public interface CategoryEntityRepositoy extends
        CrudRepository<CategoryEntity, Integer>, QuerydslPredicateExecutor<CategoryEntity> {
}
