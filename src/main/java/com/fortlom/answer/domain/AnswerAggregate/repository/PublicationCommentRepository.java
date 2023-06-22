package com.fortlom.answer.domain.AnswerAggregate.repository;


import com.fortlom.answer.domain.AnswerAggregate.entity.PublicationComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationCommentRepository extends JpaRepository<PublicationComment,Long>{

    @Query("select x from PublicationComment x where x.publicationid = ?1")
    List<PublicationComment> findByPublicationid(Long PublicationId);
    @Query("select x from PublicationComment x where x.userId = ?1")
    List<PublicationComment> findByUserid (Long UserId);
}
