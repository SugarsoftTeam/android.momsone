package com.example.android.momsone.iOneHome;



import com.example.android.momsone.R;
import com.example.android.momsone.inc.Footer;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;

// �⼮��Ȳ - �Ἦüũ
public class absence  extends Activity {

    private ListView listview;
    Footer footer;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.list);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.header2);
        
        TextView tvText = (TextView)findViewById(R.id.sub_header_text);
        tvText.setText("결석체크");    
        
        footer = (Footer) findViewById(R.id.layoutFooter);
        footer.setActivity(this);
        
    }
	
}
