package com.example.kwon_younghoon.o_cardnews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;


import java.util.ArrayList;

public class Main extends AppCompatActivity {
    private GridView gridView1;
    private GridView gridView2;
    private GridView gridView3;
    private GridView gridView4;
    private GridView gridView5;
    private LinearLayout showGrid;
    private ListView listView1;
    private ListView listView2;
    private ListView listView3;
    private ListView listView4;
    private ListView listView5;
    private LinearLayout showList;
    private ArrayList<CardData> cardArray1 = new ArrayList<CardData>();
    private ArrayList<CardData> cardArray2 = new ArrayList<CardData>();
    private ArrayList<CardData> cardArray3 = new ArrayList<CardData>();
    private ArrayList<CardData> cardArray4 = new ArrayList<CardData>();
    private ArrayList<CardData> cardArray5 = new ArrayList<CardData>();
    private ArrayList<CardlData> cardlDatas1 = new ArrayList<CardlData>();
    private ArrayList<CardlData> cardlDatas2 = new ArrayList<CardlData>();
    private ArrayList<CardlData> cardlDatas3 = new ArrayList<CardlData>();
    private ArrayList<CardlData> cardlDatas4= new ArrayList<CardlData>();
    private ArrayList<CardlData> cardlDatas5 = new ArrayList<CardlData>();
    private Adapter adapter;
    private AdapterL adapterL;
    private Button closebutton;
    private DialogforSelect dialogforSelect;
    private WebView webView;
    private String string;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        closebutton = (Button)findViewById(R.id.gridclose);
        showGrid = (LinearLayout) findViewById(R.id.showgrid);
        showList = (LinearLayout) findViewById(R.id.showlist);

        webView = (WebView)findViewById(R.id.webV);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);

        init_1();
        init_2();
        init_3();
        init_4();
        init_5();
        initL_1();
        initL_2();
        initL_3();
        initL_4();
        initL_5();

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        string = "http://www.hankookilbo.com/v/256be9cf564e44c0aef47047a8c3076d";
                        break;
                    case 2:
                        string = "http://sports.news.naver.com/mlb/news/read.nhn?oid=460&aid=0000000730";
                        break;
                    case 3:
                        string = "http://sports.news.naver.com/kbaseball/news/read.nhn?oid=108&aid=0002657786";
                        break;
                    case 4:
                        string = "http://sports.news.naver.com/photocenter/photo.nhn?albumId=55707&photoId=1215842&category=amatch";
                        break;
                    case 5:
                        string = "http://sports.news.naver.com/kfootball/news/read.nhn?oid=436&aid=0000027092";
                        break;
                    case 6:
                        string = "http://sports.news.naver.com/basketball/news/read.nhn?oid=109&aid=0003653495";
                        break;
                }

                webView.loadUrl(string);
            }
        });

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        string = "http://www.hankookilbo.com/v/256be9cf564e44c0aef47047a8c3076d";
                        break;
                    case 2:
                        string = "http://sports.news.naver.com/mlb/news/read.nhn?oid=460&aid=0000000730";
                        break;
                    case 3:
                        string = "http://sports.news.naver.com/kbaseball/news/read.nhn?oid=108&aid=0002657786";
                        break;
                    case 4:
                        string = "http://sports.news.naver.com/photocenter/photo.nhn?albumId=55707&photoId=1215842&category=amatch";
                        break;
                    case 5:
                        string = "http://sports.news.naver.com/kfootball/news/read.nhn?oid=436&aid=0000027092";
                        break;
                    case 6:
                        string = "http://sports.news.naver.com/basketball/news/read.nhn?oid=109&aid=0003653495";
                        break;
                }

                webView.loadUrl(string);
            }
        });

        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        string = "http://star.mk.co.kr/new/view.php?mc=ST&year=2017&no=725459";
                        break;
                    case 2:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=001&aid=0009655541";
                        break;
                    case 3:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=003&aid=0008263427";
                        break;
                    case 4:
                        string = "http://entertain.naver.com/ranking/read?oid=311&aid=0000790849";
                        break;
                    case 5:
                        string = "http://news.tf.co.kr/read/entertain/1705925.htm";
                        break;
                    case 6:
                        string = "http://news.khan.co.kr/kh_news/khan_art_view.html?artid=201711011605001&code=960100#csidxa769b352c8e48cf8bc22489626aea1a";
                        break;
                }
                webView.loadUrl(string);
            }
        });

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        string = "http://star.mk.co.kr/new/view.php?mc=ST&year=2017&no=725459";
                        break;
                    case 2:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=001&aid=0009655541";
                        break;
                    case 3:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=003&aid=0008263427";
                        break;
                    case 4:
                        string = "http://entertain.naver.com/ranking/read?oid=311&aid=0000790849";
                        break;
                    case 5:
                        string = "http://news.tf.co.kr/read/entertain/1705925.htm";
                        break;
                    case 6:
                        string = "http://news.khan.co.kr/kh_news/khan_art_view.html?artid=201711011605001&code=960100#csidxa769b352c8e48cf8bc22489626aea1a";
                        break;
                }
                webView.loadUrl(string);
            }
        });

        gridView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 1:
                        string = "http://www.hani.co.kr/arti/politics/politics_general/811184.html";
                        break;
                    case 2:
                        string = "http://www.hani.co.kr/arti/politics/polibar/804715.html";
                        break;
                    case 3:
                        string = "http://www.ohmynews.com/NWS_Web/View/at_pg.aspx?CNTN_CD=A0002335392";
                        break;
                    case 4:
                        string = "http://www.ohmynews.com/NWS_Web/View/at_pg.aspx?CNTN_CD=A0002341771";
                        break;
                    case 5:
                        string = "http://www.hani.co.kr/arti/politics/polibar/803752.html";
                        break;
                    case 6:
                        string = "http://www.edaily.co.kr/news/news_detail.asp?newsId=02643686612549536&mediaCodeNo=257";
                        break;
                    default:
                        break;
                }
                webView.loadUrl(string);
            }
        });

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 1:
                        string = "http://www.hani.co.kr/arti/politics/politics_general/811184.html";
                        break;
                    case 2:
                        string = "http://www.hani.co.kr/arti/politics/polibar/804715.html";
                        break;
                    case 3:
                        string = "http://www.ohmynews.com/NWS_Web/View/at_pg.aspx?CNTN_CD=A0002335392";
                        break;
                    case 4:
                        string = "http://www.ohmynews.com/NWS_Web/View/at_pg.aspx?CNTN_CD=A0002341771";
                        break;
                    case 5:
                        string = "http://www.hani.co.kr/arti/politics/polibar/803752.html";
                        break;
                    case 6:
                        string = "http://www.edaily.co.kr/news/news_detail.asp?newsId=02643686612549536&mediaCodeNo=257";
                        break;
                    default:
                        break;
                }
                webView.loadUrl(string);
            }
        });


        gridView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=001&aid=0009653901";
                        break;
                    case 2:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=079&aid=0003028868";
                        break;
                    case 3:
                        string = "http://news.naver.com/main/read.nhn?mode=LS2D&mid=shm&sid1=101&sid2=260&oid=016&aid=0001310277";
                        break;
                    case 4:
                        string = "http://news.naver.com/main/read.nhn?mode=LS2D&mid=shm&sid1=101&sid2=310&oid=016&aid=0001310285";
                        break;
                    case 5:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=079&aid=0003029116";
                        break;
                    case 6:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=001&aid=0009655162";
                        break;
                }
                webView.loadUrl(string);
            }
        });

        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=001&aid=0009653901";
                        break;
                    case 2:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=079&aid=0003028868";
                        break;
                    case 3:
                        string = "http://news.naver.com/main/read.nhn?mode=LS2D&mid=shm&sid1=101&sid2=260&oid=016&aid=0001310277";
                        break;
                    case 4:
                        string = "http://news.naver.com/main/read.nhn?mode=LS2D&mid=shm&sid1=101&sid2=310&oid=016&aid=0001310285";
                        break;
                    case 5:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=079&aid=0003029116";
                        break;
                    case 6:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=101&oid=001&aid=0009655162";
                        break;
                }
                webView.loadUrl(string);
            }
        });

        gridView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=025&aid=0002768300";
                        break;
                    case 2:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0003026321";
                        break;
                    case 3:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0003026324";
                        break;
                    case 4:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0003026780";
                        break;
                    case 5:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=001&aid=0009655541";
                        break;
                    case 6:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=003&aid=0008263427";
                        break;
                }
                webView.loadUrl(string);
            }
        });

        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=025&aid=0002768300";
                        break;
                    case 2:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0003026321";
                        break;
                    case 3:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0003026324";
                        break;
                    case 4:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0003026780";
                        break;
                    case 5:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=001&aid=0009655541";
                        break;
                    case 6:
                        string = "http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=003&aid=0008263427";
                        break;
                }
                webView.loadUrl(string);
            }
        });


//        getSupportActionBar().setBackgroundDrawable(new );
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button1 = (Button)findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.VISIBLE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.GONE);
                listView1.setVisibility(View.VISIBLE);
                listView2.setVisibility(View.GONE);
                listView3.setVisibility(View.GONE);
                listView4.setVisibility(View.GONE);
                listView5.setVisibility(View.GONE);
                closebutton.setVisibility(View.VISIBLE);
            }
        });
        Button button2 = (Button)findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.VISIBLE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.GONE);
                listView1.setVisibility(View.GONE);
                listView2.setVisibility(View.VISIBLE);
                listView3.setVisibility(View.GONE);
                listView4.setVisibility(View.GONE);
                listView5.setVisibility(View.GONE);
                closebutton.setVisibility(View.VISIBLE);
            }
        });
        Button button3 = (Button)findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.VISIBLE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.GONE);
                listView1.setVisibility(View.GONE);
                listView2.setVisibility(View.GONE);
                listView3.setVisibility(View.VISIBLE);
                listView4.setVisibility(View.GONE);
                listView5.setVisibility(View.GONE);
                closebutton.setVisibility(View.VISIBLE);
            }
        });
        Button button4 = (Button)findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.VISIBLE);
                gridView5.setVisibility(View.GONE);
                listView1.setVisibility(View.GONE);
                listView2.setVisibility(View.GONE);
                listView3.setVisibility(View.GONE);
                listView4.setVisibility(View.VISIBLE);
                listView5.setVisibility(View.GONE);
                closebutton.setVisibility(View.VISIBLE);
            }
        });
        Button button5 = (Button)findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.VISIBLE);
                listView1.setVisibility(View.GONE);
                listView2.setVisibility(View.GONE);
                listView3.setVisibility(View.GONE);
                listView4.setVisibility(View.GONE);
                listView5.setVisibility(View.VISIBLE);
                closebutton.setVisibility(View.VISIBLE);
            }
        });
        closebutton.setBackgroundResource(R.drawable.ic_action_remove);
        closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridView1.setVisibility(View.GONE);
                gridView2.setVisibility(View.GONE);
                gridView3.setVisibility(View.GONE);
                gridView4.setVisibility(View.GONE);
                gridView5.setVisibility(View.GONE);
                listView1.setVisibility(View.GONE);
                listView2.setVisibility(View.GONE);
                listView3.setVisibility(View.GONE);
                listView4.setVisibility(View.GONE);
                listView5.setVisibility(View.GONE);
                closebutton.setVisibility(View.GONE);
            }
        });


    }
    void init_1(){
        gridView1 = (GridView)findViewById(R.id.card1);
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray1.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray1, this);
        gridView1.setAdapter(adapter);
    }

    void init_2(){
        gridView2 = (GridView)findViewById(R.id.card2);
        cardArray2.add(new CardData(R.drawable.ic_action_search,"t"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"t"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"t"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray2.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray2, this);
        gridView2.setAdapter(adapter);
    }

    void init_3(){
        gridView3 = (GridView)findViewById(R.id.card3);
        cardArray3.add(new CardData(R.drawable.ik1,"MB 국정원의 '패악질'"));
        cardArray3.add(new CardData(R.drawable.idid1,"정치 '불쾌지수'시상식"));
        cardArray3.add(new CardData(R.drawable.idk1,"인사청문회, 이대로 괜찮을까"));
        cardArray3.add(new CardData(R.drawable.ikik1,"새로운 정치의 시작? 청년 정치 활성화"));
        cardArray3.add(new CardData(R.drawable.ii1,"문재인 대통령과 '열린경호'"));
        cardArray3.add(new CardData(R.drawable.iii1,"김정은 공포정치 희생자들"));
        adapter = new Adapter(cardArray3, this);
        gridView3.setAdapter(adapter);
    }

    void init_4(){
        gridView4 = (GridView)findViewById(R.id.card4);
        cardArray4.add(new CardData(R.drawable.ic_action_search,"4"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        cardArray4.add(new CardData(R.drawable.ic_action_search,"trtr"));
        adapter = new Adapter(cardArray4, this);
        gridView4.setAdapter(adapter);
    }

    void init_5(){
        gridView5 = (GridView)findViewById(R.id.card5);
        cardArray5.add(new CardData(R.drawable.p1,"자사고·외고, 내년부터 일반고보다 신입생 먼저 못 뽑는다"));
        cardArray5.add(new CardData(R.drawable.p2,"창원터널 앞 차량서 떨어진 기름통 폭발…영아 등 4명 사망(종합)"));
        cardArray5.add(new CardData(R.drawable.p3,"[종합]박근령 '1억 사기' 혐의 무죄…비서만 실형에 법정구속"));
        cardArray5.add(new CardData(R.drawable.p4,"노인 많은 지역이 진료비 높아…고흥·의령·부안 순"));
        cardArray5.add(new CardData(R.drawable.p5,"'애보는 아빠' 급증…남성육아휴직 올해 1만명 넘는다"));
        cardArray5.add(new CardData(R.drawable.p6,"“속도 느려 주식 손해” 인터넷 AS기사 살해범 ‘무기징역’"));
        adapter = new Adapter(cardArray5, this);
        gridView5.setAdapter(adapter);
    }

    void initL_1(){
        listView1 = (ListView)findViewById(R.id.cardL1);
        cardlDatas1.add(new CardlData("기사 제목","내용"));
        adapterL = new AdapterL(cardlDatas1, this);
        listView1.setAdapter(adapterL);
    }
    void initL_2(){
        listView2 = (ListView)findViewById(R.id.cardL2);
        cardlDatas2.add(new CardlData("기사 제목","내용"));
        adapterL = new AdapterL(cardlDatas2, this);
        listView2.setAdapter(adapterL);
    }

    void initL_3(){
        listView3 = (ListView)findViewById(R.id.cardL3);
        cardlDatas3.add(new CardlData("MB 국정원의 '패악질'","경악! 미친 것들” 14일 배우 문성근씨가 자신의 트위터에 올린 글입니다. 왜 이토록 화가 났느냐고요? 말하기도 곤혹스러운 배우 김여진씨와의 ‘합성 나체사진’을 이명박 정부 때인 2011년 국정원 심리전단이 만들어 인터넷에 유포시킨 사실이 국정원 개혁발전위원회의 적폐청산 티에프(TF) 조사 결과 드러났기 때문입니다.\n" +
                "\n"));
        cardlDatas3.add(new CardlData("정치 '불쾌지수'시상식","폭우로 전국 곳곳에서 피해가 속출하고, 폭염으로 연일 지친 하루가 계속되고 있습니다. 하지만 일부 정치인들은 막말과 부적절한 행동으로 ‘시원한 정치’는 커녕 ‘짜증 유발 정치’를 선보였습니다. 묵묵히 자신의 자리에서 의정활동에 임하는 정치인들까지 욕을 먹게 했네요. 그래서 뽑아봤습니다. ‘정치 불쾌지수상‘! 물론 잘했다는 게 아닙니다.\n" +
                "\n"));
        cardlDatas3.add(new CardlData("인사청문회, 이대로 괜찮을까","공직후보자 임명 강행, 인사 검증 문제없나"));
        cardlDatas3.add(new CardlData("새로운 정치의 시작? 청년 정치 활성화","\n" +
                "우리의 삶은 여전히 피폐하고 고단하다. 국가의 성장 중심적 경제정책은 화려한 성공을 가져왔지만, 사회적 부작용도 동시에 출몰시켰다. 대한민국은 고용 불안정, 소득 불평등, 저출산 및 고령화 등 각종 사회 문제들에 직면하고 있다. "));
        cardlDatas3.add(new CardlData("문재인 대통령과 '열린경호'","문재인 대통령은 취임 첫날 청와대 경호실장에게 “경호 좀 약하게 해달라”고 부탁했다고 합니다. 이후 문 대통령은 시민들과 어울려 ‘셀카’를 찍는 등 ‘탈권위’와 ‘소통’ 행보를 보이며 전직 대통령과 차별화된 모습을 보이고 있습니다. 과거 권력의 핵심부에서 어두운 그림자를 드리운 경호실도 점점 ‘열린 경호’에 발맞춰 변하고 있다고 합니다. 달라진 경호 풍경과 국민 속으로 가까이 다가가는 대통령의 모습을 소개합니다.\n" +
                "\n"));
        cardlDatas3.add(new CardlData("김정은 공포정치 희생자들","[이데일리 e뉴스팀] 북한의 리영길 인민국 총참모장이 이달 초 비리 혐의로 전격 처형된 것을 포함해 ‘김정은 시대’ 들어 처형된 북한 간부가 무려 100여 명에 달하는 것으로 나타났다."));
        adapterL = new AdapterL(cardlDatas3, this);
        listView3.setAdapter(adapterL);
    }

    void initL_4(){
        listView4 = (ListView)findViewById(R.id.cardL4);
        cardlDatas4.add(new CardlData("기사 제목","내용"));
        adapterL = new AdapterL(cardlDatas4, this);
        listView4.setAdapter(adapterL);
    }
    void initL_5(){
        listView5 = (ListView)findViewById(R.id.cardL5);
        cardlDatas5.add(new CardlData("자사고·외고, 내년부터 일반고보다 신입생 먼저 못 뽑는다","교육부, 초중등교육법 시행령 개정안 입법예고\n" +
                "자사고·외고·국제고, '전기'서 '후기' 모집 전환\n" +
                "불합격시 '비선호 일반고' 강제 배정 감수해야\n" +
                "전문가들 \"지역 명문 일반고 경쟁률 높아질 것\"\n"));
        cardlDatas5.add(new CardlData("창원터널 앞 차량서 떨어진 기름통 폭발…영아 등 4명 사망(종합)","재판부 \"직접 납품 관여 정황 없어…유무죄 떠나 사려깊지 못해\"\n" +
                "수행비서엔 징역 1년6개월…\"박근령 이용해 도울 것처럼 행세\"\n" +
                "\n" +
                "【서울=뉴시스】김지현 기자 = 사기 혐의로 재판에 넘겨진 박근혜(65) 전 대통령 동생 박근령(63) 전 육영재단 이사장에게 1심에서 무죄가 선고됐다."));
        cardlDatas5.add(new CardlData("[종합]박근령 '1억 사기' 혐의 무죄…비서만 실형에 법정구속","수원·화성 등은 진료비 낮아\n" +
                "\n" +
                "(세종=뉴스1) 이진성 기자 = 지난해 1인당 연평균 진료비가 가장 높은 지역은 상대적으로 만 65세 이상 노인 인구가 많은 전남 고흥군으로 나타났다. 진료비가 가장 낮은 지역은 노인 인구가 적은 경기 수원 영통구로 조사됐다. \n"));
        cardlDatas5.add(new CardlData("노인 많은 지역이 진료비 높아…고흥·의령·부안 순","전체 육아휴직의 12.4% 차지…선진국 비해선 미흡\n" +
                "\n" +
                "(세종=뉴스1) 박정환 기자 = 올해 전체 육아휴직자 중 남성 육아휴직자의 비율이 2001년 제도 도입 이후 가장 높은 것으로 나타났다. 하지만 여전히 주요 선진국에 비해서는 낮은 수준이라 남성 육아휴직을 더욱 독려해야 한다는 지적이 제기된다. \n"));
        cardlDatas5.add(new CardlData("'애보는 아빠' 급증…남성육아휴직 올해 1만명 넘는다","법원, 10년간 전자장치 부착 명령도 \"엄벌 처해 마땅\"\n" +
                "\n" +
                "(청주=뉴스1) 엄기찬 기자,장천식 기자 = 느린 인터넷속도 때문에 주식에 실패했다며 AS기사를 흉기로 무참히 살해한 50대에게 무기징역이 내려졌다.\n"));
        cardlDatas5.add(new CardlData("“속도 느려 주식 손해” 인터넷 AS기사 살해범 ‘무기징역’","(창원=연합뉴스) 김선경 기자 = 2일 오후 1시 20분께 경남 창원시 창원-김해 창원방향 창원터널 앞에서 드럼통에 유류를 싣고 달리던 5t 화물차가 콘크리트 중앙분리대를 들이받았다.\n" +
                "\n" +
                "사고 직후 유류통이 반대편 차로를 달리던 차 위로 떨어져 폭발 화재로 이어졌다. \n"));
        adapterL = new AdapterL(cardlDatas5, this);
        listView5.setAdapter(adapterL);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.choice:
                dialogforSelect = new DialogforSelect(Main.this, close_Dialog, show_All, show_Image, show_Text);
                dialogforSelect.show();
                return true;
//            case R.id.show_image:
//                Toast.makeText(this, "ff", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.show_txt:
//                Toast.makeText(this, "ff", Toast.LENGTH_SHORT).show();
//                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    private View.OnClickListener close_Dialog = new View.OnClickListener() {
        public void onClick(View v) {
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener show_All = new View.OnClickListener() {
        public void onClick(View v) {
            showGrid.setVisibility(View.VISIBLE);
            showList.setVisibility(View.GONE);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener show_Image = new View.OnClickListener() {
        public void onClick(View v) {
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener show_Text = new View.OnClickListener() {
        public void onClick(View v) {
            showList.setVisibility(View.VISIBLE);
            showGrid.setVisibility(View.GONE);
            dialogforSelect.dismiss();
        }
    };

}
