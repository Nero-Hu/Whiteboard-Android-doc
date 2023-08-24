package com.herewhite.sdk.domain;

import java.util.HashMap;

public class WindowParams extends WhiteObject {

    /**
     * 是否全屏
     */
    private Boolean fullscreen;


    public Boolean getFullscreen() {
        return fullscreen;
    }

    public WindowParams setFullscreen(Boolean fullscreen) {
        this.fullscreen = fullscreen;
        return this;
    }
}
