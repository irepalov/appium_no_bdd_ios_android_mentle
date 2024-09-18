package screens.ios;

import helpers.LocatorType;
import helpers.ScrollDirection;
import helpers.TestsUtility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import items.mobileItem.MobileItem;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import screens.Base;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class IOSBase extends Base {

    protected IOSDriver<MobileElement> iosDriver = (IOSDriver<MobileElement>) Base.appiumDriver;

    /**
     * Производит нажатие по указанному элементу.
     * Поиск элемента производится без скролла, в течение указанного таймаута.
     * Если элемент не представлен на экране, тест будет провален с соответствующей ошибкой.
     *
     * @param mobileItem Элемент, по которому необходимо выполнить нажатие.
     */
    public void tapOnElement(MobileItem mobileItem) {
        try {
            iosDriver.findElement(mobileItem.locatorType.toString(), mobileItem.locator).click();
        } catch (Exception e) {
            failTestAndPrintTapError(mobileItem.name, mobileItem.screen, mobileItem.locator,
                    mobileItem.locatorType.toString());
        }
    }

    public void doubleTapOnElement(MobileItem mobileItem) {
        //TouchActions action = new TouchActions(iosDriver);
        TouchAction action = new TouchAction(iosDriver);
        try {
            iosDriver.findElement(mobileItem.locatorType.toString(), mobileItem.locator).click();
            iosDriver.findElement(mobileItem.locatorType.toString(), mobileItem.locator).click();


        } catch (Exception e) {
            failTestAndPrintTapError(mobileItem.name, mobileItem.screen, mobileItem.locator,
                    mobileItem.locatorType.toString());
        }
    }

    /**
     * Производит получение элемента.
     * Поиск элемента производится без скролла, в течении указанного таймаута.
     * Если элемент не представлен на экране, тест будет провален с соответствующей ошибкой.
     *
     * @param mobileItem Элемент, который необходимо получить.
     * @return Объект типа {@link MobileElement}.
     */
    public MobileElement getElement(MobileItem mobileItem) {
        try {
            return iosDriver.findElement(mobileItem.locatorType.toString(), mobileItem.locator);
        } catch (Exception e) {
            failTestAndPrintGetError(mobileItem.name, mobileItem.screen, mobileItem.locator,
                    mobileItem.locatorType.toString());
        }

        // Никогда не случится.
        return null;
    }

    /**
     * Производит получение элементов.
     * Поиск элементов производится без скролла, в течении указанного таймаута.
     * Если элементы не представлены на экране, тест будет провален с соответствующей ошибкой.
     *
     * @param screenName  Название экрана (используется в логировании).
     * @param locatorType Тип локатора.
     * @param locator     Локатор.
     * @return Лист объектов типа {@link MobileElement}.
     */
    public List<MobileElement> getElements(String screenName, LocatorType locatorType, String locator) {
        try {
            return iosDriver.findElements(locatorType.toString(), locator);
        } catch (Exception e) {
            Assert.fail("Невозможно получить ни одного элемента по заданному локатору." +
                    "\n Название экрана: '" + screenName + "'\n Локатор (" + locatorType + "): '"
                    + locator + "'");
        }

        // Никогда не случится.
        return null;
    }

    private void waitElement(MobileItem mobileItem) {
        try {
            iosDriver.findElement(mobileItem.locatorType.toString(), mobileItem.locator);
        } catch (Exception e) {
            failTestAndPrintWaitError(mobileItem.name, mobileItem.screen, mobileItem.locator,
                    mobileItem.locatorType.toString());
        }
    }

    /**
     * Проверяет, существует ли элемент на экране.
     * Поиск элемента производится без скролла, в течении {@link TestsUtility#TIMEOUT_EXIST_METHODS_MS} таймаута.
     *
     * @param mobileItem Проверяемый элемент.
     * @return {@code true} - если элемент присутствует на экране. В противном случае - {@code false}.
     */
    public boolean isExist(MobileItem mobileItem) {
        try {
            iosDriver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_EXIST_METHODS_MS, TimeUnit.MILLISECONDS);
            iosDriver.findElement(mobileItem.locatorType.toString(), mobileItem.locator);
            iosDriver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_DEFAULT_SEC, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            iosDriver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_DEFAULT_SEC, TimeUnit.SECONDS);
            return false;
        }
    }

    /**
     * Проверяет, существует ли элемент на экране.
     * Поиск элемента производится без скролла. Возможен выбор, с таймаутом или без.
     *
     * @param mobileItem          Проверяемый элемент.
     * @param waitingMilliseconds Ожидание появления элемента перед выполнением метода в миллисекундах.
     * @return {@code true} - если элемент присутствует на экране. В противном случае - {@code false}.
     */
    public boolean isExist(MobileItem mobileItem, int waitingMilliseconds) {
        try {
            iosDriver.manage().timeouts().implicitlyWait(waitingMilliseconds, TimeUnit.MILLISECONDS);
            iosDriver.findElement(mobileItem.locatorType.toString(), mobileItem.locator);
            iosDriver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_DEFAULT_SEC, TimeUnit.SECONDS);
            return true;
        } catch (Exception e) {
            iosDriver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_DEFAULT_SEC, TimeUnit.SECONDS);
            return false;
        }
    }

    /**
     * Проверяет, отсутствует ли элемент на экране.
     * Поиск элемента производится без скролла, в течении {@link TestsUtility#TIMEOUT_EXIST_METHODS_MS} таймаута.
     *
     * @param mobileItem Проверяемый элемент.
     * @return {@code true} - если элемент отсутствует на экране. В противном случае - {@code false}.
     */
    public boolean isNotExist(MobileItem mobileItem) {
        try {
            iosDriver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_EXIST_METHODS_MS, TimeUnit.MILLISECONDS);
            iosDriver.findElement(mobileItem.locatorType.toString(), mobileItem.locator);
            iosDriver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_DEFAULT_SEC, TimeUnit.SECONDS);
            return false;
        } catch (Exception e) {
            iosDriver.manage().timeouts().implicitlyWait(TestsUtility.TIMEOUT_DEFAULT_SEC, TimeUnit.SECONDS);
            return true;
        }
    }

    /**
     * Ожидает, пока элемент пропадет с экрана.
     * Поиск элемента производится без скролла, в течении {@link TestsUtility#TIMEOUT_DEFAULT_SEC} таймаута.
     *
     * @param mobileItem Элемент.
     */
    public void waitDisappear(MobileItem mobileItem) {
        boolean isDisappear = false;
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < TestsUtility.TIMEOUT_LARGE_MS) {
            if (isNotExist(mobileItem)) {
                isDisappear = true;
                break;
            }
        }

        Assert.assertTrue(isDisappear, "Элемент '" + mobileItem.name + "' не исчез после " + TestsUtility.TIMEOUT_LARGE_SEC
                + " секунд." + "\n Название экрана: " + mobileItem.screen + "\n Локатор (" + mobileItem.locatorType
                + "): " + mobileItem.locator);
    }

    /**
     * Проверяет, что элемент представлен на экране.
     * Поиск элемента производится без скролла, в течении {@link TestsUtility#TIMEOUT_DEFAULT_SEC} таймаута.
     * Если элемент не представлен на экране, тест будет провален с соответствующей ошибкой.
     *
     * @param mobileItem Проверяемый элемент.
     */
    public void verifyElementIsPresent(MobileItem mobileItem) {
        waitElement(mobileItem);
    }

    /**
     * Выполняет поиск элементов на экране.
     * Если элемент не обнаруживается, то скроллит вниз и пытается обнаружить недостающие элементы.
     *
     * @param scrollableArea Область работы метода. Необходимо указать область от начала экрана, чтобы найти всё элементы.
     * @param items          Список с элементами <>MobileItem</> экрана.
     *                       Внимание!
     *                       1. Поиск элементов закончится после обнаружения последнего элемента в списке или после трех попыток скролла.
     *                       2. Первым элементом в список рекомендуется помещать элемент, который находится выше всех на экране.
     *                       3. Последним элементом в список рекомендуется помещать элемент, который находится ниже всех на экране.
     * @param startFromTop   {@code true} - если сначала нужно проскроллить до верхнего края, в противном случае - {@code false}.
     */
    protected void verifyElementsPresent(MobileItem scrollableArea, List<MobileItem> items, boolean startFromTop) {
        if (startFromTop) {
            scrollToTop(scrollableArea, 0.2, 0.8, 200);
        }

        // Скроллим экран до тех пор, пока не найдем все элементы из списка.
        int score = 0; // Количество повторений скролла.
        while (score <= TestsUtility.TIMEOUT_DEFAULT_SEC) { // Останавливаемся после нескольких попыток.
            for (Iterator<MobileItem> iterator = items.listIterator(); iterator.hasNext(); ) { // Проходим по всему списку.
                MobileItem item = iterator.next();
                logger.info("Проверка, что на экране '" + item.screen + "' представлен элемент " + item.name + ".");
                if (isExist(item, 150)) {
                    iterator.remove(); // Если находим элемент, то удаляем его из списка.
                }
            }

            // Если есть ненайденные элементы.
            if (items.size() > 0) {
                for (MobileItem item : items) logger.info("Не найден элемент: '" + item.name + "'.");
                logger.info("Скроллим " + scrollableArea.name + " для нахождения оставшихся элементов.");
                swipeByCoordinates(scrollableArea, true, 0.8, 0.2, 800); // Скроллим вниз в рамках заданной scrollableArea.
                ++score;
            }

            // Если все элементы найдены.
            else {
                logger.info("На экране '" + scrollableArea.screen + "' найдены все элементы.");
                return;
            }
        }

        // Если после трех скроллов остались ненайденные элементы в списке фейлим первый из них.
        if (items.size() > 0) {
            failTestAndPrintGetError(items.get(0).name, items.get(0).screen, items.get(0).locator,
                    items.get(0).locatorType.toString());
            logger.info(iosDriver.getPageSource()); // Может помочь для дебага упавших тестов.
        }
    }

    /**
     * Проверяет, что элемент представлен на экране.
     * Поиск элемента производится без скролла, в течении {@link TestsUtility#TIMEOUT_DEFAULT_SEC} таймаута.
     * Если элемент представлен на экране после таймаута, тест будет провален с соответствующей ошибкой.
     *
     * @param mobileItem Проверяемый элемент.
     */
    public void verifyElementIsNotPresent(MobileItem mobileItem) {
        Assert.assertTrue(isNotExist(mobileItem), "Элемент '" + mobileItem.name
                + "' не представлен на '" + mobileItem.screen + "' экране, а должен. ");
    }

    /**
     * Вводит указанный текст в указанное поле.
     * Поиск поля для ввода производится без скролла, в течении {@link TestsUtility#TIMEOUT_DEFAULT_SEC} таймаута.
     * Если поле ввода не представлено на экране, тест будет провален с соответствующей ошибкой.
     *
     * @param field     Поле ввода.
     * @param text      Текст для ввода.
     * @param clearText Флаг очистки поля перед вводом. {@code true} - если нужно очистить поле перед вводом,
     *                  в противном случае - {@code false}.
     */
    public void enterTextInField(MobileItem field, String text, boolean clearText) {
        MobileElement fieldElement = getElement(field);
        if (clearText) {
            fieldElement.sendKeys(text);
        } else {
            String oldText = fieldElement.getText();
            fieldElement.sendKeys(oldText + text);
        }
    }

//    /**
//     * Закрывает клавиатуры, если она открыта.
//     */
//    public void closeKeyboardIfPresent() {
//        if (iosDriver.isKeyboardShown()) {
//            KeyEvent key = new KeyEvent();
//            iosDriver.pressKey(key.withKey(AndroidKey.BACK));
//        }
//    }

    /**
     * Сравнивает два изображения типа {@link File}.
     *
     * @param firstImage  Первое изображение.
     * @param secondImage Второе изображение.
     * @return {@code true} - если изображения схожи более чем на 95%, в противном случае - {@code false}.
     */
    public boolean compareImages(File firstImage, File secondImage) {
        float percentage;
        try {
            BufferedImage firstBufferedImage = ImageIO.read(firstImage);
            DataBuffer firstDataBuffer = firstBufferedImage.getData().getDataBuffer();
            int firstDataBufferSize = firstDataBuffer.getSize();
            BufferedImage secondBufferedImage = ImageIO.read(secondImage);
            DataBuffer secondDataBuffer = secondBufferedImage.getData().getDataBuffer();
            int secondDataBufferSize = secondDataBuffer.getSize();
            int count = 0;

            if (firstDataBufferSize == secondDataBufferSize) {

                for (int i = 0; i < firstDataBufferSize; i++) {

                    if (firstDataBuffer.getElem(i) == secondDataBuffer.getElem(i)) {
                        count = count + 1;
                    }

                }
                percentage = (count * 100) / firstDataBufferSize;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
        return percentage > 95.0;
    }

    /**
     * Скроллит до верхнего края прокручиваемой области.
     * Метод останавливается после достижения верхнего края области или по истечению {@link TestsUtility#COUNT_SCROLL_DEFAULT} попыток.
     * Если метод не достиг верхнего края за отведенное число попыток, тест будет провален с соответствующей ошибкой.
     *
     * @param scrollableArea Прокручиваемая область.
     */
    public void scrollToTop(MobileItem scrollableArea) {
        boolean isTopReached = false;
        int attempts = 0;
        while (!isTopReached && attempts < TestsUtility.TIMEOUT_DEFAULT_SEC) {
            isTopReached = swipeWithEdgeCheck(scrollableArea, ScrollDirection.UP);
            attempts++;
        }

        Assert.assertTrue(isTopReached, "Не получилось достичь верхнего края прокручиваемой области за "
                + TestsUtility.TIMEOUT_DEFAULT_SEC + " попыток. " + "\n Название экрана: " + scrollableArea.screen);
    }

    /**
     * Скроллит до верхнего края прокручиваемой области.
     * <p>
     * Например: {@code start}=0.8, {@code end}=0.2, {@code isVertical}=true.
     * - будут выполнены свайпы снизу вверх
     * - в начальной точке от верхнего края {@code scrollableArea} отступили 80%.
     * - в конечной точке от верхнего края {@code scrollableArea} отступили 20%.
     *
     * @param scrollableArea Элемент экрана в границах которого происходит свайп.
     * @param start          Начальная точка свайпа относительно {@code scrollableArea}. Значение должно быть от 0 до 1.
     * @param end            Конечная точка свайпа относительно {@code scrollableArea}. Значение должно быть от 0 до 1.
     * @param swipeSpeed     Значение в миллисекундах. Время за которое должен произойти свайп. Чем меньше значение тем быстрее свайп.
     */
    public void scrollToTop(MobileItem scrollableArea, double start, double end, int swipeSpeed) {
        boolean isTopReached = false;
        int attempts = 0;
        while (!isTopReached && attempts < TestsUtility.TIMEOUT_DEFAULT_SEC) {
            isTopReached = swipeWithEdgeCheck(scrollableArea, true, start, end, swipeSpeed);
            attempts++;
        }

        Assert.assertTrue(isTopReached, "Не получилось достичь верхнего края прокручиваемой области за "
                + TestsUtility.COUNT_SCROLL_DEFAULT + " попыток. " + "\n Название экрана: " + scrollableArea.screen);
    }

    /**
     * Скроллит до указанного объекта.
     * Метод останавливается после нахождения указанного объекта или по истечению {@link TestsUtility#COUNT_SCROLL_DEFAULT} попыток.
     * Если метод не нашел указанный элемент за отведенное число попыток, тест будет провален с соответствующей ошибкой.
     *
     * @param scrollableArea Прокручиваемая область.
     * @param mobileItem     Элемент, который нужно найти.
     * @param startFromTop   {@code true} - если необходимо начать поиск от верхней границы прокручиваемой области,
     *                       в противном случае - {@code false}.
     */
    public void scrollToItem(MobileItem scrollableArea, MobileItem mobileItem, boolean startFromTop) {
        boolean isItemFound = isExist(mobileItem);
        boolean isEdgeReached = false;
        int attempts = 0;
        if (!isItemFound && startFromTop) {
            scrollToTop(scrollableArea);
        }

        isItemFound = isExist(mobileItem);
        while (!isItemFound && !isEdgeReached && attempts < TestsUtility.COUNT_SCROLL_DEFAULT) {
            isEdgeReached = swipeWithEdgeCheck(scrollableArea, ScrollDirection.DOWN);
            isItemFound = isExist(mobileItem);
            if (isItemFound) break;
            attempts++;
        }

        Assert.assertTrue(isItemFound, "Элемент '" + mobileItem.name + "' не найден за "
                + TestsUtility.COUNT_SCROLL_DEFAULT + " попыток." + "\n Название экрана: " + mobileItem.screen
                + "\n Локатор (" + mobileItem.locatorType + "): " + mobileItem.locator);
    }

    /**
     * Выполняет вертикальный единичный свайп исходя из координат в процентном соотношении экрана.
     * Координаты рассчитываются исходя из высоты экрана.
     * Пример: startY=0.8, endY=0.2
     * - будет выполнен свайп снизу вверх
     * - в начальной точке от верхнего края отступили 80% высоты текущего экрана
     * - в конечной точке от верхнего края экрана отступили 20% высоты текущего экрана
     *
     * @param startY     Процент от верхней части экрана для начальной точки свайпа. Значения от 0 до 1.
     * @param endY       Процент от верхней части экрана для конечной точки свайпа. Значения от 0 до 1.
     * @param swipeSpeed Значение в миллисекундах. Время за которое должен произойти свайп. Чем меньше значение тем быстрее скролл.
     */
    public void swipeScreenByCoordinates(double startY, double endY, long swipeSpeed) {
        int startPoint = (int) (iosDriver.manage().window().getSize().height * startY); // Точка начала свайпа.

        int endPoint = (int) (iosDriver.manage().window().getSize().height * endY); // Точка конца свайпа.
        int width = iosDriver.manage().window().getSize().width; // Ширина дисплея.
        new TouchAction<>(iosDriver)
                .press(point((int) (width * 0.5), startPoint))
                .waitAction(waitOptions(ofMillis(swipeSpeed)))
                .moveTo(point(width, endPoint))
                .release().perform();
    }

    /**
     * Выполняет единичный свайп по относительным координатам в границах {@param scrollableArea}.
     * Координаты свайпа рассчитываются исходя из высоты и расположения {@param scrollableArea} на экране.
     * <p>
     * Например: {@code start}=0.8, {@code end}=0.2, {@code isVertical}=true.
     * - будет выполнен свайп снизу вверх
     * - в начальной точке от верхнего края {@code scrollableArea} отступили 80%.
     * - в конечной точке от верхнего края {@code scrollableArea} отступили 20%.
     *
     * @param scrollableArea Элемент экрана в границах которого происходит свайп.
     * @param isVertical     {@code true} - если необходим свайп по горизонтали экрана, в противном случае - {@code false}.
     * @param start          Начальная точка свайпа относительно {@code scrollableArea}. Значение должно быть от 0 до 1.
     * @param end            Конечная точка свайпа относительно {@code scrollableArea}. Значение должно быть от 0 до 1.
     * @param swipeSpeed     Значение в миллисекундах. Время за которое должен произойти свайп. Чем меньше значение тем быстрее свайп.
     */
    public void swipeByCoordinates(MobileItem scrollableArea, boolean isVertical, double start, double end, long swipeSpeed) {
        MobileElement element = getElement(scrollableArea);
        int startPoint;
        int endPoint;
        TouchAction<?> touchAction = new TouchAction<>(appiumDriver);
        if (isVertical) {
            int width = (int) (element.getRect().width * 0.5); // Ширина.
            startPoint = (int) (element.getLocation().getY() + element.getRect().height * start); // Точка начала свайпа.
            endPoint = (int) (element.getLocation().getY() + element.getRect().height * end); // Точка конца свайпа.
            touchAction
                    .press(point(width, startPoint))
                    .waitAction(waitOptions(ofMillis(swipeSpeed)))
                    .moveTo(point(width, endPoint))
                    .release().perform();
        } else {
            int height = (int) (element.getRect().height * 0.5); // Высота.
            startPoint = (int) (element.getLocation().getX() + element.getRect().width * start); // Точка начала свайпа.
            endPoint = (int) (element.getLocation().getX() + element.getRect().width * end); // Точка конца свайпа.
            touchAction
                    .press(point(startPoint, height))
                    .waitAction(waitOptions(ofMillis(swipeSpeed)))
                    .moveTo(point(endPoint, height))
                    .release().perform();
        }
    }

    /**
     * Выполняет нажатие на системную кнопку 'Назад'.
     */
    public void tapSystemBack() {
        logger.info("Возврат на предыдущий экран системной кнопкой 'Назад'.");
        iosDriver.navigate().back();
    }

    public void pressBackSpaceButton(MobileItem field) {
        logger.info("Press Backspace button on device keyboard");
        MobileElement inputField = getElement(field);
        inputField.sendKeys("\b");

    }

    private void swipeTo(MobileItem scrollableArea, ScrollDirection direction) {
        MobileElement area = getElement(scrollableArea);
        HashMap<String, Serializable> swipe = new HashMap<>();
        swipe.put("elementId", area.getId());
        swipe.put("direction", direction.toString());
        swipe.put("percent", 0.90);
        swipe.put("speed", 1500);
        iosDriver.executeScript("mobile: swipeGesture", swipe);
    }

    private boolean swipeWithEdgeCheck(MobileItem scrollableArea, ScrollDirection direction) {
        boolean isEdgeReached = false;
        String xpath = "(//android.widget.FrameLayout[1] | //android.widget.TextView[1])[1]";

        MobileElement el = getElement(scrollableArea).findElementByXPath(xpath);
        int firstCoordinateBeforeSwipe = (el.getRect().height + el.getRect().x) / 2;
        swipeTo(scrollableArea, direction);

        el = getElement(scrollableArea).findElementByXPath(xpath);
        int firstCoordinateAfterSwipe = (el.getRect().height + el.getRect().x) / 2;
        if (firstCoordinateBeforeSwipe == firstCoordinateAfterSwipe) isEdgeReached = true;

        return isEdgeReached;
    }

    private boolean swipeWithEdgeCheck(MobileItem scrollableArea, boolean isVertical, double start, double end, int swipeSpeed) {
        boolean isEdgeReached = false;
        String xpath = "(//android.widget.FrameLayout[1] | //android.widget.TextView[1])[1]";

        MobileElement el = getElement(scrollableArea).findElementByXPath(xpath);
        int firstCoordinateBeforeSwipe = (el.getRect().height + el.getRect().x) / 2;

        swipeByCoordinates(scrollableArea, isVertical, start, end, swipeSpeed);

        el = getElement(scrollableArea).findElementByXPath(xpath);
        int firstCoordinateAfterSwipe = (el.getRect().height + el.getRect().x) / 2;

        if (firstCoordinateBeforeSwipe == firstCoordinateAfterSwipe) isEdgeReached = true;

        return isEdgeReached;
    }

    /**
     * Get element attribute and check that it's match expected value.
     */
    public void checkValueOfElementAttribute(MobileItem element, String attribute, String expectedValue) {
        MobileElement fieldElement = getElement(element);
        String elementAttributeValue = fieldElement.getAttribute(attribute);
        logger.info(elementAttributeValue);
        assert elementAttributeValue.matches(expectedValue);
    }

    /**
     * Check that element is selected. not working now
     */
    public void checkElementIsSelected(MobileItem element) {
        MobileElement fieldElement = getElement(element);
        boolean elementIsSelected = fieldElement.isSelected();
        assert elementIsSelected;
        logger.info("check that element is selected");
    }


    /**
     * Проверяет что элемент в фокусе
     */
    public void checkElementInFocus(MobileItem element) {
        MobileElement focusedElement = getElement(element);
        logger.info("element in focus");
        assert focusedElement.equals(iosDriver.switchTo().activeElement());
    }

    /**
     * Проверяет что элемент не в фокусе. Не работает! Исправить
     */
    public void checkElementNotInFocus(MobileItem element) {
        MobileElement focusedElement = getElement((MobileItem) iosDriver.switchTo().activeElement());
        MobileElement notFocusedElement = getElement(element);
        logger.info("element not in focus");
        Assert.assertNotEquals(notFocusedElement, focusedElement);
    }

}
