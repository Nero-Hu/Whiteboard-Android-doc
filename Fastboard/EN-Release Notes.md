<PlatformWrapper platform="android">


The <Vg k="FAST_SDK" /> is the latest generation of the <Vg k="WHITE_SDK" /> launched by Agora to help developers quickly build whiteboard applications. It simplifies the APIs of the <Vg k="WHITE_SDK" /> and implements the core functionality with a default user interface (UI). In addition, the <Vg k="FAST_SDK" /> integrates [window-manager](https://github.com/netless-io/window-manager) and extensions from [netless-app](https://github.com/netless-io/netless-app) to allow developers to easily extend the functionality of their whiteboard applications. With the <Vg k="FAST_SDK" />, you do not need to learn the complex concepts of the interactive whiteboard; you can join a whiteboard room with a few lines of code and instantly use the rich editing tools to start real-time interactive collaboration.

## v1.6.2

v1.6.2 was released on September 20, 2024.

#### New features

**Manual loading of whiteboard view**

This version adds the [`preloadWhiteboardView`](/api-ref/fastboard/android/fastboard-api#setconfig) method, which is used to manually perform a whiteboard view preload to improve the speed of joining the room next time. Before using this feature, ensure that the `autoPreload` in [`FastboardConfig`](/api-ref/fastboard/android/fastboard-api#fastboardconfig) is set to `false`.

#### API changes

**Add**

- `preloadWhiteboardView`
- `FastboardConfig` adds `autoPreload`

## v1.6.0

v1.6.0 was released on Febrary xx, 2024.

#### New features

**Insert Documents**

The `FastRoom` class adds the `insertStaticDoc` and `insertPptx` methods to insert static docs and dynamic PPT docs, respectively.

**Whiteboard Preloading**

Adds the `FastboardConfig` class for auxiliary configuration of the `Fastboard` object. You can modify the configuration by calling the `setConfig` method. Among them, `FastboardConfig.enablePreload` and `FastboardConfig.preloadCount` are used to switch the whiteboard preloading function and specify the number of WebViews to be preloaded respectively. After configuration, the whiteboard loading speed can be improved.

**New Whiteboard Tools**

This release adds the following new whiteboard tools: 

- Adds pencil eraser tool FastAppliance.PENCIL_ERASER to erase local pencil strokes.
- Adds grab tool FastAppliance.HAND to move the view.

**Whiteboard Logging**

Adds the `FastLogger` class to provide a flexible whiteboard runtime log recording tool, which can easily record four different levels of log information: `debug`, `info`, `warn`, and `error` . You can call the `setLogger` method to customize the logger to adapt to different logging needs, or you can use the system `Log` class to log.

#### Improvements

- When calling the `Fastroom.insertImage` method to insert an image, the image will be centered in the current view by default.
- The room state callback, `roomState`, which is triggered after joining a whiteboard room, is disabled. You need to call `Room.getRoomState()` to get the complete `RoomState`.

#### API changes

**Add**

- `insertStaticDoc`
- `insertPptx`
- `DocPage`
- `setConfig`
- `FastboardConfig`
- `FastAppliance` adds:
  - `PENCIL_ERASER`
  - `HAND`
- `FastLogger`
  - `setLogger`
  - `Logger`
  - `warn`
  - `debug`
  - `info`
  - `error`

**Deprecated**

- `insertDocs`


## v1.3.4

v1.3.4 was released on January 19, 2024.

#### Compatibility changes

**API rename**

The `setStokeWidth` method under the `FastRoom` class is renamed to `setStrokeWidth`. See [`setStrokeWidth`](https://docs.agora.io/en/interactive-whiteboard/reference/uikit-sdk#setstrokewidth).

#### New features

**Modify whiteboard color**

This version adds the `FastResource` class, which provides a series of methods for modifying color matching, including:

- `getBackgroundColor`: Configure the background color of the Fastboard control.
- `getBoardBackgroundColor`: Configure the background color of the whiteboard.

**Set window ratio**

This version adds a new `containerSizeRatio` attribute in the `FastRoomOptions` class, which is used to modify the ratio of the height and width of the local display window content.

**Show user cursor**

This version adds a new `userPayload` attribute in the `FastRoomOptions` class, which is used to synchronize and display the position of the user cursor in the whiteboard room.

**Set room read and write permissions**

This version adds a new `setWritable` method under the `FastRoom` class, which is used to set the current room to interactive mode or read-only mode, and a new `isWritable` method to get whether the current whiteboard room is in interactive mode. In a large class scenario, setting the room to read-only mode can improve the stability of the whiteboard room connection and the upper limit of the number of people the room can accommodate.

**Adjust toolbar margins**

This version adds a new `setToolboxEdgeMargin` method under the `FastUiSettings` class, which is used to adjust the margins of the whiteboard toolbar.

**Support for the new file conversion service**

This release adds the following properties to the [`FastInsertDocParams `](https://docs.agora.io/en/interactive-whiteboard/reference/uikit-sdk#fastinsertdocparams) class to support the new file conversion service:

- `dynamicDoc`: Boolean. Whether the type of the conversion task is dynamic.

- `converterType`: Enum. The version of the file conversion service. Contains the following enumerators:
  - `Projector`: The new file conversion service. See [File conversion overview](https://docs.agora.io/en/interactive-whiteboard/develop/file-conversion-overview).
  - `WhiteboardConverter`: The old file conversion service (default). See [Deprecated file conversion overview](https://docs.agora.io/en/interactive-whiteboard/reference/file-conversion-overview-deprecated).

#### Improvements

This version optimizes the overall performance of the user interface and adjusts the whiteboard tool icon style and the default margins of the whiteboard toolbar.

#### Fixed issues

This version fixes the following issues:

- The order of the parameters in the `FastInsertDocParams` class.
- An issue that could cause the text tool to lose focus when using it.

## v1.2.0

v1.2.0 was released on May 25, 2022.

#### New features
**1. Configuring controls on the whiteboard user interface**

To enable developers to customize the whiteboard user interface, this release adds the following methods to configure the controls on the whiteboard user interface:

- `showRoomController`: Shows the controls on the whiteboard user interface.

- `hideRoomController`: Hides the controls on the whiteboard user interface.

- `setToolsExpandAppliances`: Sets the toolset contained in the toolbar in expanded mode.

- `setToolsCollapseAppliances`: Sets the toolset contained in the toolbar in collapsed mode.

- `setToolsColors`: Sets the color set of the palette.

- `setToolboxGravity`: Sets the position of the toolbar on the whiteboard.

**2. Configuring the style of the whiteboard user interface**

This release adds the `setFastStyle` method to the `FastRoom` class for setting the style of the whiteboard user interface. You can use this method to modify the theme color and mode of the whiteboard user interface.

## v1.0.0
v1.0.0 was released on March 6, 2022. This is the first official release of the UI Kit for Android.

#### Features

**Implementations of the core whiteboard functionality and user interface (UI)**

This release directly implements the basic functions of the interactive whiteboard with a default UI. After integrating the UI Kit and calling `join` to join the whiteboard room, you can use the following functions:

- The whiteboard toolbar, which includes all basic whiteboard editing tools, such as pencil, text editor, and shape tools. It also supports setting stroke width, font size, and stroke color.

- The whiteboard page control, which enables you to add and switch whiteboard pages.

- The view control, which you can use to zoom in and out of the current whiteboard page and adjust the view.

- Undo and redo an action.

In addition, the UI Kit provides the following APIs to enable you to implement these functions with customized UIs:

- `setAppliance`

- `setStrokeWidth`

- `setStrokeColor`

- `undo`

- `redo`

#### Display files

The UI Kit supports inserting and displaying files in multiple formats on the whiteboard, such as images in PNG and JPG formats, audio and video in MP3 and MP4 formats, and documents in PPT, PPTX, DOC, DOCX, and PDF formats. For detailed implementation steps, see [Display Files](/interactive-whiteboard/develop/scenes/display-files-fast).

#### Reference

Refer to the following documentation to integrate the UI Kit and add the whiteboard functionality to your project:

- [Join a Whiteboard Room](/interactive-whiteboard/get-started/get-started-sdk): Describes how to quickly join a whiteboard room and experience interactive whiteboard features using the UI Kit.

- [Display Files](/interactive-whiteboard/develop/scenes/display-files-fast): Describes how to call the UI Kit's APIs to insert images, play audio and video, and present documents on the whiteboard.

- [API Reference](/interactive-whiteboard/reference/uikit-sdk): Provides a detailed API reference for the UI Kit.

</PlatformWrapper>