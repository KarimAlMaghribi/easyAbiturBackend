package de.rakia.easyAbiturService.service;

import de.rakia.easyAbiturService.dto.response.ResponseFileMessage;
import de.rakia.easyAbiturService.model.*;
import de.rakia.easyAbiturService.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

/*
* #########################################################################################################
* The File Storage Service will use FileDBRepository to provide following methods:
*        store(file): receives MultipartFile object, transform to FileDB object and save it to Database
*        getFile(id): returns a FileDB object by provided Id
*        getAllFiles(): returns all stored files as list of code>FileDB objects
* #########################################################################################################
*
* */

@Service
public class FileStorageService {


    @Autowired
    private MathGK_Exam_Repository mathGK_exam_repository;

    @Autowired
    private MathLK_Exam_Repository mathLK_exam_repository;

    @Autowired
    private PhysikGK_Exam_Repository physikGK_exam_repository;

    @Autowired
    private PhysikLK_Exam_Repository physikLK_exam_repository;

    /*

    @Autowired
    private FileDBRepository fileDBRepository;
*/

   /*
    public FileDB store(MultipartFile file, Long stellenangebotID) throws IOException {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
        stellenausschreibungRepository.findById(""+stellenangebotID)
                .map(stelle -> {
                    stelle.setPdf(FileDB);
                    return stellenausschreibungRepository.save(stelle);
                });
        return fileDBRepository.save(FileDB);
    }

    public void storeLogoFile
            (MultipartFile file, String ident_Id) throws IOException {
        if(!logoImageRepository.existsLogoImageByIdentId(ident_Id)){
            LogoImage logoImage= new LogoImage();
            logoImage.setName(file.getName());
            logoImage.setLogoID(ident_Id);
            logoImage.setData(file.getBytes());
            logoImage.setType(file.getContentType());
            logoImageRepository.save(logoImage);
        }
    }
*/
  public void storeMathLK_Exam
    (MultipartFile file, String ident_Id, int year) throws IOException {
    if(!mathLK_exam_repository.existsById(ident_Id)){
      MathLK_Exam mathLK_Exam = new MathLK_Exam();
;
      mathLK_Exam.setId(ident_Id);
      mathLK_Exam.setPdf(new FileDB(file.getName(),file.getContentType(), file.getBytes() ));
      mathLK_Exam.setYear(year);

     mathLK_exam_repository.save(mathLK_Exam);
    }
  }

  public void storeMathGK_Exam
    (MultipartFile file, String ident_Id, int year) throws IOException {
    if(!mathGK_exam_repository.existsById(ident_Id)){
      MathGK_Exam mathGK_Exam = new MathGK_Exam();

      mathGK_Exam.setId(ident_Id);
      mathGK_Exam.setPdf(new FileDB(file.getName(),file.getContentType(), file.getBytes() ));
      mathGK_Exam.setYear(year);

      mathGK_exam_repository.save(mathGK_Exam);
    }
  }

  public void storePhysikGK_Exam
    (MultipartFile file, String ident_Id, int year) throws IOException {
    if(!physikGK_exam_repository.existsById(ident_Id)){
      PhysikGK_Exam physikGK_Exam = new PhysikGK_Exam();
      physikGK_Exam.setPdf(new FileDB(file.getName(),file.getContentType(), file.getBytes() ));
      physikGK_Exam.setId(ident_Id);
      physikGK_Exam.setYear(year);

      physikGK_exam_repository.save(physikGK_Exam);
    }
  }

  public void storePhysikLK_Exam
    (MultipartFile file, String ident_Id, int year) throws IOException {
    if(!physikLK_exam_repository.existsById(ident_Id)){
      PhysikLK_Exam physikLK_Exam = new PhysikLK_Exam();
      physikLK_Exam.setId(ident_Id);
      physikLK_Exam.setPdf(new FileDB(file.getName(),file.getContentType(), file.getBytes() ));
      physikLK_Exam.setYear(year);
      physikLK_exam_repository.save(physikLK_Exam);
    }
  }

  public MathGK_Exam getMathGK_Exam(int year) {
    MathGK_Exam exam = mathGK_exam_repository.findByYear(year);
    return exam;
  }

  public MathLK_Exam getMathLK_Exam(int year) {
    MathLK_Exam exam = mathLK_exam_repository.findByYear(year);
    return exam;
  }

  public PhysikGK_Exam getPhysikGK_Exam(int year) {
    PhysikGK_Exam exam = physikGK_exam_repository.findByYear(year);
    return exam;
  }

  public PhysikLK_Exam getPhysikLK_Exam(int year) {
    PhysikLK_Exam exam = physikLK_exam_repository.findByYear(year);
    return exam;
  }
}
