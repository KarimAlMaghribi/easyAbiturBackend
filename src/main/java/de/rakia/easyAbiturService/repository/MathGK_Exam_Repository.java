package de.rakia.easyAbiturService.repository;

import de.rakia.easyAbiturService.model.MathGKExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathGK_Exam_Repository extends JpaRepository<MathGKExam, String> {
  MathGKExam findByYear(int year);
}
