package com.silver.helloword.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.silver.helloword.common.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (um_userinfo)实体类
 *
 * @author sirmteam
 * @date 2021-04-15 15:59:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("um_userinfo")
public class Userinfo extends BaseEntity {
    @TableField("username")
    private String username;
    @TableField("password")
    private Object password;


}