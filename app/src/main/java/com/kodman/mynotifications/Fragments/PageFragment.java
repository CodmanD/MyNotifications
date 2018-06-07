package com.kodman.mynotifications.Fragments;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.kodman.mynotifications.R;
import com.prolificinteractive.materialcalendarview.CalendarDay;

import butterknife.BindView;
import butterknife.ButterKnife;
import codman.seminho.Model.AlarmEvent;
import codman.seminho.DataBase.DatabaseHelper;

public class PageFragment extends Fragment implements View.OnTouchListener {

    static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
    static final String ARGUMENT_ID = "ID";
    final Calendar calendar = Calendar.getInstance();
    int pageNumber;

    int themeNumber = 0;
    final String TAG = "Notifications";

    //Views
//    @BindView(R.id.etDay)
//    EditText etDay;
//    @BindView(R.id.etContent)
//    EditText etContent;
//    @BindView(R.id.etMonth)
//    EditText etMonth;
//    @BindView(R.id.etYear)
//    EditText etYear;
//    // @BindView(R.id.etAlarmName)
//    // EditText etAlarmName;
//    @BindView(R.id.etStartHours)
//    EditText etStartHours;
//    @BindView(R.id.etStartMin)
//    EditText etStartMin;
//    @BindView(R.id.etFinishHours)
//    EditText etFinishHours;
//    @BindView(R.id.etFinishMin)
//    EditText etFinishMin;
//
//    @BindView(R.id.spinnerCategories)
//    Spinner spinner;

 public   static PageFragment newInstance(int page) {
        PageFragment pageFragment = new PageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, page);
       // arguments.putLong(ARGUMENT_ID, id);
        pageFragment.setArguments(arguments);

        return pageFragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
       // SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
       // themeNumber = preferences.getInt(TAG + "theme", 0);
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
        //long id = getArguments().getLong(ARGUMENT_ID);


//        if (id >= 0) {
//            //  Log.d(TAG, "FRAGMENT onCreate ID = " + id);
//            ae = DatabaseHelper.getInstance(getContext()).select(id);
//        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_create_notification, null);

        ButterKnife.bind(this, view);
      //  final Calendar calendar = Calendar.getInstance();



        //categories = getResources().getStringArray(R.array.categories);

       // ArrayList<String> cats= DatabaseHelper.getInstance(getContext()).getCategories();



       // etDay.setOnTouchListener(this);
       // etMonth.setOnTouchListener(this);
       // etYear.setOnTouchListener(this);
       // etStartHours.setOnTouchListener(this);
       // etStartMin.setOnTouchListener(this);
       // etFinishHours.setOnTouchListener(this);
       // etFinishMin.setOnTouchListener(this);




        return view;
    }


    @Override
    public boolean onTouch(View view, MotionEvent event) {


        // event.
        if (event.getAction() == MotionEvent.ACTION_DOWN
                || event.getAction() == MotionEvent.ACTION_MOVE) return true;


//        switch (view.getId()) {
//            case R.id.etDay:
//            case R.id.etMonth:
//            case R.id.etYear:
//                isDialog = true;
//                DatePickerDialog DatePicker = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
//                    @Override
//                    public void onDateSet(android.widget.DatePicker DatePicker, int year, int month, int dayOfMonth) {
//
//                        calendar.set(Calendar.YEAR, year);
//                        calendar.set(Calendar.MONTH, month);
//                        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
//                        etDay.setText(String.valueOf(dayOfMonth));
//                        etMonth.setText(String.valueOf(month + 1));
//                        etYear.setText(String.valueOf(year));
//                        isDialog = false;
//                    }
//                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
//                DatePicker.setOnCancelListener(new DialogInterface.OnCancelListener() {
//                    @Override
//                    public void onCancel(DialogInterface dialog) {
//                        isDialog = false;
//                        dialog.cancel();
//                    }
//                });
//                DatePicker.show();
//
//                return true;
//
//            case R.id.etStartHours:
//            case R.id.etStartMin: {
//                isDialog = true;
//                TimePickerDialog TimePicker = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(android.widget.TimePicker timePicker, int hour, int minute) {
//                        calendar.set(Calendar.HOUR_OF_DAY, hour);
//                        calendar.set(Calendar.MINUTE, minute);
//                        etStartHours.setText(String.valueOf(hour));
//                        etStartMin.setText(String.valueOf(minute));
//                        isDialog = false;
//                    }
//                }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), DateFormat.is24HourFormat(getContext()));
//                TimePicker.setOnCancelListener(new DialogInterface.OnCancelListener() {
//                    @Override
//                    public void onCancel(DialogInterface dialog) {
//                        isDialog = false;
//                        dialog.cancel();
//                    }
//                });
//                TimePicker.show();
//                return true;
//            }
//
//            case R.id.etFinishHours:
//            case R.id.etFinishMin: {
//                isDialog = true;
//                TimePickerDialog TimePicker = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(android.widget.TimePicker timePicker, int hour, int minute) {
//                        calendar.set(Calendar.HOUR_OF_DAY, hour);
//                        calendar.set(Calendar.MINUTE, minute);
//                        etFinishHours.setText(String.valueOf(hour));
//                        etFinishMin.setText(String.valueOf(minute));
//                        isDialog = false;
//                    }
//                }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), DateFormat.is24HourFormat(getContext()));
//                TimePicker.setOnCancelListener(new DialogInterface.OnCancelListener() {
//                    @Override
//                    public void onCancel(DialogInterface dialog) {
//                        isDialog = false;
//                        dialog.cancel();
//                    }
//                });
//                TimePicker.show();
//                return true;
//            }
  //      }
        return true;
    }
}

