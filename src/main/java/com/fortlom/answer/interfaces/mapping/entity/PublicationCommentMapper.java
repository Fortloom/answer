package com.fortlom.answer.interfaces.mapping.entity;
import com.fortlom.answer.domain.AnswerAggregate.entity.PublicationComment;
import com.fortlom.answer.interfaces.dto.PublicationComment.CreatePublicationCommentResource;
import com.fortlom.answer.interfaces.dto.PublicationComment.PublicationCommentResource;
import com.fortlom.answer.interfaces.mapping.configuration.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;
public class PublicationCommentMapper {

    @Autowired
    EnhancedModelMapper mapper;



    public PublicationCommentResource toResource(PublicationComment model) {
        return mapper.map(model, PublicationCommentResource.class);
    }

    public Page<PublicationCommentResource> modelListToPage(List<PublicationComment> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, PublicationCommentResource.class), pageable, modelList.size());
    }
    public PublicationComment toModel(CreatePublicationCommentResource resource) {
        return mapper.map(resource, PublicationComment.class);
    }
}
