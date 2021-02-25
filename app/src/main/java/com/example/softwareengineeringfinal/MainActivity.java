package com.example.softwareengineeringfinal;


<<<<<<< HEAD
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;
=======
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;
>>>>>>> main


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

<<<<<<< HEAD
public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    NavigationView navigationView;
=======
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //initialize global variables
    DrawerLayout drawerLayout;

>>>>>>> main

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        drawerLayout= findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.Open, R.string.Close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id= menuItem.getItemId();
                Fragment fragment = null;
                switch(id)
                {
                    case R.id.firstOption:
                        //fragment = new SearchFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.secondOption:
                        //fragment = new BasketFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.thirdOption:
                        //fragment = new PromoCodeFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.fourthOption:
                       // fragment = new OrderFragment();
                        loadFragment(fragment);
                        break;
                    case R.id.fifthOption:
                        //fragment = new PromoFragment();
                        loadFragment(fragment);
                        break;
                    default:
                        return true;
                }
                return true;
            }
        });



    }
    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment).commit();
        drawerLayout.closeDrawer(GravityCompat.START);
        fragmentTransaction.addToBackStack(null);
=======
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view){
        //open drawer
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout){
        //open drawer layout
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void ClickLogo(View view)
    {
        //closeDrawer
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout){
        //close drawer layout
        //check if they click anywhere
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            //if drawer is open, close it
            drawerLayout.closeDrawer(GravityCompat.START);
        }

    }

    public void ClickHome(View view){
        //recreate the activity
        recreate();
    }
    public void ClickList(View view){
        //logout
        redirectActivity(this, ListActivity.class);
    }
    public void ClickShop(View view){
        //logout
        redirectActivity(this, ShopActivity.class);
    }


    public void ClickDashboard(View view){
        //redirect to dashboard activity
        redirectActivity(this,DashboardActivity.class );
    }

    public void ClickAboutUs(View view){
        //go to our about us page
        redirectActivity(this,AboutUsActivity.class );
    }
    public void ClickLogout(View view){
        //logout
        logout(this);
    }
    public static void logout (Activity activity){
        //initialize the alert dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        //set title
        builder.setTitle("Logout");
        // set message
        builder.setMessage("Are you sure you want to logout?");
        //positive yes
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish activity
                activity.finishAffinity();
                //exit the application
               System.exit(0);
            }
        });
        //negative no button
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //dismiss the logout dialog
                dialog.dismiss();

            }
        });

        //show dialog
        builder.show();
    }


    public static void redirectActivity(Activity activity, Class aClass){
        //initialize our intent
    Intent intent = new Intent(activity, aClass);

    //set a flag
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //start the activity
        activity.startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //close the drawer
        closeDrawer(drawerLayout);
>>>>>>> main
    }
}
