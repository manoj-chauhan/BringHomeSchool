
package com.techiemanoj;

import hello.hibernate.Test;
import hello.hibernate.beans.Student;
import hello.hibernate.beans.StudentList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/** Example resource class hosted at the URI path "/myresource"
 */
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
