package ca.greyham.buildawall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectionActivity extends AppCompatActivity {

    //TODO: Query the server for the client ID of the MemberOC who is selecting
    //TODO: For that MOC, show the form committee fragment, and blank for the others
    //TODO: After the selection is made, send the results to the server with the chosen members
    //TODO: For other MOCs show the committee approval fragment, and blank for the leader
    //TODO: Show if the selection passed. If not, return to step one with the query
    //TODO: If passed then fire the intent to the vote activity
    //TODO: If failed five times, fire the intent to the main_activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }
}