package de.rakia.easyAbiturService.repository;

import de.rakia.easyAbiturService.model.MathLKExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathLK_Exam_Repository extends JpaRepository<MathLKExam, String> {
  MathLKExam findByYear(int year);
}
