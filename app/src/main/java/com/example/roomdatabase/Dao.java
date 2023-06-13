package com.example.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public abstract class Dao {

    // below method is use to
    // add data to database.
    @Insert
    abstract void insert(CourseModal model);


    @Query("SELECT * FROM course_table ORDER BY courseName ASC")
    abstract LiveData<List<CourseModal>> getAllCourses();
}
