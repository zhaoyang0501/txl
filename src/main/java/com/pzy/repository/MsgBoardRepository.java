package com.pzy.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.pzy.entity.Grades;
import com.pzy.entity.MsgBoard;
public interface MsgBoardRepository extends PagingAndSortingRepository<MsgBoard, Long>,JpaSpecificationExecutor<MsgBoard>{
	public List<MsgBoard> findByGrades(Grades grades);
	public List<MsgBoard> findByReplyfor(MsgBoard reply);
}

