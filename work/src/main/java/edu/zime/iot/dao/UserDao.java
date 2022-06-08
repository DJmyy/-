package edu.zime.iot.dao;

import edu.zime.iot.pojo.Course;
import edu.zime.iot.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao
{
    public static Map<String, User> users=null;
    static
    {
        users=new HashMap<String,User>();
        users.put("45",new User("45","yxl","物联2161"));
        users.put("01",new User("01","syq","物联2161"));
        users.put("02",new User("02","lyy","物联2161"));
        users.put("03",new User("03","fph","物联2161"));
        users.put("04",new User("04","zzz","物联2161"));
    }
    public Collection<User> chart2()
    {
        return users.values();
    }
    public void add(User user)
    {
        users.put(user.getId(),user);
    }
    public int chart3(String id)
    {
        users.remove(id);
        return 0;
    }
    public int update(User user)
    {
        users.put(user.getId(),user);
        return 0;
    }
    public User u(String id)
    {
       User a= users.get(id);
        return a;
    }
}
