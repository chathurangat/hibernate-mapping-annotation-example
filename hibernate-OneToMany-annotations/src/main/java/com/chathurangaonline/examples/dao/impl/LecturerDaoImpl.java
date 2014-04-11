package com.chathurangaonline.examples.dao.impl;

import com.chathurangaonline.examples.dao.LecturerDao;
import com.chathurangaonline.examples.model.Lecturer;

public class LecturerDaoImpl extends GenericDaoImpl<Lecturer,Long> implements LecturerDao{

    public LecturerDaoImpl(Class<Lecturer> entityClass) {
        super(entityClass);
    }
}
