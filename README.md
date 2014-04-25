MarkDown书写规范
========

轻量级标记语言 Markdown

Markdown还有一系列衍生版本，用于扩展Markdown的功能（如表格、脚注、内嵌HTML等等），这些功能原初的Markdown尚不具备，同时，也能让Markdown转换成更多的格式，例如LaTeX，Docbook。Markdown增强版中比较有名的有Markdown Extra、MultiMarkdown、 Maruku等。这些衍生版本要么基于工具，如Pandoc；要么基于网站，如GitHub和Wikipedia，在语法上基本兼容，但在换行等细节上也有改动。

注：本文档符合自身规范，可视作demo，参看源码



#语法参见

[官方语法说明](http://daringfireball.net/projects/markdown/syntax)

[GitHub MakDown 语法](https://github.com/mojombo/github-flavored-markdown/issues/1)

[PDF版本](https://github.com/hoosin/MarkDown/blob/master/MarkDown%E8%BD%BB%E9%87%8F%E7%BA%A7%E6%A0%87%E8%AE%B0%E8%AF%AD%E8%A8%80.pdf?raw=true)


#全局规范


MarkDown 文件均使用```.md```作为后缀 *(小写字母)*

普通文本换行，使用行末尾```2空格```触发


#语法

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
	
 