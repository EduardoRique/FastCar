package com.fastcar.example.service.currentuser;

import com.fastcar.example.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
