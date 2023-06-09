package com.fortlom.answer.domain.AnswerAggregate.service;

import com.fortlom.answer.domain.AnswerAggregate.entity.PublicationComment;
import com.fortlom.answer.domain.AnswerAggregate.entity.childentity.PublicationAnswer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PublicationAnswerService {

    List<PublicationAnswer> getAll();
    Page<PublicationAnswer> getAll(Pageable pageable);
    PublicationAnswer getById(Long commentId);
    PublicationAnswer create(Long userId, Long publicationId, PublicationComment comment);
    List<PublicationAnswer> getCommentByPublicationId(Long publicationId);
    ResponseEntity<?> delete(Long publicationanswerId);

}
