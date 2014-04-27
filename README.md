MarkDown书写规范
========

写文档好帮手，轻量级标记语言 Markdown

#概述

##宗旨

Markdown 的目标是实现「易读易写」。

可读性，无论如何，都是最重要的。一份使用 Markdown 格式撰写的文件应该可以直接以纯文本发布，并且看起来不会像是由许多标签或是格式指令所构成。Markdown 语法受到一些既有 text-to-HTML 格式的影响，包括 Setext、atx、Textile、reStructuredText、Grutatext 和 EtText，而最大灵感来源其实是纯文本电子邮件的格式。

总之， Markdown 的语法全由一些符号所组成，这些符号经过精挑细选，其作用一目了然。比如：在文字两旁加上星号，看起来就像*强调*。Markdown 的列表看起来，嗯，就是列表。Markdown 的区块引用看起来就真的像是引用一段文字，就像你曾在电子邮件中见过的那样。

##兼容 HTML

Markdown 语法的目标是：成为一种适用于网络的书写语言。

Markdown 不是想要取代 HTML，甚至也没有要和它相近，它的语法种类很少，只对应 HTML 标记的一小部分。Markdown 的构想不是要使得 HTML 文档更容易书写。在我看来， HTML 已经很容易写了。Markdown 的理念是，能让文档更容易读、写和随意改。HTML 是一种发布的格式，Markdown 是一种书写的格式。就这样，Markdown 的格式语法只涵盖纯文本可以涵盖的范围。

不在 Markdown 涵盖范围之内的标签，都可以直接在文档里面用 HTML 撰写。不需要额外标注这是 HTML 或是 Markdown；只要直接加标签就可以了。

要制约的只有一些 HTML 区块元素――比如 ``` <div> 、<table>、<pre>、<p> ```等标签，必须在前后加上空行与其它内容区隔开，还要求它们的开始标签与结尾标签不能用制表符或空格来缩进。Markdown 的生成器有足够智能，不会在 HTML 区块标签外加上不必要的 ```<p>``` 标签。


注：本文档符合自身规范，可视作demo，参看源码，欢迎大家 ```fork``` 补充完善。




#语法参见

[官方语法说明](http://daringfireball.net/projects/markdown/syntax)

[GitHub MakDown 语法](https://github.com/mojombo/github-flavored-markdown/issues/1)

[PDF版本](https://github.com/hoosin/MarkDown/blob/master/MarkDown%E8%BD%BB%E9%87%8F%E7%BA%A7%E6%A0%87%E8%AE%B0%E8%AF%AD%E8%A8%80.pdf?raw=true)


#全局规范


MarkDown 文件均使用```.md```作为后缀 *(小写字母)*

普通文本换行，使用行末尾```2空格```触发


#DEMO
================================


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
![github logo](https://raw.githubusercontent.com/hoosin/PPT/master/github/logo.png)

![github logo](https://raw.githubusercontent.com/hoosin/PPT/master/github/logo.png "Optional title")

![github logo][logo]
[logo]: https://raw.githubusercontent.com/hoosin/PPT/master/github/logo.png  "Optional title attribute"


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
	
 