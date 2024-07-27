package com.spring.db.SpringTestDb.studentDao;

import com.spring.db.SpringTestDb.entity.Student;

public interface StudentDao {
public int insert(Student student);
public int change(Student student);
public int delete(Student student);
}
