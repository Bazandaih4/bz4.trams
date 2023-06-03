package com.example.bz4trams;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textViewLineName;
    private ImageView imageViewLine;
    private ListView listViewStations;

    private List<Line> lineList;
    private Line currentLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewLineName = findViewById(R.id.textViewLineName);
        imageViewLine = findViewById(R.id.imageViewLine);
        listViewStations = findViewById(R.id.listViewStations);

// Создание списка линий
        lineList = new ArrayList<>();



        List<String> stationList = new ArrayList<>();
        stationList.add("1 Микрорайон Чистая Слобода");
        stationList.add("2 Облачная");
        stationList.add("3 пос. Южный");
        stationList.add("4 Бийская");
        stationList.add("5 Танкистов");
        stationList.add("6 Парашютная");
        stationList.add("7 Широкий пер.");
        stationList.add("8 Пермская");
        stationList.add("9 Клуб им. Чехова");
        stationList.add("10 Степная (трамвай)");
        stationList.add("11 Квартал 'Софийский'");
        stationList.add("12 Районная");
        stationList.add("13 Станиславского");
        stationList.add("14 Костычева");
        stationList.add("15 Римского-Корсакова (трамвай)");
        stationList.add("16 Дом радио");
        stationList.add("17 Вертковская (ул. Сибиряков-Гвардейцев)");
        stationList.add("18 Покрышкина");
        stationList.add("19 Метро Площадь Маркса");


        List<String> intersectingLines = new ArrayList<>();
        intersectingLines.add("3");
        intersectingLines.add("8");
        intersectingLines.add("10");
        intersectingLines.add("15");
        intersectingLines.add("16");
        intersectingLines.add("18");

        Line line2 = new Line(2, "2 линия", stationList, intersectingLines);
        List<String> stationList3 = new ArrayList<>();
        stationList3.add("1 Молкомбинат");
        stationList3.add("2 Сибирский грузовой терминал");
        stationList3.add("3 Завод ЖБИ-1");
        stationList3.add("4 Сибэлектротерм");
        stationList3.add("5 Палласа");
        stationList3.add("6 Транспортная");
        stationList3.add("7 ЭЛСИБ");
        stationList3.add("8 Индустриальная");
        stationList3.add("9 Торговый Город Левобережный");
        stationList3.add("10 пл. Сибиряков-Гвардейцев");
        stationList3.add("11 Покрышкина");
        stationList3.add("12 Метро Площадь Маркса");


        List<String> intersectingLines3 = new ArrayList<>();
        intersectingLines3.add("10");
        intersectingLines3.add("15");
        intersectingLines3.add("18");
        intersectingLines3.add("2");
        intersectingLines3.add("16");

        Line line3 = new Line(3, "3 линия", stationList3, intersectingLines3);

        List<String> stationList8 = new ArrayList<>();
        stationList8.add("1 Микрорайон Чистая Слобода");
        stationList8.add("2 Облачная");
        stationList8.add("3 пос. Южный");
        stationList8.add("4 Бийская");
        stationList8.add("5 Танкистов");
        stationList8.add("6 Парашютная");
        stationList8.add("7 Широкий пер.");
        stationList8.add("8 Пермская");
        stationList8.add("9 Клуб им. Чехова");
        stationList8.add("10 Плахотного");
        stationList8.add("11 Ленинский ЗАГС");
        stationList8.add("12 Вокзал Новосибирск-западный");
        stationList8.add("13 ГПТУ-50");
        stationList8.add("14 ДК Металлург");
        stationList8.add("15 Тепличная");
        stationList8.add("16 Зональный институт");
        stationList8.add("17 Блюхера");
        stationList8.add("18 Метро Студенческая (трамвай)");
        stationList8.add("19 Космическая");
        stationList8.add("20 Магазин Телевизоры");
        stationList8.add("21 Титова");


        List<String> intersectingLines8 = new ArrayList<>();
        intersectingLines8.add("2");
        intersectingLines8.add("10");
        intersectingLines8.add("18");
        intersectingLines8.add("15");

        Line line8 = new Line(8, "8 линия", stationList8, intersectingLines8);

        List<String> stationList10 = new ArrayList<>();
        stationList10.add("1 Бугринская роща (трамвай)");
        stationList10.add("2 Оловозаводская");
        stationList10.add("3 Тюменская");
        stationList10.add("4 Промышленная");
        stationList10.add("5 Посуда Центр");
        stationList10.add("6 Рабочая");
        stationList10.add("7 Прокатная");
        stationList10.add("8 Строительная (ул. Мира)");
        stationList10.add("9 Мира");
        stationList10.add("10 пл. Сибиряков-Гвардейцев");
        stationList10.add("11 Вертковская (ул. Сибиряков-Гвардейцев)");
        stationList10.add("12 Дом радио");
        stationList10.add("13 Римского-Корсакова (трамвай)");
        stationList10.add("14 Серафимовича");
        stationList10.add("15 Костычева");
        stationList10.add("16 Станиславского");
        stationList10.add("17 Районная");
        stationList10.add("18 Квартал \"Софийский\"");
        stationList10.add("19 ж/м Станиславский (трамвай)");
        stationList10.add("20 Кирзавод");
        stationList10.add("21 Автокомбинат");
        stationList10.add("22 9 Гвардейской дивизии");
        stationList10.add("23 Волховская");
        stationList10.add("24 ЖК Радуга");
        stationList10.add("25 Оборонная");
        stationList10.add("26 Связистов");
        stationList10.add("27 ж/м Танкистов");
        stationList10.add("28 Озёрная (ул. Связистов)");
        stationList10.add("29 ж/м Троллейный (трамвай)");
        stationList10.add("30 Невельского");
        stationList10.add("31 Широкая");
        stationList10.add("32 Киевская");
        stationList10.add("33 Хлебозавод");
        stationList10.add("34 Ленинский ЗАГС");
        stationList10.add("35 Плахотного");
        stationList10.add("36 Клуб им. Чехова");
        stationList10.add("37 Степная (трамвай)");

        List<String> intersectingLines10 = new ArrayList<>();
        intersectingLines10.add("8");
        intersectingLines10.add("2");
        intersectingLines10.add("18");
        intersectingLines10.add("15");
        intersectingLines10.add("16");

        Line line10 = new Line(10, "10 линия", stationList10, intersectingLines10);

        List<String> stationList15 = new ArrayList<>();
        stationList15.add("1 ж/м Юго-Западный");
        stationList15.add("2 Школа №174");
        stationList15.add("3 Волховская");
        stationList15.add("4 9 Гвардейской дивизии");
        stationList15.add("5 Автокомбинат");
        stationList15.add("6 Кирзавод");
        stationList15.add("7 ж/м Станиславский (трамвай)");
        stationList15.add("8 Квартал \"Софийский\"");
        stationList15.add("9 Степная (трамвай)");
        stationList15.add("10 Клуб им. Чехова");
        stationList15.add("11 Плахотного");
        stationList15.add("12 Ленинский ЗАГС");
        stationList15.add("13 Вокзал Новосибирск-западный");
        stationList15.add("14 ГПТУ-50");
        stationList15.add("15 ДК Металлург");
        stationList15.add("16 Тепличная");
        stationList15.add("17 Зональный институт");
        stationList15.add("18 Блюхера");
        stationList15.add("19 Метро Студенческая (трамвай)");
        stationList15.add("20 Космическая");
        stationList15.add("21 Магазин Телевизоры");
        stationList15.add("22 Титова");
        stationList15.add("23 Метро Площадь Маркса");
        stationList15.add("24 Покрышкина");
        stationList15.add("25 пл. Сибиряков-Гвардейцев");
        stationList15.add("26 Мира");
        stationList15.add("27 Строительная (ул. Мира)");
        stationList15.add("28 Прокатная");
        stationList15.add("29 Рабочая");
        stationList15.add("30 Посуда Центр");
        stationList15.add("31 Промышленная");
        stationList15.add("32Тюменская");
        stationList15.add("33 Оловозаводская");
        stationList15.add("34 Бугринская роща (трамвай)");

        List<String> intersectingLines15 = new ArrayList<>();
        intersectingLines15.add("18");
        intersectingLines15.add("16");
        intersectingLines15.add("2");
        intersectingLines15.add("8");
        intersectingLines15.add("3");
        intersectingLines15.add("10");

        Line line15 = new Line(15, "15 линия", stationList15, intersectingLines15);

        List<String> stationList16 = new ArrayList<>();
        stationList16.add("1 ж/м Юго-Западный");
        stationList16.add("2 Школа №174");
        stationList16.add("3 Волховская");
        stationList16.add("4 9 Гвардейской дивизии");
        stationList16.add("5 Автокомбинат");
        stationList16.add("6 Кирзавод");
        stationList16.add("7 ж/м Станиславский (трамвай)");
        stationList16.add("8 Квартал \"Софийский\"");
        stationList16.add("9 Районная");
        stationList16.add("10 Станиславского");
        stationList16.add("11 Костычева");
        stationList16.add("12 Римского-Корсакова (трамвай)");
        stationList16.add("13 Дом радио");
        stationList16.add("14 Вертковская (ул. Сибиряков-Гвардейцев)");
        stationList16.add("15 Покрышкина");
        stationList16.add("16 Метро Площадь Маркса");

        List<String> intersectingLines16 = new ArrayList<>();
        intersectingLines16.add("18");
        intersectingLines16.add("15");
        intersectingLines16.add("10");
        intersectingLines16.add("2");
        intersectingLines16.add("3");
        intersectingLines16.add("15");

        Line line16 = new Line(16, "16 линия", stationList16, intersectingLines16);

        List<String> stationList18 = new ArrayList<>();
        stationList18.add("1 ж/м Юго-Западный");
        stationList18.add("2 Школа №174");
        stationList18.add("3 ЖК Радуга");
        stationList18.add("4 Оборонная");
        stationList18.add("5 Связистов");
        stationList18.add("6 ж/м Танкистов");
        stationList18.add("7 Озёрная (ул. Связистов)");
        stationList18.add("8 ж/м Троллейный (трамвай)");
        stationList18.add("9 Невельского");
        stationList18.add("10 Широкая");
        stationList18.add("11 Киевская");
        stationList18.add("12 Хлебозавод");
        stationList18.add("13 Вокзал Новосибирск-западный");
        stationList18.add("14 ГПТУ-50");
        stationList18.add("15 ДК Металлург");
        stationList18.add("16 Тепличная");
        stationList18.add("17 Зональный институт");
        stationList18.add("18 Блюхера");
        stationList18.add("19 Метро Студенческая (трамвай)");
        stationList18.add("20 Космическая");
        stationList18.add("21 Магазин Телевизоры");
        stationList18.add("22 Титова");
        stationList18.add("23 Метро Площадь Маркса");
        stationList18.add("24 Покрышкина");
        stationList18.add("25 пл. Сибиряков-Гвардейцев");
        stationList18.add("26 Торговый Город Левобережный");
        stationList18.add("27 Индустриальная");
        stationList18.add("28 пл. Кирова");
        stationList18.add("29 Бульвар");
        stationList18.add("30 Кировский универмаг");
        stationList18.add("31 Весенняя");
        stationList18.add("32 Петухова");
        stationList18.add("33 пос. Чемской");

        List<String> intersectingLines18 = new ArrayList<>();
        intersectingLines18.add("15");
        intersectingLines18.add("16");
        intersectingLines18.add("2");
        intersectingLines18.add("8");
        intersectingLines18.add("10");
        intersectingLines18.add("3");

        Line line18 = new Line(18, "18 линия", stationList18, intersectingLines18);

        lineList.add(line2);
        lineList.add(line3);
        lineList.add(line8);
        lineList.add(line10);
        lineList.add(line15);
        lineList.add(line16);
        lineList.add(line18);

        currentLine = line2;


        // Получение данных о начальной линии
        String lineName = currentLine.getName();
        int lineImageResourceId = getResources().getIdentifier("lane" + currentLine.getLineNumber(), "drawable", getPackageName());
        String[] stationList1 = currentLine.getStationList().toArray(new String[0]);



        // Получение ширины экрана
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenWidth = displayMetrics.widthPixels;

        // Вычисление высоты картинки
        int imageHeight = (int) (screenWidth / 1.65);

        // Назначение размеров картинке
        imageViewLine.getLayoutParams().width = screenWidth;
        imageViewLine.getLayoutParams().height = imageHeight;
        imageViewLine.setImageResource(lineImageResourceId);
        // Остальной код активности...

        ArrayAdapter<String> stationListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stationList1);
        listViewStations.setAdapter(stationListAdapter);



    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenWidth = displayMetrics.widthPixels;



        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                // Логика для обработки нажатия на экран

                float x = event.getX();
                float y = event.getY();

                if (x < screenWidth / 2) {
                    // Логика для обработки нажатия налево
                    switchToPreviousLine();
                } else {
                    // Логика для обработки нажатия направо
                    switchToNextLine();
                }
                break;
        }
        return true;
    }

    private void switchToNextLine() {
        int currentIndex = lineList.indexOf(currentLine);
        int nextIndex = (currentIndex + 1) % lineList.size();
        currentLine = lineList.get(nextIndex);



        updateUI();
    }

    private void switchToPreviousLine() {
        int currentIndex = lineList.indexOf(currentLine);
        int previousIndex = (currentIndex - 1 + lineList.size()) % lineList.size();
        currentLine = lineList.get(previousIndex);

        updateUI();
    }

    private void updateUI() {
        // Обновление информации о текущей линии
        String lineName = currentLine.getName();
        int lineImageResourceId = getResources().getIdentifier("lane" + currentLine.getLineNumber(), "drawable", getPackageName());
        String[] stationList = currentLine.getStationList().toArray(new String[0]);

        // Установка данных на экран
        textViewLineName.setText(lineName);
        imageViewLine.setImageResource(lineImageResourceId);

        // Обновление списка станций
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stationList);
        listViewStations.setAdapter(adapter);
    }
}