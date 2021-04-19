package com.silver.helloword.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (um_session)实体类
 *
 * @author sirmteam
 * @date 2021-04-19 17:14:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("um_session")
public class Session extends BaseEntity {
    @TableField("username")
    private String username;
    @TableField("time")
    private String time;


}