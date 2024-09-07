package com.linklate.subject.application.convert;


import com.linklate.subject.application.dto.SubjectCategoryDTO;
import com.linklate.subject.application.dto.SubjectLabelDTO;
import com.linklate.subject.domain.entity.SubjectCategoryBO;
import com.linklate.subject.domain.entity.SubjectLabelBO;
import com.linklate.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 题目分类dto转换器
 *
 * @author: ChickenWing
 * @date: 2023/10/8
 */
@Mapper
public interface SubjectLabelDTOConverter {

    SubjectLabelDTOConverter INSTANCE = Mappers.getMapper(SubjectLabelDTOConverter.class);

    SubjectLabelBO convertDtoToLabelBO(SubjectLabelDTO subjectCategoryDTO);

    SubjectLabelDTO convertBoToLabelDTO(SubjectLabelBO subjectCategoryBO);

    List<SubjectLabelDTO> convertBOToLabelDTOList(List<SubjectLabelBO> subjectCategoryBO);

}
