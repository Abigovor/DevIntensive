package com.softdesign.devintensive.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.softdesign.devintensive.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    /**
     * метод вызывается при создании активити (после изменения конфигурации/ возврата к текущей
     * активности после уничтожения)
     * <p/>
     * в данном методе инициализируются/производиться:
     * - UI пользовательский интерфейс (статика)
     * - Инициализация статических данных активности
     * - связь данных со списками (инициализация адаптеров)
     * <p/>
     * Не запускать длительные операции при работе с данными в  onCreate()
     *
     * @param savedInstanceState -объект со значениями, сохранеными в Bundle- состояние UI
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        if (savedInstanceState == null) {
            // активити запускается впервые
        } else {
            //активити уже запускалось
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
