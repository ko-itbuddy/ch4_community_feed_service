package org.fastcampus.community_feed.user.repository.jpa;

import org.fastcampus.community_feed.user.repository.entity.UserRelationEntity;
import org.fastcampus.community_feed.user.repository.entity.UserRelationIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRelationRepository extends JpaRepository<UserRelationEntity, UserRelationIdEntity> {

}
