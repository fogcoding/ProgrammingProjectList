## Android版本的项目框架

### 说明
* 运行模式

> * ListView展示所有项目，点击选择进入对应的项目界面

> * 只需按照下面的步骤操作，即可自动完成耦合 


![](http://images2015.cnblogs.com/blog/951171/201609/951171-20160924003428121-1127574073.png)

* 增加项目的方法
* step 1:去values -> string -> Project,在Project中添加名称
* step 2:新建一个独立的package，在该package里新建Activity用来展示功能，并设置隐式启动的action，同时在actionDocument类中添加对应的信息
* step 3:在Activity中实现自己的项目功能

### 实现了的功能展示
* 逆转字符串

![](http://images2015.cnblogs.com/blog/951171/201609/951171-20160924003440481-342957189.png)

* 加密短信

![](http://images2015.cnblogs.com/blog/951171/201609/951171-20160924003435496-1603527109.png)
