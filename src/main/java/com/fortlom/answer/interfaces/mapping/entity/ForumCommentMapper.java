package com.fortlom.answer.interfaces.mapping.entity;

import com.fortlom.answer.domain.AnswerAggregate.entity.ForumComment;
import com.fortlom.answer.interfaces.dto.ForumComment.CreateForumCommentResource;
import com.fortlom.answer.interfaces.dto.ForumComment.ForumCommentResource;
import com.fortlom.answer.interfaces.mapping.configuration.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ForumCommentMapper {

    @Autowired
    EnhancedModelMapper mapper;



    public ForumCommentResource toResource(ForumComment model) {
        return mapper.map(model, ForumCommentResource.class);
    }

    public Page<ForumCommentResource> modelListToPage(List<ForumComment> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, ForumCommentResource.class), pageable, modelList.size());
    }
    public ForumComment toModel(CreateForumCommentResource resource) {
        return mapper.map(resource, ForumComment.class);
    }
}
