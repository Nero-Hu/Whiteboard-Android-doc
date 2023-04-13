本文提供声网 Fastboard SDK for Android 的发版说明。

声网 Fastboard SDK 是为帮助开发人员快速构建白板应用推出的新一代白板 SDK。Fastboard SDK 基于互动白板 SDK 开发，对复杂的 API 进行封装，简化了接口调用逻辑，并提供核心功能的实现和默认 UI；此外，Fastboard SDK 还集成窗口管理器（[Window Manager](https://github.com/netless-io/window-manager)）和常用插件，帮助开发者轻松扩展白板应用的功能。使用 Fastboard SDK，你无需深入学习互动白板复杂的概念，只需几行代码即可加入白板房间，并立即使用丰富的工具体验实时互动协作。


## 1.2.3 版

该版本于 2022 年 10 月 28 日发布。

#### 升级必看

**API 更名**

`FastRoom` 类下的 `setStokeWidth` 更名为 `setStrokeWidth`，详见 [`setStrokeWidth`](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#setstokewidth)。

#### 新增特性

**新版文档转换服务支持**

该版本在 [`FastInsertDocParams `](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#insertdocs) 类中新增以下属性以支持新版文档转换服务：

- `dynamicDoc`: Boolean。文档转换任务类型是否为动态转换。

- `converterType`：枚举。文档转换服务版本，取值如下：
  - `Projector`：新版。详见[新版文档转换服务](https://docs.agora.io/cn/whiteboard/file_conversion_overview?platform=Android)。
  - `WhiteboardConverter`：旧版（默认值）。详见[旧版文档转换服务](https://docs.agora.io/cn/whiteboard/file_conversion_overview_old?platform=RESTful)。

#### 问题修复

该版本修复了 `FastInsertDocParams` 中的参数顺序错误。

## 1.2.0 版

该版本于 2022 年 5 月 27 日发布。

#### 新增特性

**1. 白板用户界面的控件配置**

为支持自定义白板用户界面，该版本在 `FastUiSettings` 类中新增如下方法，用于设置白板用户界面上的控件：

- [`showRoomController`](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#showroomcontroller)：展示白板用户界面上的控件。
- [`hideRoomController`](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#hideroomcontroller)：隐藏白板用户界面上的控件。
- [`setToolsExpandAppliances`](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#settoolsexpandappliances)：设置展开模式下工具条包含的工具集
- [`setToolsCollapseAppliances`](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#settoolscollapseappliances)：设置折叠模式下工具条包含的工具集。
- [`setToolsColors`](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#settoolscolors)：设置白板工具的颜色。
- [`setToolboxGravity`](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#settoolboxgravity)：设置工具条在白板上的位置。

**2. 白板用户界面的样式配置**

该版本在 `FastRoom` 类中新增 [`setFastStyle`](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android#setfaststyle) 方法，用于设置白板用户界面的样式。通过该方法，你可以修改白板用户界面的主题色彩和主题模式。

## 1.0.0 版

该版本于 2022 年 3 月 16 日发布，是 Fastboard SDK 首个版本。

#### 功能特性

**1. 白板核心功能的默认实现和 UI**

该版本直接实现了互动白板的核心基础功能，并提供默认的 UI。集成 Fastboard SDK 并调用 `join` 方法加入白板房间后，即可使用这些功能。该版本实现的核心功能如下：

- 白板工具栏，包括铅笔、文本编辑、图形工具等所有白板基础编辑工具，并支持设置线条粗细、字体大小和颜色。
- 页面管理，包括新增页面、页面跳转、页面缩放。
- 撤销、重做

尽管 Fastboard SDK 提供了上述功能的默认实现，但也提供了如下 API，方便你根据需要自行开发：

- `setAppliance`
- `setStrokeWidth`
- `setStrokeColor`
- `undo`
- `redo`

**2. 展示文件**

Fastboard SDK 支持在白板中插入和展示多种形式的文件，例如，PNG、JPG 格式的图片，MP3、MP4 格式的音视频，以及 PPT、PPTX、DOC、DOCX、PDF 等格式的文档。具体实现步骤参考[展示文件](./present_files_android?platform=Android)。

#### 相关文档

你可以参考以下文档使用 Fastboard SDK 实现相应的互动白板功能：

- [加入白板房间](./join_whiteboard_room_android_fastboard)：快速集成 Fastboard SDK，加入白板房间，并立即使用丰富的编辑工具体验实时互动协作。
- [展示文件](./present_files_android?platform=Android)：介绍如何在白板应用中插入图片、播放音视频和演示文档。
- [API 参考](https://docs.agora.io/cn/whiteboard/fastboard_api_android?platform=Android)：提供 Fastboard SDK 核心 API 的详细描述。