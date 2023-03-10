# java_EE
 一些javaEE的内容，把基础的java整理到这个文件夹，
 可以一目了然 又因为这是javaEE，环境是jdk8，不用过多的配置，也可以放在同一个版块中

## part1 java设计模式版块

## part2 java题版块
 #### Q1 在不改变指针变量的情况下修改字符串S的值
 #### Q2 ArrayList和LinkedList的区别
 #### Q3 HashMap的put方法
 #### Q4 手写冒泡排序 

## part3 idea使用版块
 如今idea已经占据java开发的75%的份额，19年入学的大学生，最先使用的编译器的eclipse，因此在转向idea时候有一些不熟悉
 同时，idea的使用也应该属于java开发的基础，因此特意去学习idea的基础
 
### 3.1 idea的基础配置
 个人学习参考尚硅谷的IDE，关于idea的基础配置可以参考视频[链接](https://www.bilibili.com/video/BV1CK411d7aA?p=8)
 ，教程中的配置以下信息，日后可以根据需求去查阅视频
* 系统设置
  1. 取消默认启动项目配置
   `设置-->外观与行为-->系统设置`
  2. 取消自动更新
  `设置-->外观和行为-->系统设置-->更新`
* 设置整体主题
* 设置编译器主题样式
  1. 编译器主题
  2. 字体大小
  3. 注释的字体颜色
* 显示行号与方法分隔符
* 代码智能提示功能
* 自动导包设置
  `设置-->编译器-->常规-->自动导入`
* 设置项目文件编码
  `设置-->编译器-->文件编码`
* 修改类头的文档注释信息
  `设置-->编译器-->文件和代码模板`
* 设置自动编译
* 设置为省电模式
* 取消双击shift搜索

###3.2 常见代码模板
有两种常见的代码模板的方式如下
####3.2.1 后缀补全(Postfix Completion)
`设置-->编译器-->常规-->后缀补全`

顾名思义，即使用变量后.xxx 自动把此代码补全
例如 b.if  --->if(b)，更多案例可点击查看

**自定义后缀补全**方式：

在设置中选择添加，他的触发条件为：$EXPR$.key

key为密匙 $EXPR$为之前输入的值

相关的符号还有：

$end$补全后光标停止与此处

$var$补全后会产生的几个空符号，需要用户进行填写


####3.2.2 实时模板(Live Templates)
`设置-->编译器-->实时模板`

顾名思义，在任何时候(实时)输入代码能弹出提醒
例如 输入sout，自动提醒出java的标准输出代码

PS:自定义实时模板的方法与后缀补全相同(简单)，但需要主要不要更改了IDE原本自己设置的，可以自己建立一个用户自定义的组进行修改后配置


### 3.3 快捷键的使用
#### 3.3.1 通用型快捷键
* 复制 `ctrl+c`
* 粘贴 `ctrl+v`
* 剪切 `ctrl+x`
* 撤销 `Ctrl+z`
* 反撤销 `ctrl+shift+z`

#### 3.3.2 说明型快捷键
* 格式化代码 `ctrl+alt+l`
* 使用单行注释 `ctrl+/`
* 使用/取消多行注释 `ctrl+shift+/`

#### 3.2.3 快速开发快捷键
* **查看源码** `Ctrl+指定结构 或 Ctrl+N 或shift shift`
* **显示当前类结构** `ctrl+f12`
* 查看文档方法 `ctrl+q`
* 查看类的UML关系图 `ctrl+alt+u`
* **定位到某行** `ctrl+g`
* 快速查找 `Ctrl+f`
* 查找与替换 `Ctrl+r`
* **在项目中查找** `ctrl+h（自定义） Ctrl+shift+f`

#### 3.2.4 快速操作快捷键
* **智能提示** `alt+enter`
* 提示代码模板 `Ctrl+j`
* **使用XX进行环绕** `ctrl+alt+t`
* **代码生成** `alt+insert`
* 切换到下一行代码空位 `shift+enter`
* 切换到上一行代码空位 `Ctrl+Alt+enter`
* 方法的形参列表提醒 `ctrl+p`



### 3.4 断点的使用
* 行断点
* 方法断点
* 字段断点
* 条件断点
* 异常断点

在日常debug的时候，没有指明特定的断点使用，
都要根据特定的代码情况进行打断点的操作，以上是通过点击，设置可以很容易的搞懂
，下面是一些稍微复杂的案例

* 强制结束

        在进行断点进入某一个方法内部，走到一半不想继续走了，中途返回可以使用强制结束
        使用的方式为：选择断点处点击右键强制退出即可

* 自定义调试数据视图

        在进行某些较为复杂的函数操作时(比如HashMap中有较多的值)，可以点击右键最下方"自定义数据视图"进行查询

### 3.5 插件的使用
#### 3.5.1 Material Theme

 idea支持各种主题插件，其中最出名的当属 Material Theme
 
#### 3.5.2 GsonFormatPlus
 
 根据JSON生成对象，使用方式：`alt+s或alt+insert调取`
 
#### 3.5.3 LeetCode Editor
 
 可以在idea中进行刷LeetCode题，不必在网页中打开再转移到idea中
 
#### 3.5.4 Key PromoterX

 快捷键提示插件，当执行鼠标操作时候，如果该操作可以被快捷键替代，会给出提醒
 
#### 3.5.5 javaDoc

Javadoc用于描述类或者方法的作用。Javadoc可以写在类上面和方法上面

#### 3.5.6 presentation Assistant

程序员没啥用，但是对教学挺有帮助的，当使用了什么快捷键之后，会在屏幕下边进行显示快捷键

#### 3.5.7 statistic

代码统计工具，有时在写项目总结的时候能够用到此工具

#### 3.5.8 CodeGlance Pro

在编辑器右侧生成代码小地图，可以拖拽小地图光标对代码进行快速定位，阅读多行代码比较实用

#### 3.5.9 Rainbow Brackets

给括号添加彩色，使开发者通过颜色区分括号嵌套等级，便于阅读

#### 3.5.10 Alibaba java Coding Guidelines

阿里巴巴java编码规范检查插件，检测代码是否存在问题，是否符合规范

#### 3.5.11 GenerateAllSetter

快速生成get与set方法

## part4 java基础
 由于内容较多，java基础配置有专门的readme.md文档，在其相关的文件夹中可进行查阅

