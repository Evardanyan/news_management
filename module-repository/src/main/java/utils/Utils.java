package utils;

//package com.mjc.school.repository.utils;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Utils
{
    private Utils() {
    }

    public static String getRandomContentByFilePath(final String fileName) {
        final Random r = new Random();
        final int numLines = 30;
        try {
            final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            final InputStream inputStream = classLoader.getResourceAsStream(fileName);
            final InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            final BufferedReader reader = new BufferedReader(streamReader);
            String resultLine;
            for (int desiredLine = r.nextInt(numLines), lineCtr = 0; (resultLine = reader.readLine()) != null && lineCtr != desiredLine; ++lineCtr) {}
            return resultLine;
        }
        catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static LocalDateTime getRandomDate() {
        final Random random = new Random();
        final int endDay = 30;
        final LocalDate day = LocalDate.now().plusDays(random.nextInt(endDay));
        final int hour = random.nextInt(24);
        final int minute = random.nextInt(60);
        final int second = random.nextInt(60);
        final LocalTime time = LocalTime.of(hour, minute, second);
        return LocalDateTime.of(day, time);
    }
}
