package com.beads.GTCinstagram.config.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BaseException {
    private BaseResponseStatus status;
}
