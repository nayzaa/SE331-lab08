package camt.cbsd.lab05.dao;

import camt.cbsd.lab05.entity.Course;
import camt.cbsd.lab05.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("DBDataSource")
public class CourseDaoImpl implements CourseDao{
    CourseRepository courseRepository;
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public Course add(Course course){
        return courseRepository.save(course);
    }
}
