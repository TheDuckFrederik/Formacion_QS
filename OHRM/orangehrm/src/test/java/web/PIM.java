package web;
//
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import java.io.File;
// import java.util.ArrayList;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.interactions.Actions;
// import javax.xml.parsers.DocumentBuilder;
// import javax.xml.parsers.DocumentBuilderFactory;
// import org.w3c.dom.Document;
//
public class PIM extends Main {
    //
    public int action = 0;
    //
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC001() throws InterruptedException, IOException {
        testId = "ORN_TC001";
        try {
            //
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_001 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String url = config.getProperty("url");
            String usernameP = config.getProperty("TC001_username");
            String passwordP = config.getProperty("TC001_password");
            String loginP = config.getProperty("TC001_login");
            //
            String usernameT = getTagValue("username", doc);
            String passwordT = getTagValue("password", doc);
            //
            driver.get(url);
            Thread.sleep(500);
            action = 1;
            //
            WebElement username = driver.findElement(By.xpath(usernameP));
            username.sendKeys(usernameT);
            action = 2;
            //
            WebElement password = driver.findElement(By.xpath(passwordP));
            password.sendKeys(passwordT);
            action = 3;
            //
            WebElement login = driver.findElement(By.xpath(loginP));
            login.click();
            Thread.sleep(5000);
            action = 4;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC001\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_001 stopped after performing action " + action + " of 4 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC002() throws InterruptedException, IOException {
        testId = "ORN_TC002";
        try {
            //
            ORN_TC001();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_002 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String pimP = config.getProperty("TC002_PIM");
            //
            WebElement pim = driver.findElement(By.xpath(pimP));
            pim.click();
            Thread.sleep(1000);
            action = 1;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC002\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_002 stopped after performing action " + action + " of 1 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC003() throws InterruptedException, IOException {
        testId = "ORN_TC003";
        try {
            //
            ORN_TC002();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_003 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String addP = config.getProperty("TC003_Add");
            String fnP = config.getProperty("TC003_FirstName");
            String mnP = config.getProperty("TC003_MiddleName");
            String lnP = config.getProperty("TC003_LastName");
            String idP = config.getProperty("TC003_ID");
            String saveP = config.getProperty("TC003_Save");
            //
            String fnT = getTagValue("TC003_fistName", doc);
            String mnT = getTagValue("TC003_middleName", doc);
            String lnT = getTagValue("TC003_lastName", doc);
            String idT = getTagValue("TC003_id", doc);
            //
            WebElement add = driver.findElement(By.xpath(addP));
            add.click();
            Thread.sleep(1000);
            action = 1;
            //
            WebElement fn = driver.findElement(By.xpath(fnP));
            fn.sendKeys(fnT);
            action = 2;
            //
            WebElement mn = driver.findElement(By.xpath(mnP));
            mn.sendKeys(mnT);
            action = 3;
            //
            WebElement ln = driver.findElement(By.xpath(lnP));
            ln.sendKeys(lnT);
            action = 4;
            //
            WebElement id = driver.findElement(By.xpath(idP));
            int n = 4;
            while (true) {
                id.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            id.sendKeys(idT);
            action = 5;
            //
            WebElement save = driver.findElement(By.xpath(saveP));
            save.click();
            Thread.sleep(5000);
            action = 6;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\0001.png"));
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\0002.png"));
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\0003.png"));
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC003\\0000.png"));
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_003 stopped after performing action " + action + " of 6 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC004() throws InterruptedException, IOException {
        testId = "ORN_TC004";
        try {
            //
            ORN_TC002();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_004 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String idPath = config.getProperty("TC004_ID");
            String searchP= config.getProperty("TC004_Search");
            String recordsP = config.getProperty("TC004_Records");
            String name1P = config.getProperty("TC004_Name1");
            String name2P = config.getProperty("TC004_Name2");
            //
            String idT = getTagValue("TC004_id", doc);
            //
            WebElement id = driver.findElement(By.xpath(idPath));
            id.sendKeys(idT);
            Thread.sleep(1000);
            action = 1;
            //
            WebElement search = driver.findElement(By.xpath(searchP));
            search.click();
            Thread.sleep(500);
            action = 2;
            //
            String recordsT = driver.findElement(By.xpath(recordsP)).getText();
            action = 3;
            System.out.println("Los resultados son: " + recordsT);
            //
            String name1T = driver.findElement(By.xpath(name1P)).getText();
            String name2T = driver.findElement(By.xpath(name2P)).getText();
            action = 4;
            //
            System.out.println("Nombre: " + name1T + " " + name2T);
            Thread.sleep(5000);
            action = 5;
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC004\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_004 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC005() throws InterruptedException, IOException {
        testId = "ORN_TC005";
        try {
            //
            ORN_TC004();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_005 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String editP = config.getProperty("TC005_Edit");
            String fnP = config.getProperty("TC005_FirstName");
            String mnP = config.getProperty("TC005_MiddleName");
            String lnP = config.getProperty("TC005_LastName");
            String saveP = config.getProperty("TC005_Save");
            //
            String fnT = getTagValue("TC005_fistName", doc);
            String mnT = getTagValue("TC005_middleName", doc);
            String lnT = getTagValue("TC005_lastName", doc);
            //
            WebElement edit = driver.findElement(By.xpath(editP));
            edit.click();
            Thread.sleep(1000);
            action = 1;
            //
            WebElement fn = driver.findElement(By.xpath(fnP));
            int n = 13;
            while (true) {
                fn.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            fn.sendKeys(fnT);
            action = 2;
            //
            WebElement mn = driver.findElement(By.xpath(mnP));
            n = 14;
            while (true) {
                mn.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            mn.sendKeys(mnT);
            action = 3;
            //
            WebElement ln = driver.findElement(By.xpath(lnP));
            n = 12;
            while (true) {
                ln.sendKeys(Keys.BACK_SPACE);
                Thread.sleep(5);
                n--;
                if (n == 0) {
                    action += 1;
                    break;
                }
            }
            ln.sendKeys(lnT);
            action = 4;
            //
            WebElement save = driver.findElement(By.xpath(saveP));
            save.click();
            Thread.sleep(5000);
            action = 5;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC005\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_005 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
    @Test(description = "Prueba Orange HRM Login")
    @Story("Ingreso la web de Orange")
    @Description("El objetivo es comprobar que al ingresar con un usuario y contraseña valido se visualice el Home de la Web")
    //
    public void ORN_TC006() throws InterruptedException, IOException {
        testId = "ORN_TC006";
        try {
            //
            ORN_TC004();
            action = 0;
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|------------------------- Beginning TC_006 ------------------------|");
            System.out.println("|-------------------------------------------------------------------|");
            //
            String deleteP = config.getProperty("TC006_Delete");
            String confirmP = config.getProperty("TC006_Confirm");
            //
            WebElement delete = driver.findElement(By.xpath(deleteP));
            delete.click();
            Thread.sleep(1000);
            action = 1;
            //
            WebElement confirm = driver.findElement(By.xpath(confirmP));
            confirm.click();
            Thread.sleep(1000);
            action = 2;
            //
            System.out.println();
            //
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\Succesfull.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
            //
        } catch (IllegalArgumentException e) {
            System.out.println("XPath ID or other locator method empty.");
            System.out.println("Err code = 0001");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\0001.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (NoSuchElementException e) {
            System.out.println("The XPath or ID isn't assigned to an element.");
            System.out.println("Err code = 0002");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\0002.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }catch (WebDriverException e) {
            System.out.println("Syntax Error on: URL, XPath, ID or other locator method.");
            System.out.println("Err code = 0003");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\0003.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        } catch (Exception e) {
            // This will catch any other exceptions
            System.out.println("Err\nNon common error, not registered.");
            System.out.println("Err code = 0000");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("C:\\Users\\unai.ovejero.ext\\Documents\\F_QS\\Formacion_QS\\OHRM\\orangehrm\\ScrnShts\\TC006\\0000.png"));
            //
            System.out.println("|-------------------------------------------------------------------|");
            System.out.println("|---------- TC_006 stopped after performing action " + action + " of 2 ----------|");
            System.out.println("|-------------------------------------------------------------------|\n");
        }
    }
}