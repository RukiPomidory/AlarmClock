package freshwind.reliableclock;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    static MainActivity Instance;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Instance = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    public void showTimePickerDialog(View view)
    {
        DialogFragment picker = new TimePickerFragment();
        FragmentManager manager = getSupportFragmentManager();
        picker.show(manager,"time picker");
    }
}
