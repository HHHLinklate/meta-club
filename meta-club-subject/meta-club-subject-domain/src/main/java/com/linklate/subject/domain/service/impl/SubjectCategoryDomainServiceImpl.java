package com.linklate.subject.domain.service.impl;

import com.linklate.subject.domain.convert.SubjectCategoryConverter;
import com.linklate.subject.domain.entity.SubjectCategoryBO;
import com.linklate.subject.infra.basic.entity.SubjectCategory;
import com.linklate.subject.infra.basic.service.SubjectCategoryService;
import com.linklate.subject.domain.service.SubjectCategoryDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {
    @Resource
    private SubjectCategoryService subjectCategoryService;

    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE
                .convertBoToCategory(subjectCategoryBO);
        subjectCategoryService.insert(subjectCategory);
    }
}
