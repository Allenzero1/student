package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author zqq
 * @version 1.0
 * @Date 2019/11/27
 */

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("t_student")
public class Student implements Serializable {

    private int id;
    private String username;
    private String password;
    private int stunumber;
}
