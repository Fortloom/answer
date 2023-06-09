package com.fortlom.answer.domain.AnswerAggregate.repository;


import com.fortlom.answer.domain.AnswerAggregate.entity.PublicationComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationCommentRepository extends JpaRepository<PublicationComment,Long>{

    List<PublicationComment> findByPublicationid(Long PublicationId);
    List<PublicationComment> findByUserid (Long UserId);
}
