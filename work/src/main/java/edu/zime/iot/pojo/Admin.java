package edu.zime.iot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                               //导入lombok数据
@AllArgsConstructor                 //导入有参构造
@NoArgsConstructor                  //导入无参构造
public class Admin
{

    String username;
    String password;
}
