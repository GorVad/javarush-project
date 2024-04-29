package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        String finalAnswer = new String();

        Random random = new Random();
        int randomNumber = random.nextInt(8);
        switch (randomNumber){
            case (0):
                finalAnswer = MagicBall.CERTAIN;
                break;
            case (1):
                finalAnswer = MagicBall.DEFINITELY;
                break;
            case (2):
                finalAnswer = MagicBall.MOST_LIKELY;
                break;
            case (3):
                finalAnswer = MagicBall.OUTLOOK_GOOD;
                break;
            case (4):
                finalAnswer = MagicBall.ASK_AGAIN_LATER;
                break;
            case (5):
                finalAnswer = MagicBall.TRY_AGAIN;
                break;
            case (6):
                finalAnswer = MagicBall.NO;
                break;
            case (7):
                finalAnswer = MagicBall.VERY_DOUBTFUL;
                break;
            default:
                finalAnswer = null;
                break;
        }

        return finalAnswer;
    }
}
