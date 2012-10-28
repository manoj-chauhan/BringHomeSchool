/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.hibernate.beans;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manoj
 */
@XmlRootElement
public class StudentList {
    private List<Student> studentList;

    public void setStudentList(List<Student> student) {
        this.studentList = student;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
    
}
