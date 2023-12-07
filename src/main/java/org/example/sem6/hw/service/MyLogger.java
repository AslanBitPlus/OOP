package org.example.sem6.hw.service;

import org.example.sem6.hw.model.CompNum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class MyLogger {

    public MyLogger() {
    }

    public String createMessage(String str) {
        String result = new String();
        result = str + " комплексных чисел";
        return result;
    }

    public void writeMessage(String msg, String cn1, String cn2, String cn3) {
        //
        // Создаем сообщение для записи в файл
        msg = msg + " комплексных чисел " +
                cn1 + " и "
                + cn2
                + " = "
                + cn3;
        System.out.println(msg);

        // Обработка исключений при записи в айл
        try {
            // Создаем объект File для файла, в который будем записывать приветствие
            File itogat = new File("itat.txt");

            // Создаем FileWriter для записи данных в файл
            FileWriter fwrt = new FileWriter(itogat);

            // Записываем в файл
            fwrt.write(msg);

            // Закрываем файл
            fwrt.close();


            // Логирование успешной записи
            Logger lgr = Logger.getLogger("MyLogger");
            FileHandler fhndlr = new FileHandler("mylog.log");
            lgr.addHandler(fhndlr);
            SimpleFormatter frmt = new SimpleFormatter();
            fhndlr.setFormatter(frmt);
            lgr.info(msg);
        } catch (Exception e) {
            // Логирование исключения
            Logger lgr = Logger.getLogger("MyLogger");
            FileHandler fhndlr = null;
            try {
                fhndlr = new FileHandler("mylog.log");
                lgr.addHandler(fhndlr);
                SimpleFormatter frmt = new SimpleFormatter();
                fhndlr.setFormatter(frmt);
                lgr.severe("Ошибка при записи в файл: " + e.getMessage());

            } catch (Exception ex) {
                // TODO: handle exception
                ex.printStackTrace();
            } finally {
                //
                if (fhndlr != null) fhndlr.close();
            }


        }

    }
}
