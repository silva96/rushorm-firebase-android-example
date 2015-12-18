package com.silva.benjamin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import co.uk.rushorm.core.RushCore;
import co.uk.rushorm.core.RushSearch;

public class MainActivity extends AppCompatActivity {

    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(MainActivity.this);
        mRootRef =  new Firebase("https://testsugarorm.firebaseio.com");
        Firebase userRef = mRootRef.child("users").child("asd23");
        ValueEventListener listener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                asd(snapshot);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        };
        userRef.addListenerForSingleValueEvent(listener);
    }
    public void asd(DataSnapshot snapshot){
        User user = snapshot.getValue(User.class);
        user.save();
        User test = new RushSearch().whereId(user.getId()).findSingle(User.class);
        Log.d("TEST", "User id: " + test.getId());
        Log.d("TEST", "User username: " + test.getUsername());
        for(Skill s : test.getSkills()){
            Log.d("TEST", "Skill id: " + s.getId());
            Log.d("TEST", "Skill name: " + s.getName());
        }
    }
}
