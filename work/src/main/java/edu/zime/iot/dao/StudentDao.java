package edu.zime.iot.dao;

import edu.zime.iot.pojo.Admin;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao
{
    public static Map<String, Admin>user=null;
    static {
        user=new HashMap<String, Admin>();
        user.put("yxl",new Admin("yxl","123"));
    }
}
