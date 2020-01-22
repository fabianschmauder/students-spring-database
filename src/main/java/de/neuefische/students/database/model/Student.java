package de.neuefische.students.database.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
  @Id
  private String id;
  private String name;

  private long matrikelnummer;

  public Student(String id, String name, long matrikelnummer) {
    this.id = id;
    this.name = name;
    this.matrikelnummer = matrikelnummer;
  }

  public String getName() {
    return this.name;
  }

  public void setString(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getMatrikelnummer() {
    return matrikelnummer;
  }

  public void setMatrikelnummer(long matrikelnummer) {
    this.matrikelnummer = matrikelnummer;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", matrikelnummer=" + matrikelnummer + ", name=" + name + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (matrikelnummer ^ (matrikelnummer >>> 32));
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (matrikelnummer != other.matrikelnummer)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


}
