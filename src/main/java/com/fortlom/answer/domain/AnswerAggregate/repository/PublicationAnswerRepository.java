package com.fortlom.answer.domain.AnswerAggregate.repository;


import com.fortlom.answer.domain.AnswerAggregate.entity.PublicationComment;
import com.fortlom.answer.domain.AnswerAggregate.entity.childentity.PublicationAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationAnswerRepository extends JpaRepository<PublicationAnswer,Long>{
    @Query("select x from PublicationAnswer x where x.id = ?1")
    List<PublicationAnswer> findByPublicationid(Long PublicationId);

    @Query("select x from PublicationAnswer x where x.userid = ?1")
    List<PublicationAnswer> findByUserid (Long UserId);
}
