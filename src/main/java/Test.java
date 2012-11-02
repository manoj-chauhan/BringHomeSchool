package hello.hibernate;

import bring.home.school.beans.Privilege;
import bring.home.school.beans.Role;
import bring.home.school.beans.Student;
import bring.home.school.beans.StudentList;
import bring.home.school.beans.User;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {


	private static SessionFactory mSessionFactory;

	private static SessionFactory getSessionFactory(){
		if (mSessionFactory == null) {
			Configuration config = new Configuration();
			mSessionFactory = config.configure().buildSessionFactory();
		}
		return mSessionFactory;
	}

	public StudentList listStudent(){
                String list = "";
                StudentList studentList = new StudentList();
                
		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
                        
                        List<Privilege> users = session.createQuery("FROM Privilege").list();
                       	System.out.println("The no. of privilege are : "+users.size());

                        
                        List<Student> students = session.createQuery("FROM Student").list();
                        studentList.setStudentList(students);

			System.out.println("The no. of students are : "+students.size());

//			for (Student student : students){
//				list = list+"Roll No.:"+student.getRollNumber() +" "+student.getName()+" "+student.getSurname()+"\n"; 
//			}
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
                return studentList;
	}

	public void insertStudent(Student student){

		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.save(student);
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}

//	public static void main(String[] args) {
//		Test test = new Test();
//		test.listStudent();
//		Student student = new Student();
//		student.setName("Deepanshu");
//		student.setSurname("Chauhan");
//		student.setRollNumber(5);
//		test.insertStudent(student);
//		test.listStudent();
//
//	}
}
