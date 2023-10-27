package com.herewhite.sdk.window;

import com.herewhite.sdk.ResultCaller;
import com.herewhite.sdk.WhiteSdkConfiguration;

public interface SlideListener {
    /**
     * Callback for intercepting and replacing URLs of PPT resources.
     *
     * @since 2.16.59
     *
     * This callback is disabled by default. You can enable it with {@link WhiteSdkConfiguration#setEnableSlideInterrupterAPI} setEnableSlideInterrupterAPI}(true) when initiating the whiteboard SDK.
     *
     * Once enabled, the SDK will trigger this callback during PPT resource loading, reporting the original URL address of the resource. You need to pass the replaced URL back to the SDK through the resultCaller callback.
     *
     *
     * @param sourceUrl The original URL address. 
     * @param resultCaller The URL replacemnt.
     */
    void slideUrlInterrupter(String sourceUrl, ResultCaller<String> resultCaller);
}
