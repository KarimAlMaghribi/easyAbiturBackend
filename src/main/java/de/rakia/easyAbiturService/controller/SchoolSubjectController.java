package de.rakia.easyAbiturService.controller;

import com.lowagie.text.DocumentException;
import de.rakia.easyAbiturService.dto.model.MathGK_Exam_DTO;
import de.rakia.easyAbiturService.dto.model.MathLK_Exam_DTO;
import de.rakia.easyAbiturService.dto.model.PhysikGK_Exam_DTO;
import de.rakia.easyAbiturService.dto.model.PhysikLK_Exam_DTO;
import de.rakia.easyAbiturService.service.SchoolSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SchoolSubjectController {

  @Autowired
  SchoolSubjectService schoolSubjectService;

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/mathGKExams")
  public List<MathGK_Exam_DTO> getAllMathGKExamDTOs() throws IOException, DocumentException {
    return schoolSubjectService.getAllMathGK_Exam_DTOs();
  }


  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/mathLKExams")
  public List<MathLK_Exam_DTO> getAllMathLKExamDTOs() throws IOException, DocumentException {
    return schoolSubjectService.getAllMathLK_Exam_DTOs();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/physikGKExams")
  public List<PhysikGK_Exam_DTO> getAllPhysikGKExamDTOs() throws IOException, DocumentException {
    return schoolSubjectService.getAllPhysikGK_Exam_DTOs();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/physikLKExams")
  public List<PhysikLK_Exam_DTO> getAllPhysikLKExamDTOs() throws IOException, DocumentException {
    return schoolSubjectService.getAllPhysikLK_Exam_DTOs();
  }

}
