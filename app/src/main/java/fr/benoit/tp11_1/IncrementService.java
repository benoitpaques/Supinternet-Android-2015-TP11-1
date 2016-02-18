package fr.benoit.tp11_1;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by benoit on 08/02/2016.
 */
public class IncrementService extends Service {

    private static int counter = 0;

    IBinder mBinder = new IncrementBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public class IncrementBinder extends Binder {

        public int getIncrement() {
            return ++counter;
        }
    }
}
