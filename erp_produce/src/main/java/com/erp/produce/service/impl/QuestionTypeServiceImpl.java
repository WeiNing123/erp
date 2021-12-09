package com.erp.produce.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erp.produce.mapper.QuestionTypeMapper;
import com.erp.produce.model.QuestionType;
import com.erp.produce.service.IQuestionTypeService;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeServiceImpl extends ServiceImpl<QuestionTypeMapper, QuestionType> implements IQuestionTypeService {
}
