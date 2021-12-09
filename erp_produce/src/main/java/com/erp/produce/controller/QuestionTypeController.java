package com.erp.produce.controller;

import com.erp.produce.model.QuestionType;
import com.erp.produce.service.IQuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produce/questionType")
public class QuestionTypeController {

    @Autowired
    private IQuestionTypeService questionTypeService;

    @PostMapping("/list")
    public List<QuestionType> list() {
        List<QuestionType> result = questionTypeService.list(null);
        return result;
    }
}
