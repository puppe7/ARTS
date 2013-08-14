MarkDown
========

#轻量级标记语言--MarkDown

##先聊点学习语言方面的东西

###一、通读一本语言入门或者语法介绍（）
1. 开发环境，编译器，IDE，调试，运行
2. 语言关键字，类，方法，包，调用。


###二、手动输入测试代码
1. 写出来helloworld，并运行
2. 写一个四则运算（数学运行，加减乘除，乘方，开跟，余数，上下取整）
3. 写一个字符串处理（拼接，查找，长度，截取，格式化输出）
4. 类型转换，int，string，date之间的互相转换
5. 写一个时间日期处理（当前时间，日期显示，日期和字符串显示，日期比较）
6. 写一个文件遍历，读取，写入（IO，目录下的文件，读取文件内容，创建并写入文件内容）
7. 写一个调用系统应用的程序(调用其他进程)
8. 一个简单的多线程（主线程输出数字，子线程等待10秒打印字母）
9. 数据库连接（增，删，改，查）
10. 一个简单GUI登录窗口(如果支持)
11. 写一个抓取网页内容,自动登录网页的程序
12. 一个socket程序
13. 写一个调用正则表达式查找匹配的程序



###三、了解一下语言公共运行库


###四、查找一个简单的开源项目，了解工程开发方法。

学习方法就聊到这里吧，现在让我们开始学习markdown吧。

(语法参见[官方语法说明](http://daringfireball.net/projects/markdown/syntax) )

##标题

---
>一共有六级标题,1-6个#表示

#一级标题

一级标题也可以用底线是=表示,任何数量都可以
=

##二级标题

二级标题也可以用底线是-表示，任何数量都可以
-

###三级标题

####四级标题

#####五级标题

######六级标题


##强调

---
*single asterisks*

_single underscores_

**double asterisks**

__double underscores__

**粗体\*\*包围**

*斜体\*包围*

##引用

---

上面的横线用三个-表示

>区块引用

>fdfd

##列表

---

* red
* green
* blue

+ red
+ green
+ blue

- red
- green
- blue


1. red
2. green
3. blue


* 一个列表包含一个区块
> fdfdfdfd
> 
dfdfdfdfd
>

##代码

---
代码写在这里

`
 public static void main()
`

this is method `` printf('\n');``

```js
function method()
{
    alert("javascript");
}
```

```java
class Test{
    public static void main(String argc[]){
        System.out.println("java");
    }
}
```

```cs
class Test{
    public static void main()
    {
        Console.WriteLine("C#");
    }
}
```

##link

---

行内连接[github](https://github.com/)的链接

See my [About](/about/) page for details.

[id]: http://example.com/  "Optional Title Here"
This is [an example][id] reference-style link.

下面这三种链接的定义都是相同

>\[foo]: http://example.com/  "Optional Title Here"

>\[foo]: http://example.com/  'Optional Title Here'

>\[foo]: http://example.com/  (Optional Title Here)


I get 10 times more traffic from [Google] than from
[Yahoo] or [MSN].

  [Google]: http://google.com/        "Google"
  [Yahoo]: http://search.yahoo.com/  "Yahoo Search"
  [MSN]: http://search.msn.com/    "MSN Search"

##图片

---
![github logo](/assets/help/set-up-git-27bd5975b24e994bc994ec1cf5c82ff9.gif)

![github logo](/assets/help/set-up-git-27bd5975b24e994bc994ec1cf5c82ff9.gif "Optional title")

![github logo][logo]
[logo]: /assets/help/set-up-git-27bd5975b24e994bc994ec1cf5c82ff9.gif  "Optional title attribute"


##分隔线

* * *

***

*****

- - -

\---------------------------------------

##其它

---
###**自动链接**
<http://example.com/>  diff http://example.com/



###**反斜杠**

\*literal asterisks\*

Markdown 支持以下这些符号前面加上反斜杠来帮助插入普通的符号：
>\\   反斜线
>
\`   反引号
>
\*   星号
>
\_   底线
>
\{}  花括号
>
\[]  方括号
>
\()  括弧
>
\#   井字号
>
\+   加号
>
\-   减号
>
\.   英文句点
>
\!   惊叹号

##GFM 与标准SM 不一样的地方

* GFM二级标题自动带有下划线
* GFM在issue中通过#和数字自动链接到对应的issue（request也支持）（eg：#1）
* GFM自动识别链接，链接不用尖括号括起来也会被认为是链接。
* GFM实现代码语法高亮
* GFM自动@别人
* GFM自动引用，包括项目，用户名，issue等
* GFM支持任务列表


	> - [] task #1
	> - [] task item
	> - [x] complete 
	
#note 文件夹包含一些常用文档