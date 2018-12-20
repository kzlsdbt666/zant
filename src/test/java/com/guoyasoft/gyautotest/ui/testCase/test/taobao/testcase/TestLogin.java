package com.guoyasoft.gyautotest.ui.testCase.test.taobao.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoHome;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoLogin;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoShopping;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 12:00
 **/
//新建类写业务代码
public class TestLogin extends BaseUI{
  @Test
  public void testLogin(){
    driver.get("https://www.taobao.com/");
    //页面初始化
    TaoBaoHome taoBaoHome = PageFactory.initElements(driver, TaoBaoHome.class);
    //调用针对每个元素的操作方法
    taoBaoHome.clickLoginLink();
    taoBaoHome.search("手机");
    TaoBaoLogin taoBaoLogin = PageFactory.initElements(driver, TaoBaoLogin.class);
    taoBaoLogin.clickLoginIcon();
    taoBaoLogin.sendKeysLoginUserName("18103909786");
    taoBaoLogin.sendKeysLoginPassword("xue00011133");
    taoBaoLogin.clickLoginButton();
    TaoBaoShopping taoBaoShopping = PageFactory.initElements(driver, TaoBaoShopping.class);
    taoBaoShopping.clickdiyige();
    boolean actual=driver.getPageSource().contains("我的淘宝");
    Assert.assertEquals(actual,true);
  }


}

