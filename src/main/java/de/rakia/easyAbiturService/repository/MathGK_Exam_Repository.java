package de.rakia.easyAbiturService.repository;

import de.rakia.easyAbiturService.model.MathGK_Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MathGK_Exam_Repository extends JpaRepository<MathGK_Exam, String> {
  MathGK_Exam findByYear(int year);
}
