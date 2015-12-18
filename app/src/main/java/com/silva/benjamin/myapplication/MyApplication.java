package com.silva.benjamin.myapplication;

import android.app.Application;

import co.uk.rushorm.android.AndroidInitializeConfig;
import co.uk.rushorm.core.RushCore;

/**
 * Created by benjamin on 12/18/15.
 */
public class MyApplication extends Application{

        @Override
        public void onCreate() {
            super.onCreate();

            // Rush is initialized asynchronously to recieve a callback after it initialized
            // set an InitializeListener on the config object

            AndroidInitializeConfig config = new AndroidInitializeConfig(getApplicationContext());
            RushCore.initialize(config);
        }

}
