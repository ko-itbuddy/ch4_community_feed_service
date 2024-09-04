package org.fastcampus.community_feed.user.ui;

import lombok.RequiredArgsConstructor;
import org.fastcampus.community_feed.common.ui.Response;
import org.fastcampus.community_feed.user.application.UserRelationService;
import org.fastcampus.community_feed.user.application.UserService;
import org.fastcampus.community_feed.user.application.dto.CreateUserRequestDto;
import org.fastcampus.community_feed.user.application.dto.FollowUserRequestDto;
import org.fastcampus.community_feed.user.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relation")
@RequiredArgsConstructor
public class UserRelationController {

    private final UserRelationService userRelationService;


    @PostMapping("/follow")
    public Response<Void> followUser(@RequestBody FollowUserRequestDto dto){
        userRelationService.followUser(dto);
        return Response.ok(null);
    }

    @PostMapping("/unfollow")
    public Response<Void> unfollow(@RequestBody FollowUserRequestDto dto){
        userRelationService.unfollowUser(dto);
        return Response.ok(null);
    }
}
