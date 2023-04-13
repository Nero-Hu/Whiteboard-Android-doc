This page contains Fastboard Android API changes starting from v1.2.3 and beyond.

### setStrokeWidth

```java
public void setStrokeWidth(int width)
```

Sets the stroke width.

**Parameters**

- `Width`: Int. The stroke width (px).

#### FastInsertDocParams

Parameters of the converted file.

```java
  public class FastInsertDocParams {
     private String taskUUID;
     private String taskToken;
     private FastRegion region;
     private ConverterType converterType;   
     private String fileType;
     private Boolean dynamicDoc;
     private String title;
}
```

The `FastInsertDocParams` class has the following properties:

- `taskUUID`: String. The UUID of the file conversion task. You can get `uuid` from the response body when the [Start file conversion (POST) API](https://docs.agora.io/en/whiteboard/whiteboard_file_conversion?platform=RESTful#start-file-conversion-post) call succeeds.
- `taskToken`: String. The task token of the file conversion task, which must be the same as the task token that you use to start the file conversion task.
- `ConverterType`: Enum. The version of the file conversion service:
  - `Projector`: The new version. See [New file conversion service](https://docs.agora.io/en/interactive-whiteboard/develop/file-conversion-overview).
  - `WhiteboardConverter`: The old version. See [Old file conversion service](https://docs.agora.io/en/interactive-whiteboard/reference/file-conversion-overview-deprecated). 

- `fileType`: String. The document type:
  - `pdf`: A static document.
  - `pptx`: A dynamic document.
- `title`: String. The title of the sub-window.
