package drz.oddb;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Arrays;

import drz.oddb.Memory.*;
import drz.oddb.Transaction.SystemTable.BiPointerTable;
import drz.oddb.Transaction.SystemTable.ClassTable;
import drz.oddb.Transaction.SystemTable.ClassTableItem;
import drz.oddb.Transaction.SystemTable.DeputyTable;
import drz.oddb.Transaction.SystemTable.ObjectTable;
import drz.oddb.Transaction.SystemTable.SwitchingTable;
import drz.oddb.Transaction.TransAction;



public class TravelActivity extends AppCompatActivity {

    public static String[][] data=new String[4][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        Button mapButton=findViewById(R.id.button_map);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i <= 4; i++) {
                    System.out.println(Arrays.deepToString(data[i]));
                }

                //TODO: 此处进行地图展示动作
            }
        });



    }
}