package com.ahmed.salah.portsaiduniversity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView appName;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    long time;
    android.support.v7.widget.Toolbar toolbar;


    public void onBackPressed() {
        if (this.time + 5000 > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            this.drawerLayout.openDrawer(this.navigationView);
        }
        this.time = System.currentTimeMillis();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);

        appName=(TextView)findViewById(R.id.appName);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/DroidKufi-Bold.ttf");
        appName.setTypeface(typeface);

        getSupportFragmentManager().beginTransaction().add(R.id.fram , new About_Uni(),"").commit();

        /////////////////////////////// Start  drawerLayout & navigationView ////////////////////////////////
        drawerLayout=(DrawerLayout)findViewById(R.id.draw);
        ////////////////Toggle//////////////////
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, this.drawerLayout, this.toolbar, R.string.app_name, R.string.app_name);
        this.drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        ////////////////end Toggle////////////////
        navigationView=(NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                drawerLayout.closeDrawers();
                if (item.getItemId()==R.id.news){

                    getSupportFragmentManager().beginTransaction().replace(R.id.fram,new Rss_Main()).commit();
                }
                if (item.getItemId()==R.id.about){

                    getSupportFragmentManager().beginTransaction().replace(R.id.fram, new About_Uni()).commit();

                }
                if (item.getItemId()==R.id.administrator){

                    getSupportFragmentManager().beginTransaction().replace(R.id.fram, new University_Administration()).commit();

                }
                if (item.getItemId()==R.id.address){

                    Intent map = new Intent("android.intent.action.VIEW");
                    map.setData(Uri.parse("geo:31.242295,32.3151271?z=16"));
                    MainActivity.this.startActivity(map);


                }
                if (item.getItemId()==R.id.examResult){

                    getSupportFragmentManager().beginTransaction().replace(R.id.fram,new Exam_Result()).commit();


                }
                if (item.getItemId()==R.id.modnGame3ia){

                    getSupportFragmentManager().beginTransaction().replace(R.id.fram,new University_Cities()).commit();

                }
                if (item.getItemId()==R.id.college){

                    getSupportFragmentManager().beginTransaction().replace(R.id.fram,new College()).commit();


                }
                if (item.getItemId()==R.id.aboutPro){

                    getSupportFragmentManager().beginTransaction().replace(R.id.fram,new About_App()).commit();

                }

                return false;
            }

        });

        /////////////////////////////// End  drawerLayout & navigationView ////////////////////////////////
    }


    /////////////////////////////// Start  Social Media Menu ////////////////////////////////

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.social_media,menu);
        MenuItem fb=menu.findItem(R.id.facebook);
        MenuItem tw=menu.findItem(R.id.twitter);
        MenuItem site=menu.findItem(R.id.site);
        fb.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/%D8%A7%D9%84%D8%B5%D9%81%D8%AD%D8%A9-%D8%A7%D9%84%D8%B1%D8%B3%D9%85%D9%8A%D8%A9-%D9%84%D8%AC%D8%A7%D9%85%D8%B9%D8%A9-%D8%A8%D9%88%D8%B1%D8%B3%D8%B9%D9%8A%D8%AF-197001686985928/?ref=nf")));
                return false;
            }
        });
        tw.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/PortSaidUniv")));
                return false;
            }
        });
        site.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.psu.edu.eg/")));
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


    /////////////////////////////// End  Social Media Menu ////////////////////////////////



}
