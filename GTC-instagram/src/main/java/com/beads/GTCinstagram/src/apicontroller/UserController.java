package com.beads.GTCinstagram.src.apicontroller;

import com.beads.GTCinstagram.src.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

}
