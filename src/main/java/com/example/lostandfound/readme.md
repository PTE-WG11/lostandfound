# 代码解释与配置
### MVC详解

https://blog.csdn.net/Wztdx/article/details/129403152

- Model(模型) 是应⽤程序中用于处理应用程序数据逻辑的部分。通常模型对象负责在数据库在存取数据。

- View（视图） 是应用程序中处理数据显示的部分。通常视图是依据模型数据创建的。

- Controller（控制器） 是应⽤程序中处理用户交互的部分。通常控制器负责从视图读取数据，控制用户输⼊，并向模型发送数据。

### 目录解释

|---/src/main

|---|---/src/main/java:目录下放置所有的java文件（源代码）

|---|---|---/src/main/java/com/example/demo ：核心源码存放文件

|---|---|---/src/main/java/com/example/demo/controller ：控制层

|---|---|---/src/main/java/com/example/demo/service：业务代码层

|---|---|---/src/main/java/com/example/demo/mapper：持久层

|---|---|---/src/main/java/com/example/demo/vo ：通常用于与前端交互，封装前端调用某个接口之后所需的所有数据。在前后端分离的时代，VO主要应用于表示视图层的类。

|---|---|---/src/main/java/com/example/demo/dto ：则主要应用于数据传输层，特别是在Controller层和Service层。在Controller层，DTO用于接收参数，无论是单个参数还是多个参数，都可以通过创建一个DTO对象来进行接收。使用DTO传参相比使用注解(@RequestParam等)具有更高的可读性和维护性。在Service层，处理复杂的逻辑后，将处理好的DTO进行copyBean即可无伤转换为持久化对象(Bo)。总的来说，VO和DTO都是为了实现程序中的数据传输和交互，但它们的使用场景不同。前端与后端交互时，使用VO；而在服务层之间传输数据时，使用DTO。

|---|---|---/src/main/java/com/example/demo/entity：存放实体类，与数据库表名和字段名对应

|---|---|---/src/main/java/com/example/demo/config：一些配置类，例如redis、swagger等配置信息

|---|---|---/src/main/java/com/example/demo/utils：一些工具类，例如时间格式化工具、加密工具、返回结果封装工具、文件上传工具等

|---|---/src/main/resource： 存放资源文件、如静态资源文件、配置文件、页面文件等

|---|---|---/src/main/resource/mapper：存放MyBatis操作数据库的xml文件

|---|---|---/src/main/resource/static：存放静态资源例如css样式、图片等

|---|---|---/src/main/resources/templates：存放模板文件如thymeleaf模板文件

|---|---|---/src/mian/resource/application.properties:： SpringBoot项目的配置文件，SpringBoot支持.properties和.yml文件
————————————————
