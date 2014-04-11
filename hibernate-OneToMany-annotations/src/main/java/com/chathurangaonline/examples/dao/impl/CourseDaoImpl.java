package com.chathurangaonline.examples.dao.impl;

import com.chathurangaonline.examples.dao.CourseDao;
import com.chathurangaonline.examples.model.Course;

public class CourseDaoImpl extends GenericDaoImpl<Course,Long> implements CourseDao{

    public CourseDaoImpl(Class<Course> entityClass) {
        super(entityClass);
    }
}