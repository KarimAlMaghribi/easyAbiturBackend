package de.rakia.easyAbiturService.repository;

import de.rakia.easyAbiturService.model.PhysikGK_Exam;
import de.rakia.easyAbiturService.model.PhysikLK_Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysikGK_Exam_Repository extends JpaRepository<PhysikGK_Exam, String> {
  PhysikGK_Exam findByYear(int year);
}
