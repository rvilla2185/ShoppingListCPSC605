package com.example.softwareengineeringfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    private void openNewActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void ClickMenu(View view){
        //open drawer
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view)
    {
        //closeDrawer
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        //redirect activity to home
        MainActivity.redirectActivity(this, MainActivity.class);
    }
    public void ClickList(View view){


        //logout
        MainActivity.redirectActivity(this, NewListActivity.class);
    }
    public void ClickShop(View view){
        //logout
        MainActivity.redirectActivity(this, ShopActivity.class);
    }


    public void ClickDashboard(View view){
        //redirect to dashboard activity
       recreate();
    }

    public void ClickAboutUs(View view){
        //go to our about us page
        MainActivity.redirectActivity(this,AboutUsActivity.class );
    }
    public void ClickLogout(View view){
        //logout
        MainActivity.logout(this);
    }


    @Override
    protected void onPause() {
        super.onPause();
        //close the drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}