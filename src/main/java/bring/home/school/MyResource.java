
package bring.home.school;

import hello.hibernate.Test;
import bring.home.school.beans.Student;
import bring.home.school.beans.StudentList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public StudentList getStudent() {
        Test test = new Test();
	return	test.listStudent();
        
//		Student student = new Student();
//		student.setName("Deepanshu");
//		student.setSurname("Chauhan");
//		student.setRollNumber(5);
//		test.insertStudent(student);
//		test.listStudent();
//        return "Hi there! This is Manoj.";
    }
}
