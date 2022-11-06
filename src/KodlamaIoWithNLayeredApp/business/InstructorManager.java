package KodlamaIoWithNLayeredApp.business;

import KodlamaIoWithNLayeredApp.core.logging.Logger;
import KodlamaIoWithNLayeredApp.dataAccess.instructor.InstructorDao;
import KodlamaIoWithNLayeredApp.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;

	}
	
	public void getInstructors(Instructor[] instructors) {
		instructorDao.getInstructors(instructors);
		for (Logger logger : loggers) {
			for (Instructor instructor : instructors) {
				logger.log(instructor.getInstrctrName());
			}
		}
		
	}

}
