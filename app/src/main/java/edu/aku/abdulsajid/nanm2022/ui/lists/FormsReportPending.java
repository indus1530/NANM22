package edu.aku.abdulsajid.nanm2022.ui.lists;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import edu.aku.abdulsajid.nanm2022.R;
import edu.aku.abdulsajid.nanm2022.adapters.FormsAdapter;
import edu.aku.abdulsajid.nanm2022.core.MainApp;
import edu.aku.abdulsajid.nanm2022.database.DatabaseHelper;
import edu.aku.abdulsajid.nanm2022.databinding.ActivityFormsReportBinding;
import edu.aku.abdulsajid.nanm2022.models.Forms;
import edu.aku.abdulsajid.nanm2022.room.NANMRoomDatabase;

public class FormsReportPending extends AppCompatActivity {
    NANMRoomDatabase db;
    List<Forms> fc;
    String sysdateToday = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    ActivityFormsReportBinding bi;
    private RecyclerView.Adapter formsAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_forms_report);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        bi.fcRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        bi.fcRecyclerView.setLayoutManager(layoutManager);
        bi.filter.setVisibility(View.GONE);
        db = MainApp.appInfo.dbHelper;
        //fc = db.getPendingForms();
        fc = db.formsDao().getPendingForms();

        // specify an adapter (see also next example)
        formsAdapter = new FormsAdapter(fc, this);
        bi.fcRecyclerView.setAdapter(formsAdapter);
    }

    public void filterForms(View view) {

    }

/*    public void filterForms(View view) {
        Toast.makeText(this, "updated", Toast.LENGTH_SHORT).show();
        fc = db.getTodayForms(bi.dtFilter.getText().toString());
        formsAdapter = new FormsAdapter((List<Form>) fc, this);
        formsAdapter.notifyDataSetChanged();
        bi.fcRecyclerView.setAdapter(formsAdapter);

    }*/
}