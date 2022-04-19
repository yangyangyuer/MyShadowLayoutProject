## ShadowLayout继承至Framelayout
#### GIF阴影有些失真,实际效果可以下载demo体验

 <img src="https://github.com/zhongruiAndroid/MyShadowLayoutProject/blob/master/screenshot/shadow_image.jpg" alt="image"  width="auto" height="640">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://github.com/zhongruiAndroid/MyShadowLayoutProject/blob/master/screenshot/shadowview.gif" alt="image"  width="auto" height="640">  
 

## [Demo.apk下载](https://raw.githubusercontent.com/zhongruiAndroid/MyShadowLayoutProject/master/demo/demo.apk "apk文件")

| 属性                    | 类型      | 说明                                                  |
|-------------------------|-----------|-------------------------------------------------------|
| shadowRange             | dimension | 阴影范围,值越大,阴影越大,默认14dp                     |
| shadowRangeOffset       | dimension | 如果阴影在view边缘有被切割的痕迹,可以将值调大,默认5dp |
| shadowColor             | color     | 阴影颜色,默认#b9cccccc                                |
| shadowOffsetLeft        | dimension | 左边阴影向view中心偏移量                              |
| shadowOffsetTop         | dimension | 上边阴影向view中心偏移量                              |
| shadowOffsetRight       | dimension | 右边阴影向view中心偏移量                              |
| shadowOffsetBottom      | dimension | 下边阴影向view中心偏移量                              |
| shadowRadius            | dimension | 阴影圆角半径                                          |
| shadowTopLeftRadius     | dimension | 阴影左上圆角半径                                      |
| shadowTopRightRadius    | dimension | 阴影右上圆角半径                                      |
| shadowBottomRightRadius | dimension | 阴影右下圆角半径                                      |
| shadowBottomLeftRadius  | dimension | 阴影左下圆角半径                                      |
| solidColor              | color     | view剩余部位填充色,默认Color.WHITE                    |

```xml
<com.github.shadowlayout.ShadowLayout
    android:layout_width="150dp"
    android:layout_height="150dp"
    app:shadowRange="15dp"
    app:shadowRangeOffset="5dp"
    app:shadowColor="@color/gray_f9"
    app:shadowOffsetLeft="0dp"
    app:shadowOffsetTop="0dp"
    app:shadowOffsetRight="0dp"
    app:shadowOffsetBottom="0dp"
    app:shadowRadius="10dp"
    app:shadowTopLeftRadius="10dp"
    app:shadowTopRightRadius="10dp"
    app:shadowBottomRightRadius="10dp"
    app:shadowBottomLeftRadius="10dp"
    app:solidColor="@color/white"
    >
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="Hello World!"
        />
</com.github.shadowlayout.ShadowLayout>
```

```java
ShadowLayout sl = findViewById(R.id.sl);

sl.setShadowColor(Color.GRAY)
...此处省略X行代码
sl.setShadowRange(10)
```

<br/>

### 如果本库对您有帮助,还希望支付宝扫一扫下面二维码,你我同时免费获取奖励金(非常感谢 Y(^-^)Y)
![github](https://github.com/zhongruiAndroid/SomeImage/blob/master/image/small_ali.jpg?raw=true "github")  


| 最新版本号 | [ ![Download](https://api.bintray.com/packages/zhongrui/mylibrary/MyShadowLayout/images/download.svg) ](https://bintray.com/zhongrui/mylibrary/MyShadowLayout/_latestVersion) |
|--------|----|
  



```gradle
implementation 'com.github:MyShadowLayout:版本号看上面'
```  
