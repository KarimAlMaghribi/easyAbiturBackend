package de.rakia.easyAbiturService.service;

import de.rakia.easyAbiturService.dto.model.MathGKExamDTO;
import de.rakia.easyAbiturService.dto.model.MathLKExamDTO;
import de.rakia.easyAbiturService.dto.model.PhysikGKExamDTO;
import de.rakia.easyAbiturService.dto.model.PhysikLKExamDTO;
import de.rakia.easyAbiturService.model.*;
import de.rakia.easyAbiturService.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolSubjectService {

  @Autowired
  MathLK_Exam_Repository mathLK_exam_repository;

  @Autowired
  MathGK_Exam_Repository mathGK_exam_repository;

  @Autowired
  PhysikGK_Exam_Repository physikGK_exam_repository;

  @Autowired
  PhysikLK_Exam_Repository physikLK_exam_repository;

  private List<MathLKExam> getAllMathLK_Exams() {
    return mathLK_exam_repository.findAll();
  }

  private List<MathGKExam> getAllMathGK_Exams() {
    return mathGK_exam_repository.findAll();
  }

  private List<PhysikGKExam> getAllPhysikGK_Exams() {
    return physikGK_exam_repository.findAll();
  }

  private List<PhysikLKExam> getAllPhysikLK_Exams() {
    return physikLK_exam_repository.findAll();
  }

  public List<MathGKExamDTO> getAllMathGK_Exam_DTOs() {
    return this.getAllMathGK_Exams().stream().map(mathGK_exam -> {
      MathGKExamDTO mathGK_exam_dto = new MathGKExamDTO();

      mathGK_exam_dto.setFileId(mathGK_exam.getId());
      mathGK_exam_dto.setYear(mathGK_exam.getYear());

      return mathGK_exam_dto;
    }).collect(Collectors.toList());
  }

  public List<MathLKExamDTO> getAllMathLK_Exam_DTOs() {
    return this.getAllMathLK_Exams().stream().map(mathLK_exam -> {
      MathLKExamDTO mathLK_exam_dto = new MathLKExamDTO();

      mathLK_exam_dto.setFileId(mathLK_exam.getId());
      mathLK_exam_dto.setYear(mathLK_exam.getYear());

      return mathLK_exam_dto;
    }).collect(Collectors.toList());
  }

  public List<PhysikGKExamDTO> getAllPhysikGK_Exam_DTOs() {
    return this.getAllPhysikGK_Exams().stream().map(physikGK_exam -> {
      PhysikGKExamDTO physikGK_exam_dto = new PhysikGKExamDTO();

      physikGK_exam_dto.setYear(physikGK_exam.getYear());
      physikGK_exam_dto.setFileId(physikGK_exam.getId());

      return physikGK_exam_dto;
    }).collect(Collectors.toList());
  }

  public List<PhysikLKExamDTO> getAllPhysikLK_Exam_DTOs() {
    return this.getAllPhysikLK_Exams().stream().map(physikLK_exam -> {
      PhysikLKExamDTO physikLK_exam_dto = new PhysikLKExamDTO();

      physikLK_exam_dto.setYear(physikLK_exam.getYear());
      physikLK_exam_dto.setFileId(physikLK_exam.getId());

      return physikLK_exam_dto;
    }).collect(Collectors.toList());
  }
}



