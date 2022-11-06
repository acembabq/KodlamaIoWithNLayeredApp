package KodlamaIoWithNLayeredApp;

import KodlamaIoWithNLayeredApp.entities.Category;
import KodlamaIoWithNLayeredApp.entities.Course;
import KodlamaIoWithNLayeredApp.entities.Instructor;
import KodlamaIoWithNLayeredApp.business.CategoryManager;
import KodlamaIoWithNLayeredApp.business.CourseManager;
import KodlamaIoWithNLayeredApp.business.InstructorManager;
import KodlamaIoWithNLayeredApp.core.logging.DatabaseLogger;
import KodlamaIoWithNLayeredApp.core.logging.FileLogger;
import KodlamaIoWithNLayeredApp.core.logging.Logger;
import KodlamaIoWithNLayeredApp.core.logging.MailLogger;
import KodlamaIoWithNLayeredApp.dataAccess.category.HibernateCategoryDao;
import KodlamaIoWithNLayeredApp.dataAccess.course.JdbcCourseDao;
import KodlamaIoWithNLayeredApp.dataAccess.instructor.JdbcInstructorDao;

public class Main {

	
	public static void main(String[] args) {
		Category category1 = new Category(1, "Programlama");
		Instructor instructor1 = new Instructor(1, "EnginDemirog", "(MCT) ,PMP VE ITIL");
		Course course1 = new Course(1, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA",50);
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",72.5);
		Course course3 = new Course(3, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)",40);

		Course[] courses = new Course[] { course1, course2, course3 };
		Instructor[] instructors = new Instructor[] { instructor1 };
		Category[] categories = new Category[] { category1 };

		Logger[] loggers = { new DatabaseLogger(), new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.getCourses(courses);
		System.out.println();
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.getCategories(categories);
		System.out.println();
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.getInstructors(instructors);
		
		

	}

}
