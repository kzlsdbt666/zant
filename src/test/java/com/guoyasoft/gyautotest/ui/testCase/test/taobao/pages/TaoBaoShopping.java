package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 11:26
 **/
public class TaoBaoShopping extends BaseUI {
  @FindBy(xpath = "//img[@data-spm-anchor-id='a230r.1.0.i0.15586fbeRV4GlV']")
  private WebElement diyige;
  public void clickdiyige() {click(diyige);}

}
