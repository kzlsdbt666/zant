package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 11:51
 **/
public class TaoBaoLogin extends BaseUI {
  @FindBy(xpath = "//i[@id='J_Quick2Static']")
  private WebElement loginIcon;
  @FindBy(xpath = "//input[@id = 'TPL_username_1']")
  private WebElement loginUserName;
  @FindBy(xpath = "//input[@id='TPL_password_1']")
  private WebElement loginPassword;
  @FindBy(xpath = "//button[@id='J_SubmitStatic']")
  private WebElement loginButton;
  public void clickLoginIcon(){
    click(loginIcon);
  }
  public void sendKeysLoginUserName(String userName){
    sendKeys(loginUserName,userName);
  }
  public void sendKeysLoginPassword(String password){
    sendKeys(loginUserName,password);
  }
  public void clickLoginButton(){
    click(loginButton);
  }
}
