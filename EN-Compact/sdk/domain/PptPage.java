package com.herewhite.sdk.domain;

import com.google.gson.annotations.SerializedName;


/**
 * The `PptPage` class, for setting the parameters of an image or dynamic PPT slide.
 *
 * You can pass in a `PptPage` object when initializing a `Scene` instance to present the image or dynamic PPT slide on the whiteboard scene.
 *
 * You can insert the following formats of an image or dynamic PPT slide on the whiteboard scene:
 * - Static images in PNG, JPG/JPEG, and WEBP formats, or PNG, JPG/JPEG, and WEBP images which are converted from PPT, PPTX, DOC, DOCX, and PDF files.
 * - Dynamic PPT slides which are converted from PPTX files using the [Agora file conversion service](https://docs.agora.io/en/whiteboard/file_conversion_overview?platform=RESTful).
 *
 */
public class PptPage extends WhiteObject {

    //@SerializedName(value = "src", alternate = {"conversionFileUrl"})
    private String src;
    private Double width;
    private Double height;
    //@SerializedName(value = "previewURL", alternate = {"preview"})
    private String preview;

    /**
     * The `PptPage` constructor, for initializing a `PptPage` instance to be inserted on a whiteboard scene.
     *
     * @note
     * - Call this method when initializing a whiteboard scene.
     * - You can insert only one image or dynamic PPT slide on a whiteboard scene.
     * - The image or dynamic PPT slide displayed on the whiteboard scene takes the origin of the world coordinate system as the center and cannot be changed, which means you cannot change the position of the image or dynamic PPT slide inside the whiteboard.
     *
     * @param src    The address of the image or dynamic PPT slide. The supported formats are as follows:
     * - For image: The URL address, which can be generated by yourself or by using the Agora file conversion service. For example, `"https://docs-test-xxx.oss-cn-hangzhou.aliyuncs.com/staticConvert/2fdxxxxx67e/1.jpeg"`.
     * - For dynamic PPT slide: The URI address, which is generated by using the Agora file conversion service. For example, `"pptx://cover.herewhite.com/dynamicConvert/6a212c90fa5311ea8b9c074232aaccd4/1.slide"`.
     * @param width  The width (px) of the image or dynamic PPT slide.
     * @param height The height (px) of the image or dynamic PPT slide.
     */
    public PptPage(String src, Double width, Double height) {
        this(src, width, height, null);
    }

    /**
     * The `PptPage` constructor, for initializing a `PptPage` instance to be inserted on a whiteboard scene.
     *
     * @note
     * - Call this method when initializing a whiteboard scene.
     * - You can insert only one image or dynamic PPT slide on a whiteboard scene.
     * - The image or dynamic PPT slide displayed on the whiteboard scene takes the origin of the world coordinate system as the center and cannot be changed, which means you cannot change the position of the image or dynamic PPT slide inside the whiteboard.
     *
     * @param src    The address of the image or dynamic PPT slide. The supported formats are as follows:
     * - For image: The URL address, which can be generated by yourself or by using the Agora file conversion service. For example, `"https://docs-test-xxx.oss-cn-hangzhou.aliyuncs.com/staticConvert/2fdxxxxx67e/1.jpeg"`.
     * - For dynamic PPT slide: The URI address, which is generated by using the Agora file conversion service. For example, `"pptx://cover.herewhite.com/dynamicConvert/6a212c90fa5311ea8b9c074232aaccd4/1.slide"`.
     * @param width  The width (px) of the image or dynamic PPT slide.
     * @param height The height (px) of the image or dynamic PPT slide.
     * @param preview The URL address of the preview for the image or dynamic PPT slide. You can get the URL address of the dynamic PPT preview in the `preview` field
     * in [the query result of the file conversion task](https://docs.agora.io/en/whiteboard/whiteboard_file_conversion?platform=RESTful#query-file-conversion-progress-get).
     * For example, "https://docs-test-xxx.oss-cn-hangzhou.aliyuncs.com/dynamicConvert/2fdxxxxx67e/preview/1.png".
     */
    public PptPage(String src, Double width, Double height, String preview) {
        this.src = src;
        this.width = width;
        this.height = height;
        this.preview = preview;
    }

    /**
     * Gets the URL address of the image or the URI of the dynamic PPT slide.
     *
     * @return The URL address of the image or the URI of the dynamic PPT slide.
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the URL address of the image or the URI of the dynamic PPT slide.
     *
     * @param src The URL address of the image or the URI of the dynamic PPT slide.
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * Gets the width of the image or dynamic PPT slide.
     *
     * @return The width (px) of the image or dynamic PPT slide.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the image or dynamic PPT slide.
     *
     * @param width The width (px) of the image or dynamic PPT slide.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the height of the image or dynamic PPT slide.
     *
     * @return The height (px) of the image or dynamic PPT slide.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the image or dynamic PPT slide.
     *
     * @return The height (px) of the image or dynamic PPT slide.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the URL address of the image or the URI of the dynamic PPT slide.
     *
     * @return The URL address of the image or the URI of the dynamic PPT slide.
     */
    public String getPreview() {
        return preview;
    }

    /**
     * Sets the URL address of the preview for the image or dynamic PPT slide.
     *
     * This method displays the preview in the page preview area on the right side of the whiteboard.
     *
     * @param preview The URL address of the preview for the image or dynamic PPT slide. You can get the URL address of the dynamic PPT preview in the `preview` field
     * in [the query result of the file conversion task](https://docs.agora.io/en/whiteboard/whiteboard_file_conversion?platform=RESTful#query-file-conversion-progress-get).
     * For example, "https://docs-test-xxx.oss-cn-hangzhou.aliyuncs.com/dynamicConvert/2fdxxxxx67e/preview/1.png".
     */
    public void setPreview(String preview) {
        this.preview = preview;
    }
}