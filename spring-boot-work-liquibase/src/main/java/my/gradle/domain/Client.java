package my.gradle.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by coskun.deniz on 30.01.2017.
 */
@Entity
@Table(name = "CLIENT")
@SequenceGenerator(name = "ID_SEQ", sequenceName = "SEQ_CLIENT_ID", allocationSize = 1)
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQ")
  @Column(name = "ID")
  private long id;

  @Column(name = "TITLE", columnDefinition = "NVARCHAR2")
  private String title;

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
