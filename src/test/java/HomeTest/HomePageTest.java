package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void HomePageLoginMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
       // homepage.searchBar();
       // Thread.sleep(3000);
      //  homepage.SearchData();
        //homepage.LearnMethod();
       // Thread.sleep(3000);
    }


    @Test
    public void TuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(3000);
        homepage.ClickBootcampsAndCourses();
        Thread.sleep(3000);
        homepage.ClickFliterIcon();
        Thread.sleep(3000);
        homepage.ClickSearch();
        Thread.sleep(3000);

       homepage.SearchData();
        Thread.sleep(3000);

        homepage.ClickRegion();
        Thread.sleep(3000);
        homepage.SelectRegion();
        Thread.sleep(3000);
        homepage.SelectCatogery();
        Thread.sleep(3000);


    }

    @Test
    public void BootCampsMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(3000);
        homepage.ClickBootcampsAndCourses();
        Thread.sleep(3000);
      homepage.scrollToPosition(0,600);
        Thread.sleep(3000);

    }
}




