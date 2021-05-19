package de.rakia.easyAbiturService.repository;

import de.rakia.easyAbiturService.model.MathLK_Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathLK_Exam_Repository extends JpaRepository<MathLK_Exam, String> {
  MathLK_Exam findByYear(int year);
}
