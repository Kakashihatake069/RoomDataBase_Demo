package com.example.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public abstract class Dao {



    // below method is use to
    // add data to database.
    @Insert
    abstract void insert(CourseModal model);

    // below method is use to update
    // the data in our database.
    @Update
    abstract void update(CourseModal model);

    // below line is use to delete a
    // specific course in our database.
    @Delete
    abstract void delete(CourseModal model);

    // on below line we are making query to
    // delete all courses from our database.
    @Query("DELETE FROM course_table")
    abstract void deleteAllCourses();

    // below line is to read all the courses from our database.
    // in this we are ordering our courses in ascending order
    // with our course name.
    @Query("SELECT * FROM course_table ORDER BY courseName ASC")
    abstract LiveData<List<CourseModal>> getAllCourses();
}
