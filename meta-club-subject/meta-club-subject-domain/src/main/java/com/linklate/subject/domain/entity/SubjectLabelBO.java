package com.linklate.subject.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 题目标签表(SubjectLabel)实体类
 *
 * @author makejava
 * @since 2024-09-07 13:45:42
 */

@Data
public class SubjectLabelBO implements Serializable {
    private static final long serialVersionUID = -29137663440274996L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 标签分类
     */
    private String labelName;
    /**
     * 排序
     */
    private Integer sortNum;

    private String categoryId;

}

