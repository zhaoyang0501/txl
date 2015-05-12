package com.pzy.repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.pzy.entity.Grades;
import com.pzy.entity.News;
public interface GradesRepository extends PagingAndSortingRepository<Grades, Long>,JpaSpecificationExecutor<Grades>{

}

