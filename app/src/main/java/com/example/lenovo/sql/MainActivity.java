package com.example.lenovo.sql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name,phoneNo;
Button save;
String saveName,savePhoneNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name =(EditText)findViewById(R.id.name);
        phoneNo =(EditText)findViewById(R.id.phoneNo);
        save = (Button)findViewById(R.id.save);

        saveName=name.getText().toString();
        savePhoneNo =phoneNo.getText().toString();

        final Databasehandler database=new Databasehandler(this);
        Toast.makeText(this, "Inserting", Toast.LENGTH_SHORT).show();

save.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        database.addContact(new contacts(saveName+"",phoneNo+""));
    }
});
    }
}
