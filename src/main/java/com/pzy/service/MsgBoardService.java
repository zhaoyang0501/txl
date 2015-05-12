
package com.pzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pzy.entity.Grades;
import com.pzy.entity.MsgBoard;
import com.pzy.repository.MsgBoardRepository;

@Service
public class MsgBoardService {
		
		@Autowired
		private MsgBoardRepository msgBoardRepository;
		public void save(MsgBoard msgBoard){
			msgBoardRepository.save(msgBoard);
		}
		public List<MsgBoard> findByGrades(Grades grades){
			return msgBoardRepository.findByGrades(grades);
		}
}