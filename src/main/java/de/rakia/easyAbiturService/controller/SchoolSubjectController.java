package de.rakia.easyAbiturService.controller;

import com.lowagie.text.DocumentException;
import de.rakia.easyAbiturService.dto.model.MathGKExamDTO;
import de.rakia.easyAbiturService.dto.model.MathLKExamDTO;
import de.rakia.easyAbiturService.dto.model.PhysikGKExamDTO;
import de.rakia.easyAbiturService.dto.model.PhysikLKExamDTO;
import de.rakia.easyAbiturService.service.SchoolSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/easyAbitur")
public class SchoolSubjectController {

  @Autowired
  SchoolSubjectService schoolSubjectService;

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/mathGK")
  public List<MathGKExamDTO> getAllMathGKExamDTOs() throws IOException, DocumentException {
    return schoolSubjectService.getAllMathGK_Exam_DTOs();
  }


  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/mathLK")
  public List<MathLKExamDTO> getAllMathLKExamDTOs() throws IOException, DocumentException {
    return schoolSubjectService.getAllMathLK_Exam_DTOs();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/physikGK")
  public List<PhysikGKExamDTO> getAllPhysikGKExamDTOs() throws IOException, DocumentException {
    return schoolSubjectService.getAllPhysikGK_Exam_DTOs();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping("/physikLK")
  public List<PhysikLKExamDTO> getAllPhysikLKExamDTOs() throws IOException, DocumentException {
    return schoolSubjectService.getAllPhysikLK_Exam_DTOs();
  }


}
