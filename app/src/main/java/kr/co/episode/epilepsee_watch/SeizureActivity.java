package kr.co.episode.epilepsee_watch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import kr.co.episode.epilepsee_watch.databinding.ActivitySeizureBinding;

public class SeizureActivity extends Activity {

    private TextView mTextView;
    private ActivitySeizureBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySeizureBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}