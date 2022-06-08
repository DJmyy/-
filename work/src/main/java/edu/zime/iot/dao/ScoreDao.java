package edu.zime.iot.dao;

import edu.zime.iot.pojo.Course;
import edu.zime.iot.pojo.Score;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ScoreDao
{
    public static Map<Integer, Score> scores=null;
    static
    {
        scores=new HashMap<Integer,Score>();
        scores.put(1,new Score(1,45,90));
        scores.put(2,new Score(2,45,89));
        scores.put(3,new Score(3,45,91));
        scores.put(4,new Score(4,45,93));
        scores.put(5,new Score(5,45,92));
    }
    public Collection<Score> chart1()
    {
        return scores.values();
    }
}
