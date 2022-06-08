package edu.zime.iot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score
{
    Integer courseId;
    Integer studentId;;
    Integer score;
}
