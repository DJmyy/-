package edu.zime.iot.dao;

import edu.zime.iot.pojo.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CourseDao
{
    public static Map<String, Course>courses=null;
    static{
        courses=new HashMap<String, Course>();
        courses.put("1",new Course("1","物联网识别技术","李老师"));
        courses.put("2",new Course("2","中国近代史纲要","杨老师"));
        courses.put("3",new Course("3","Web应用开发","欧老师"));
        courses.put("4",new Course("4","Java网络编程技术","秦老师"));
        courses.put("5",new Course("5","马克思主义原理","孙老师"));
    }
    public Collection<Course> chart()
    {
        return courses.values();
    }
}
