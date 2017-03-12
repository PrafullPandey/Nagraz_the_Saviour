package p2_vaio.signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth firebaseAuth;
    private TextView tv;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        firebaseAuth= FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() ==null)
        {
            //start profile activity
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        }
        FirebaseUser user  = firebaseAuth.getCurrentUser();
       // tv=(TextView)findViewById(R.id.email);
        //logout= (Button)findViewById(R.id.logout);

        tv.setText("Welcome "+user.getEmail());

        logout.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view==logout)
        {
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this , LoginActivity.class));

        }

    }
}
