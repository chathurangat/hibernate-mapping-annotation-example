package com.chathurangaonline.examples.dao.impl;

import com.chathurangaonline.examples.dao.CourseDao;
import com.chathurangaonline.examples.dao.LecturerDao;
import com.chathurangaonline.examples.model.Course;
import com.chathurangaonline.examples.model.Lecturer;
import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class LecturerDaoImplTest {

    private static LecturerDao lecturerDao;
    private static CourseDao courseDao;

    @BeforeMethod
    public void setUp(){
        this.getInstance();
    }


    @Test
    public void testSave() throws Exception {

        //saving the lecturer
        Lecturer lecturer = new Lecturer();
        lecturerDao.save(lecturer);
        Assert.assertNotNull(lecturer.getId());

        //saving the course
        Course course = new Course();
        course.setCourseName("Java");
        course.setLecturer(lecturer);
        courseDao.save(course);
        Assert.assertNotNull(course.getId());

        System.out.println(" retrieving the lecturer record with id ["+lecturer.getId()+"]");
        Lecturer  lecturer2  = lecturerDao.findById(lecturer.getId());
        System.out.println("lecturer found with id ["+lecturer2.getId()+"] retrieved");
        System.out.println("course retrieving .......");
        List<Course>  courseList1 = lecturer2.getCourseList();
        System.out.println(" course list retrieved ["+courseList1.size()+"]");
    }



    private void getInstance(){
        if(lecturerDao==null){
            lecturerDao = new LecturerDaoImpl(Lecturer.class);
        }

        if(courseDao==null){
            courseDao = new CourseDaoImpl(Course.class);
        }
    }
}
