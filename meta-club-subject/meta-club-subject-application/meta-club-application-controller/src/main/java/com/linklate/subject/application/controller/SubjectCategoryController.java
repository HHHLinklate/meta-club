package com.linklate.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.linklate.subject.application.controller.convert.SubjectCategoryDTOConverter;
import com.linklate.subject.application.controller.dto.SubjectCategoryDTO;
import com.linklate.subject.common.entity.Result;
import com.linklate.subject.domain.entity.SubjectCategoryBO;
import com.linklate.subject.domain.service.SubjectCategoryDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/subject/category")
public class SubjectCategoryController {

    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    /**
     * 新增分类
     *
     * @param subjectCategoryDTO
     * @return
     */
    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {
        if (log.isInfoEnabled()) {
            log.info("SubjectCategoryController.add.dto:{}", JSON.toJSONString(subjectCategoryDTO));
        }

        SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convertDtoToCategoryBO(subjectCategoryDTO);
        subjectCategoryDomainService.add(subjectCategoryBO);
        return Result.ok(true);
    }
}
