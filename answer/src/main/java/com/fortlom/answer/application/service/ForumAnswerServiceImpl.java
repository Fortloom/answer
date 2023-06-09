package com.fortlom.answer.application.service;

import com.fortlom.answer.application.exception.ResourceNotFoundException;
import com.fortlom.answer.domain.AnswerAggregate.entity.ForumComment;
import com.fortlom.answer.domain.AnswerAggregate.entity.childentity.ForumAnswer;
import com.fortlom.answer.domain.AnswerAggregate.repository.ForumAnswerRepository;
import com.fortlom.answer.domain.AnswerAggregate.service.ForumAnswerService;
import com.fortlom.answer.domain.AnswerAggregate.valueobject.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumAnswerServiceImpl implements ForumAnswerService {
    private static final String ENTITY = "ForumAnswer";
    @Autowired
    private ForumAnswerRepository forumAnswerRepository;
    @Override
    public List<ForumAnswer> getAll() {
        return this.forumAnswerRepository.findAll();
    }

    @Override
    public Page<ForumAnswer> getAll(Pageable pageable) {
        return this.forumAnswerRepository.findAll(pageable);
    }

    @Override
    public ForumAnswer getById(Long forumanswerId) {
        ForumAnswer forumAnswer = this.forumAnswerRepository.findById(forumanswerId).orElseThrow(() -> new ResourceNotFoundException(ENTITY, forumanswerId));
        return forumAnswer;
    }

    @Override
    public ForumAnswer create(Long userId, Long forumId, ForumComment forumcomment) {
        ForumAnswer forumAnswer = new ForumAnswer();
        forumAnswer.setUserid(userId);
        forumAnswer.setForumCommentId(forumcomment.getForumCommentid());
        forumAnswer.setAnswer("AWDAwda");
        return this.forumAnswerRepository.save(forumAnswer);
    }

    @Override
    public List<ForumAnswer> getForumAnswerByForumCommentId(Long forumcommentId) {
        return this.forumAnswerRepository.findByForumCommentId(forumcommentId);
    }

    @Override
    public ResponseEntity<?> delete(Long forumanswerId) {
        return this.delete(forumanswerId);
    }
}
