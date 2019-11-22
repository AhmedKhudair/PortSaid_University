package com.ahmed.salah.portsaiduniversity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by Ahmed on 3/14/2018.
 */

public class Rss_Reader extends AsyncTask<Void,Void,Void> {




    String address = "http://psu.edu.eg/all-news?format=feed&type=rss";
    Context context;
    List<FeedItem> feedItems;
    ProgressDialog progressDialog;
    URL url;
    RecyclerView recyclerView;


    public Rss_Reader(Context context, RecyclerView recyclerView) {
        this.context = context;
        this.recyclerView = recyclerView;
        this.progressDialog = new ProgressDialog(context);
        this.progressDialog.setMessage("جاري التحميل");
        this.progressDialog.setCanceledOnTouchOutside(false);

    }

    @Override
    protected void onPreExecute() {
        progressDialog.show();
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        progressDialog.dismiss();
        MyAdapter Adapter = new MyAdapter(context,feedItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(Adapter);
        Toast.makeText(context,"Done",Toast.LENGTH_LONG).show();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        processXml(Getdata());
        return null;
    }




    private void processXml(Document data) {
        if (data != null) {
            this.feedItems = new ArrayList();
            NodeList itemes = data.getDocumentElement().getChildNodes().item(1).getChildNodes();
            for (int i = 0; i < itemes.getLength(); i++) {
                Node cureentchild = itemes.item(i);
                if (cureentchild.getNodeName().equalsIgnoreCase("item")) {
                    FeedItem item = new FeedItem();
                    NodeList itemchilds = cureentchild.getChildNodes();
                    for (int j = 0; j < itemchilds.getLength(); j++) {
                        Node cureent = itemchilds.item(j);
                        if (cureent.getNodeName().equalsIgnoreCase("title")) {
                            item.setTitle(cureent.getTextContent());
                        } else if (cureent.getNodeName().equalsIgnoreCase("pubDate")) {
                            item.setPubDate(cureent.getTextContent());

                        } else if (cureent.getNodeName().equalsIgnoreCase("link")) {
                            item.setLink(cureent.getTextContent());
                        }
                    }
                    this.feedItems.add(item);


                }
            }
            {

                NodeList itemess=data.getDocumentElement().getChildNodes().item(1).getChildNodes();
            }

        }

    }


    public Document Getdata(){
        try {
            this.url = new URL(this.address);
            HttpURLConnection connection = (HttpURLConnection) this.url.openConnection();
            connection.setRequestMethod("GET");
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(connection.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }






}
