package de.rakia.easyAbiturService.repository;

import de.rakia.easyAbiturService.model.PhysikLK_Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysikLK_Exam_Repository extends JpaRepository<PhysikLK_Exam, String> {

}
