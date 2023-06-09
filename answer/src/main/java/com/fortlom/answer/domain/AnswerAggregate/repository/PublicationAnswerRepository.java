package com.fortlom.answer.domain.AnswerAggregate.repository;


import com.fortlom.answer.domain.AnswerAggregate.entity.PublicationComment;
import com.fortlom.answer.domain.AnswerAggregate.entity.childentity.PublicationAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationAnswerRepository extends JpaRepository<PublicationAnswer,Long>{

    List<PublicationAnswer> findByPublicationid(Long PublicationId);
    List<PublicationAnswer> findByUserid (Long UserId);
}
