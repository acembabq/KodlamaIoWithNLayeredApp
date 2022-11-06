package KodlamaIoWithNLayeredApp.business;

import KodlamaIoWithNLayeredApp.core.logging.Logger; 
import KodlamaIoWithNLayeredApp.dataAccess.course.CourseDao;
import KodlamaIoWithNLayeredApp.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses= {};

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void getCourses(Course[] courses) {

		courseDao.getCourses(courses);
		for (Logger logger : loggers) {
			for (Course course : courses) {
				logger.log(course.getCourseName());

			}

		}

	}

	public void add(Course course) throws Exception {

		if (courseDao.checkName(course.getCourseName(), courses)==true) {
			throw new Exception("Course name has already been exist!");
		}

		else if (courseDao.checkPrice(course) == true) {
			throw new Exception("Course price cannot be less than 0!");

		} else {
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}

	}
}
