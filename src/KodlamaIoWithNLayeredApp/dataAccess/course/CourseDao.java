package KodlamaIoWithNLayeredApp.dataAccess.course;

import KodlamaIoWithNLayeredApp.entities.Category;
import KodlamaIoWithNLayeredApp.entities.Course;

public interface CourseDao {
	/*Kurs ismi tekrar edemez
	Kategori ismi tekrar edemez
	Bir kursun fiyatı 0 dan küçük olamaz*/
	void getCourses(Course[] courses);
	void add(Course course);
	boolean checkName (String courseName,Course[] courses);
	boolean checkPrice (Course course);
}
