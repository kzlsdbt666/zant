package com.guoyasoft.gyautotest.ui.testCase.test;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.Action;
import jdk.internal.util.xml.impl.Input;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.collections.Sets;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-13 10:29
 **/
public class TestUI extends BaseUI {

  @Test
  public void testTextInput() {
    //打开网址
    driver.get("https://www.taobao.com/");
    //定位页面元素
    WebElement text = driver.findElement(By.xpath("//input[@id='q']"));
    //清空输入框
    text.clear();
    //往输入框中填值
    text.sendKeys("手机");
    //等待两秒
    sleep(2);
  }

  @Test
  public void testbutton() {
    testTextInput();
    WebElement button = driver.findElement(By.xpath("//button[contains(text(),\"搜索\")]"));
    click(button);
    sleep(2);
  }

  @Test
  public void testLink() {
    //打开网址
    driver.get("https://www.taobao.com/");
    //定位页面元素
    WebElement link = driver
        .findElement(By.xpath("//li[@aria-label=\"查看更多\"]/a[contains(text(),'女装')]"));
    //点击
    //link,click();
    //ctrl + 点击
    //新建一个Actions的实例
    //Action action=new Action(driver);
    //操作
    //actions.keydown(keys.CONTRL).click(link).keyUp(Keys.CONTROL).perform();
    //shift + 点击
    Actions actions = new Actions(driver);
    actions.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).perform();
    sleep(2);
  }

  @Test
  public void testSelect() {
    driver
        .get("file:///C:/Users/Administrator/Documents/WeChat%20Files/zant009/Files/demo(2).html");
    //定位元素
    WebElement select = driver.findElement(By.xpath("//select"));
    //操作
    Select selects = new Select(select);
    selects.selectByVisibleText("香蕉");
    sleep(2);
    selects.selectByIndex(0);
    sleep(2);
    selects.selectByValue("juzi");
    sleep(2);
  }

  @Test
  public void testDate() {
    driver
        .get("file:///C:/Users/Administrator/Documents/WeChat%20Files/zant009/Files/demo(2).html");
    String js = "var xpath = \"//input[@type='date']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.value=\"2018-12-12\";";
    JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
    jsDriver.executeScript(js);
    sleep(2);
  }

  @Test
  public void testNavigate() {
    driver.get("https://www.baidu.com/");
    sleep(1);
    driver.get("https://www.jd.com/");
    sleep(1);
    driver.navigate().back();
    sleep(1);
    driver.navigate().forward();
    sleep(1);
    driver.navigate().refresh();
    sleep(1);
    driver.navigate().to("https://www.taobao.com/");
    sleep(1);
  }

  @Test
  public void testUserName() {
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
    WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
    userName.clear();
    userName.sendKeys("zhangbw");
    sleep(2);
  }

  @Test
  public void testPassword() {
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
    password.clear();
    password.sendKeys("271518");
    sleep(2);
  }

  @Test
  public void testCheckcode() {
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
    WebElement checkcode = driver.findElement(By.xpath("//input[@id='checkCode']"));
    checkcode.clear();
    checkcode.sendKeys("12345");
    sleep(2);
  }

  @Test
  public void testButton() {
    WebElement button = driver.findElement(By.xpath("//input[@id='loginBtn']"));
    button.click();
    sleep(2);
  }

  @Test
  public void guoyasignUp() {
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
    sleep(2);
    WebElement yonghuming = driver.findElement(By.xpath("//input[@id='userName']"));
    WebElement zhenshixingming = driver.findElement(By.xpath("//input[@id='realName']"));
    WebElement mima = driver.findElement(By.xpath("//input[@id='password']"));
    WebElement querenmima = driver.findElement(By.xpath("//input[@id='password2']"));
    WebElement shouji = driver.findElement(By.xpath("//input[@id='phone']"));
    WebElement nianling = driver.findElement(By.xpath("//input[@id='age']"));
    WebElement jiaoyanma = driver.findElement(By.xpath("//input[@id='checkCode']"));
    WebElement zhuce = driver.findElement(By.xpath("//input[@id='submitBtn']"));
    //操作
    yonghuming.clear();
    yonghuming.sendKeys("ztfn");
    sleep(2);
    zhenshixingming.clear();
    zhenshixingming.sendKeys("斋藤飞鸟");
    sleep(2);
    mima.clear();
    mima.sendKeys("lovingyou");
    sleep(2);
    querenmima.clear();
    querenmima.sendKeys("lovingyou");
    sleep(2);
    shouji.clear();
    shouji.sendKeys("15002122585");
    sleep(2);
    nianling.clear();
    nianling.sendKeys("20");
    sleep(2);
    jiaoyanma.clear();
    jiaoyanma.sendKeys("1234");
    sleep(2);
    zhuce.click();
    sleep(2);

    Alert alert = driver.switchTo().alert();
    //确定
   /*alert.accept();
   //取消
   alert.dismiss();
   //获取提示文本
   alert.getText();
   //往对话框中填值
   alert.sendKeys("");*/
    sleep(2);
  }

  @Test
  public void testWindowSwitch() {
    driver.get("https://www.taobao.com/");
    driver.findElement(By.xpath("//li[@aria-labe]='查看更多'/a[contains(text(),'女装')")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-labe]='查看更多'/a[contains(text(),'男装')")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-labe]='查看更多'/a[contains(text(),'内衣')")).click();
    sleep(1);
    driver.findElement(By.xpath("//li[@aria-labe]='查看更多'/a[contains(text(),'鞋靴')")).click();
    sleep(2);
    //1.获取所有窗口的句柄
    Set<String> handles = driver.getWindowHandles();
    //2.使用foreach循环遍历set集合中句柄
    for (String h : handles) {
      //3.根据句柄切换窗口
      driver.switchTo().window(h);
      sleep(2);
      //4.根据窗口标题来判断当前是哪个窗口
      if (driver.getTitle().contains("淘宝女鞋")) {
        //5.结束当前循环
        break;
      }
    }
  }

  @Test
  public void testContainer() {
    //数组
    //声明
    String[] strings = {"11", "22", "333", "444"};

    //String[] strings1 = new String[5];
    //取用
    strings[0] = "555";
    System.out.println(strings[0]);
    //定长数组
    String[][] str2 = {{"1", "2", "3", "4"}, {"11", "22", "33", "44"},
        {"111", "222", "333", "444"}};
    String[][] str21 = new String[3][4];
    System.out.println(str2[1][2]);

    List<String> list = new ArrayList<String>();
    //往容器的某个部位加东西
    list.add("111");
    list.add("222");
    list.add("333");
    list.add(1, "444");
    //根据编号取容器中的数据
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));

    //新建一个map
    Map<String, String> map = new HashMap<String, String>();
    //存(key不能重复)
    map.put("姓名", "张博文");
    map.put("性别", "男");
    map.put("年龄", "23");
    //取
    System.out.println(map.get("张博文"));
    //删
    map.remove("姓名");
    System.out.println(map.get("姓名"));

    Set<String> set = new HashSet<>();
    set.add("1111");
    set.add("1111");
    set.add("1111");
    set.remove("1111");
    for (String s : set) {
      System.out.println(s);
    }
  }

  @Test
  public void testIframe() {
    driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
    driver.findElement(By.xpath("//a[contains(text(),'查询面试')]")).click();
    sleep(3);
    WebElement iframe = driver.findElement(By.xpath("//iframe"));
    driver.switchTo().frame(iframe);
    driver.findElement(By.xpath("//button[contains(text(),'查询')]")).click();
    sleep(3);
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//a[contains(text(),'面试统计')]")).click();
    sleep(3);
  }

  @Test
  public void testFor() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    for (int i = 0; i < 7; i++) {
      System.out.println(arr[i]);
    }
  }
  @Test
  public void  testFor1() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

    // for (int i =0;i<=7;i++){
    //System.out.println(arr[i]);}
    //for (int i=0;i<=arr.length -1;i++){
    //System.out.println(arr[i]);}
    for (int i:arr){
      System.out.println(i);
    }
  }

  @Test
  public  void jiujiu() {
    //倒三角
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + "*" + i + "=" + (i * j) + "\t");
      }
      System.out.println();
    }
  }

@Test
  public void testIf(){
    int money=3;
    if (money>=2){
      System.out.println("可以买笔");
    }else{
      System.out.println("余额不足");
    }
    int yuE=200;
    int yuEBao=2000;
    int yinHangKa=20000;
    int iphoneX=10000;
    if (yuE>=iphoneX){
      System.out.println("余额扣除"+iphoneX);
    }else if(yuEBao>=iphoneX){
      System.out.println("余额宝扣除"+iphoneX);
    }else if (yinHangKa >= iphoneX) {
      System.out.println("银行卡扣除" + iphoneX);
    } else {
      System.out.println("扣款失败");
    }

  }

  @Test
  public void BubbleSort(){
    int[] arr ={17,21,14,32,8,19};
    for (int i:arr){
      System.out.println(i+"\t");
    }
    for (int i=arr.length-1;i>=1;i--){
      for(int j=0;j<= i-1;j++) {
        if (arr[j]>arr[j+1]){
          int a=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=a;
        }
      }
    }
    for (int i:arr){
      System.out.println(i+"\t");
    }
    System.out.println();
  }
  @Test
  public void testAssert(){
    driver.get("https://www.taobao.com/");
    driver.findElement(By.xpath("//a[contains(text(),'亲，请登录')]")).click();
    sleep(1);
    driver.findElement(By.xpath("//i[@id='J_Quick2Static']")).click();
    sleep(1);
    WebElement userName=driver.findElement(By.xpath("//input[@id='TPL_username_1']"));
    userName.clear();
    userName.sendKeys("dongyadian2012");
    WebElement password=driver.findElement(By.xpath("//input[@id='TPL_password_1']"));
    password.clear();
    password.sendKeys("18860393942dyd");
    driver.findElement(By.xpath("//button[@id='J_SubmitStatic']")).click();
    sleep(3);
    boolean actual=driver.getPageSource().contains("我的淘宝");
    Assert.assertEquals(actual,true);
  }


}