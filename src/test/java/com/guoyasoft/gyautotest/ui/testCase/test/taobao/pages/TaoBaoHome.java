package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 11:50
 **/
//每个页面建一个类
public class TaoBaoHome extends BaseUI {
  //@FindBy注解xpath定位元素
  @FindBy(xpath = "//a[contains(text(),'亲,请登录')]")
  //把结果存入一个变量中
  private WebElement loginLink;
  @FindBy(xpath = "//input[@id='q']")
  private WebElement searchInput;
  @FindBy(xpath = "//button[contains(text(),'搜索')]")
  private WebElement searchButton;
  //每个元素操作封装定义一个方法
  public  void clickLoginLink() {
    click(loginLink);
  }
  public void search(String text){
    sendKeys(searchInput,text);
    click(searchButton);
  }
}
