package de.rakia.easyAbiturService.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "physikLK_Exam")
public class PhysikLK_Exam {
  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  int year;

  @OneToOne(fetch = FetchType.LAZY, optional = true, cascade= CascadeType.ALL)
  @JoinColumn(name = "files_id", nullable = true)
  private FileDB pdf;
}
