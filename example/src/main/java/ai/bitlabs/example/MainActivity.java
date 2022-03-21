package ai.bitlabs.example;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

import ai.bitlabs.sdk.BitLabs;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "Example";

    BitLabs bitLabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 21.03.22 Change to "YOUR_APP_TOKEN"
        bitLabs = new BitLabs("46d31e1e-315a-4b52-b0de-eca6062163af", "Test-User");

        bitLabs.hasSurveys(hasSurveys -> Log.i(TAG, hasSurveys != null ? hasSurveys.toString() : "NULL -  Check BitLabs Logs"));

        // optionally add custom tags to your users
        Map<String, Object> tags = new HashMap<>();
        tags.put("my_tag", "new_user");
        tags.put("is_premium", true);
        bitLabs.setTags(tags);

        // Get client-side callbacks to reward the user (We highly recommend using server-to-server callbacks!)
        bitLabs.setOnRewardListener(payout -> Log.i("BitLabs", "BitLabs payout of: " + payout));

        findViewById(R.id.open).setOnClickListener(view -> bitLabs.launchOfferWall(this));
    }
}
