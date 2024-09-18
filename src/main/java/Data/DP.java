package Data;

import org.testng.annotations.DataProvider;

public class DP
{
    @DataProvider(name = "onBoarding1-subTitle")
    public Object[][] dpOnBoarding1SubTitle() {
        return new Object[][] {{"I am aiming to help people who are seeking mental help. While I am not a human therapist, I can do a lot of similar things:"}};
    }

    @DataProvider(name = "onBoarding1-title")
    public Object[][] dpOnBoarding1Title(){
        return new Object[][] {{"Hi, I am Mentle, the app that is by your side 24/7."}};
    }

    @DataProvider(name = "howYourName-title")
    public Object[][] dpHowYourNameTitle() {
        return new Object[][] {{"Hi, I am Mentle, your AI therapy assistant."}};
    }

    @DataProvider(name = "howYourName-subtitle") //ИСПРАВИТЬ ТЕКСТ!!!
    public Object[][] dpHowYourNameSubTitle() {
        return new Object[][] {{"it is great to have you here! Let’s dive into what I can help you with today."}};
    }

    @DataProvider(name = "yourWellBeing-title") //ИСПРАВИТЬ ТЕКСТ!!!
    public Object[][] dpYourWellBeingTitle() {
        return new Object[][] {{"Your emotional well-being plan is waiting for you inside of the app!"}};
    }
}
