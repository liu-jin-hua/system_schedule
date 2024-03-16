package com.test.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private  String userPwd;

}
