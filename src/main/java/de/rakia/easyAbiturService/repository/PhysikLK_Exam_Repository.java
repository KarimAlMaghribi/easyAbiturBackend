package de.rakia.easyAbiturService.repository;

import de.rakia.easyAbiturService.model.PhysikLKExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysikLK_Exam_Repository extends JpaRepository<PhysikLKExam, String> {
  PhysikLKExam findByYear(int year);
}
