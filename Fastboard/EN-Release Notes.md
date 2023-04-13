## v1.2.3

v1.2.3 was released on October 28, 2022.

#### Compatibility changes

**API rename**

The `setStokeWidth` method under the `FastRoom` class is renamed to `setStrokeWidth`. See [`setStrokeWidth`]([Fastboard API | Agora Documentation](https://docs.agora.io/en/interactive-whiteboard/reference/uikit-sdk#setstrokewidth)).

#### New features

**Support for the new file conversion service**

This release adds the following properties to the [`FastInsertDocParams `](https://docs.agora.io/en/interactive-whiteboard/reference/uikit-sdk#fastinsertdocparams) class to support the new file conversion service:

- `dynamicDoc`: Boolean. Whether the type of the conversion task is dynamic.

- `converterType`: Enum. The version of the file conversion service. Contains the following enumerators: 
  - `Projector`: The new file conversion service. See [File conversion overview](https://docs.agora.io/en/interactive-whiteboard/develop/file-conversion-overview). 
  - `WhiteboardConverter`: The old file conversion service (default). See [Deprecated file conversion overview](https://docs.agora.io/en/interactive-whiteboard/reference/file-conversion-overview-deprecated).

#### Fixed issues

This release fixed the order of the parameters in the `FastInsertDocParams` class. 