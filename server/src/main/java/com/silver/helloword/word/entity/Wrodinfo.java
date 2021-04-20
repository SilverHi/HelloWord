package com.silver.helloword.word.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.silver.helloword.common.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (wd_wrodinfo)实体类
 *
 * @author sirmteam
 * @date 2021-04-20 16:32:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("wd_wrodinfo")
public class Wrodinfo extends BaseEntity {
    @TableField("username")
    private String username;
    @TableField("chinese")
    private String chinese;
    @TableField("foreignlanguage")
    private String foreignlanguage;


}