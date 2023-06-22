package com.fortlom.answer.application.service;

import com.fortlom.answer.domain.AnswerAggregate.entity.PublicationComment;
import com.fortlom.answer.domain.AnswerAggregate.entity.childentity.PublicationAnswer;
import com.fortlom.answer.domain.AnswerAggregate.repository.PublicationAnswerRepository;
import com.fortlom.answer.domain.AnswerAggregate.service.PublicationAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationAnswerServiceImpl implements PublicationAnswerService {
    private static final String ENTITY = "PublicationAnswer";

    @Autowired
    private PublicationAnswerRepository publicationAnswerRepository;

    @Override
    public List<PublicationAnswer> getAll() {
        return null;
    }

    @Override
    public Page<PublicationAnswer> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public PublicationAnswer getById(Long commentId) {
        return null;
    }

    @Override
    public PublicationAnswer create(Long userId, Long publicationId, PublicationComment comment) {
        return null;
    }

    @Override
    public List<PublicationAnswer> getCommentByPublicationCommentId(Long publicationCommentId) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Long publicationanswerId) {
        return null;
    }
}
