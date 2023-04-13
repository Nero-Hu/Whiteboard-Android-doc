package com.herewhite.sdk.domain;

/**
 * Created by buhe on 2018/8/11.
 */

/**
 * Settings of the whiteboard tool in use.
 */
public class MemberState extends WhiteObject {
    private String currentApplianceName;
    private int[] strokeColor;
    private Double strokeWidth;
    private Double textSize;
    private Boolean textCanSelectText;
    private Boolean dottedLine;
    
    public MemberState() {
    }

    /**
     * Gets the name of the whiteboard tool currently in use.
     *
     * @return The name of the whiteboard tool currently in use.
     */
    public String getCurrentApplianceName() {
        return currentApplianceName;
    }

    /**
     * Sets the whiteboard tool.
     *
     * @param currentApplianceName The whiteboard tool. See {@link Appliance}.
     */
    public void setCurrentApplianceName(String currentApplianceName) {
        this.currentApplianceName = currentApplianceName;
    }

    /**
     * Sets the whiteboard tool.
     *
     * @param currentApplianceName The whiteboard tool. See {@link Appliance}.
     * @param shapeType The shape type. The default value is `Triangle`. See {@link com.herewhite.sdk.domain.ShapeType ShapeType}.
     */
    public void setCurrentApplianceName(String currentApplianceName, ShapeType shapeType) {
        this.currentApplianceName = currentApplianceName;

        if (Appliance.SHAPE.equals(currentApplianceName)) {
            if (shapeType == null) {
                this.shapeType = ShapeType.Triangle;
            }
        }
    }

    /**
     * Sets the shape type.
     *
     * @since 2.12.26
     *
     * @param shapeType The shape type. See {@link com.herewhite.sdk.domain.ShapeType ShapeType}.
     */
    public void setShapeType(ShapeType shapeType) {
        this.currentApplianceName = Appliance.SHAPE;
        this.shapeType = shapeType;
    }

    /**
     * Gets the shape type.
     *
     * @since 2.12.26
     *
     * @return The shape type. See {@link com.herewhite.sdk.domain.ShapeType ShapeType}。
     */
    public ShapeType getShapeType() {
        return shapeType;
    }

    /**
     * Gets the stroke color.
     *
     * @return The stroke color in RGB format, for example, `0, 0, 255` (blue).
     */
    public int[] getStrokeColor() {
        return strokeColor;
    }

    /**
     * Sets the stroke color.
     *
     * @param strokeColor The stroke color in RGB format, for example, `0, 0, 255` (blue).
     */
    public void setStrokeColor(int[] strokeColor) {
        this.strokeColor = strokeColor;
    }


    /**
     * Gets the stroke width.
     *
     * @return The stroke width.
     */
    public double getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Sets the stroke width.
     *
     * @param strokeWidth The stroke width.
     */
    public void setStrokeWidth(double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }


    /**
     * Gets the font size of the text.
     *
     * @return The font size of the text.
     */
    public double getTextSize() {
        return textSize;
    }

    /**
     * Sets the font size of the text.
     *
     * @param textSize The font size of the text. The Chrome browser automatically adjusts fonts smaller than 12 to 12.
     */
    public void setTextSize(double textSize) {
        this.textSize = textSize;
    }

    /**
     * Gets whether directly selecting and editing whiteboard text is allowed.
     *
     * @return Whether directly selecting and editing whiteboard text is allowed.
     */
    public Boolean getTextCanSelectText() {
        return textCanSelectText;
    }

    /**
     * Sets whether to allow directly selecting and editing whiteboard text.
     *
     * @param textCanSelectText Whether to allow directly selecting and editing whiteboard text:
     *                          - `true`：Allow directly selecting and editing whiteboard text.
     *                          - `false`：Do not allow directly selecting and editing whiteboard text.
     */
    public void setTextCanSelectText(Boolean textCanSelectText) {
        this.textCanSelectText = textCanSelectText;
    }

    /**
     * Gets whether to support drawing dotted lines:
     *
     * @return Whether to support drawing dotted lines:
     */
    public Boolean getDottedLine() {
        return dottedLine;
    }

    /**
     * Sets whether to support drawing dotted lines:
     * This feature only applies to NewPencil. You need to set disableNewPencil to false before joining the room. 
     *
     * @param dottedLine Whether to support drawing dotted lines:
     *                   - `true`：Support drawing dotted lines.
     *                   - `false`：(Default) Do not support drawing dotted lines.
     */
    public void setDottedLine(Boolean dottedLine) {
        this.dottedLine = dottedLine;
    }
}
