package de.rakia.easyAbiturService.repository;

import de.rakia.easyAbiturService.model.PhysikGKExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysikGK_Exam_Repository extends JpaRepository<PhysikGKExam, String> {
  PhysikGKExam findByYear(int year);
}
