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
    private ArrayList<CardlData> cardlDatas4 = new ArrayList<CardlData>();
    private ArrayList<CardlData> cardlDatas5 = new ArrayList<CardlData>();
    private Adapter adapter;
    private AdapterL adapterL;
    private Button closebutton;
    private Button closebutton1;
    private DialogforSelect dialogforSelect;
    private DialogLiscense dialogLiscense;
    private WebView webView;
    private String string;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        closebutton = (Button) findViewById(R.id.gridclose);
        closebutton1 = (Button)findViewById(R.id.gridclose1);
        showGrid = (LinearLayout) findViewById(R.id.showgrid);
        showList = (LinearLayout) findViewById(R.id.showlist);

        webView = (WebView) findViewById(R.id.webV);
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
                switch (i) {
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
                switch (i) {
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
                switch (i) {
                    case 1:
                        string = "http://star.mk.co.kr/new/view.php?mc=ST&year=2017&no=725459";
                        break;
                    case 2:
                        string = "http://www.yonhapnews.co.kr/bulletin/2017/11/02/0200000000AKR20171102046100005.HTML?input=1195m";
                        break;
                    case 3:
                        string = "http://stylem.mt.co.kr/stylemView.php?no=2017110214133869446";
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
                switch (i) {
                    case 1:
                        string = "http://star.mk.co.kr/new/view.php?mc=ST&year=2017&no=725459";
                        break;
                    case 2:
                        string = "http://www.yonhapnews.co.kr/bulletin/2017/11/02/0200000000AKR20171102046100005.HTML?input=1195m";
                        break;
                    case 3:
                        string = "http://stylem.mt.co.kr/stylemView.php?no=2017110214133869446";
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
                switch (i) {
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
                switch (i) {
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
                switch (i) {
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
                switch (i) {
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

        Button button1 = (Button) findViewById(R.id.btn1);
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
                closebutton1.setVisibility(View.VISIBLE);
            }
        });
        Button button2 = (Button) findViewById(R.id.btn2);
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
                closebutton1.setVisibility(View.VISIBLE);
            }
        });
        Button button3 = (Button) findViewById(R.id.btn3);
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
                closebutton1.setVisibility(View.VISIBLE);
            }
        });
        Button button4 = (Button) findViewById(R.id.btn4);
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
                closebutton1.setVisibility(View.VISIBLE);
            }
        });
        Button button5 = (Button) findViewById(R.id.btn5);
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
                closebutton1.setVisibility(View.VISIBLE);
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
                closebutton1.setVisibility(View.GONE);
            }
        });
        closebutton1.setBackgroundResource(R.drawable.ic_action_remove);
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
                closebutton1.setVisibility(View.GONE);
            }
        });


    }

    void init_1() {
        gridView1 = (GridView) findViewById(R.id.card1);
        cardArray1.add(new CardData(R.drawable.sports_card1, "'축구왕국' 깬 '얼음왕국'의 힘"));
        cardArray1.add(new CardData(R.drawable.sports_card21, "휴스턴 창단 첫 월드시리즈 우승"));
        cardArray1.add(new CardData(R.drawable.sports_card31, "'亞챔피언십 참가' LG 안익훈•김대현 \"영광이다..최선 다할 것\""));
        cardArray1.add(new CardData(R.drawable.sports_card41, "조영욱 `멀티골로 5:0 앞서나가는 한국`"));
        cardArray1.add(new CardData(R.drawable.sports_card51, "[인터뷰] 이동국은 2년 전에도 200호골을 갈망했었다"));
        cardArray1.add(new CardData(R.drawable.sports_card61, "‘한국계’ 아이라 리, 애리조나大 데뷔전서 9득점"));
        adapter = new Adapter(cardArray1, this);
        gridView1.setAdapter(adapter);
    }

    void init_2() {
        gridView2 = (GridView) findViewById(R.id.card2);
        cardArray2.add(new CardData(R.drawable.enter_1, "송중기S2송혜교 결혼식, 중국 ‘몰래 생중계‘ "));
        cardArray2.add(new CardData(R.drawable.enter_2, "\"구탱이형, 편안히 잠드세요\" 故 김주혁 영결식 "));
        cardArray2.add(new CardData(R.drawable.enter_3, "박서준, 스포티한 매력의 공항 패션…\"훈훈한 남친룩\" "));
        cardArray2.add(new CardData(R.drawable.enter_4, "이승기 \"군생활 녹록치 않았다, 올해 TV로 복귀하고파\" "));
        cardArray2.add(new CardData(R.drawable.enter_5, " '문희옥 고소' 여가수 U\"매니저 성추행 사실 입막음 협박\" "));
        cardArray2.add(new CardData(R.drawable.enter_6, "한은 \"가상통화, 공식 지급수단 아니고 거래위험도 크다\""));
        adapter = new Adapter(cardArray2, this);
        gridView2.setAdapter(adapter);
    }

    ;

    void init_3() {
        gridView3 = (GridView) findViewById(R.id.card3);
        cardArray3.add(new CardData(R.drawable.ik1, "MB 국정원의 '패악질'"));
        cardArray3.add(new CardData(R.drawable.idid1, "정치 '불쾌지수'시상식"));
        cardArray3.add(new CardData(R.drawable.idk1, "인사청문회, 이대로 괜찮을까"));
        cardArray3.add(new CardData(R.drawable.ikik1, "새로운 정치의 시작? 청년 정치 활성화"));
        cardArray3.add(new CardData(R.drawable.ii1, "문재인 대통령과 '열린경호'"));
        cardArray3.add(new CardData(R.drawable.iii1, "김정은 공포정치 희생자들"));
        adapter = new Adapter(cardArray3, this);
        gridView3.setAdapter(adapter);
    }

    void init_4() {
        gridView4 = (GridView) findViewById(R.id.card4);
        cardArray4.add(new CardData(R.drawable.finance, "WSJ \"트럼프, 파월에 연준의장 지명 통보\"…내일 공식발표(종합)"));
        cardArray4.add(new CardData(R.drawable.finance2, "김 위원장, 5대그룹 전문경영인 간담회 개최"));
        cardArray4.add(new CardData(R.drawable.finance3, "서울 아파트 전세가율 70% 붕괴 눈앞"));
        cardArray4.add(new CardData(R.drawable.finance4, "[음식혁명 無人시대] 피자 시켰다…배달원이 내 손안에 있다"));
        cardArray4.add(new CardData(R.drawable.finance5, "삼성전자, 권오현 회장 승진…윤부근-신종균 사장은 부회장"));
        cardArray4.add(new CardData(R.drawable.finance6, "한은 \"가상통화, 공식 지급수단 아니고 거래위험도 크다\""));
        adapter = new Adapter(cardArray4, this);
        gridView4.setAdapter(adapter);
    }

    ;

    void init_5() {
        gridView5 = (GridView) findViewById(R.id.card5);
        cardArray5.add(new CardData(R.drawable.p1, "자사고·외고, 내년부터 일반고보다 신입생 먼저 못 뽑는다"));
        cardArray5.add(new CardData(R.drawable.p2, "창원터널 앞 차량서 떨어진 기름통 폭발…영아 등 4명 사망(종합)"));
        cardArray5.add(new CardData(R.drawable.p3, "[종합]박근령 '1억 사기' 혐의 무죄…비서만 실형에 법정구속"));
        cardArray5.add(new CardData(R.drawable.p4, "노인 많은 지역이 진료비 높아…고흥·의령·부안 순"));
        cardArray5.add(new CardData(R.drawable.p5, "'애보는 아빠' 급증…남성육아휴직 올해 1만명 넘는다"));
        cardArray5.add(new CardData(R.drawable.p6, "“속도 느려 주식 손해” 인터넷 AS기사 살해범 ‘무기징역’"));
        adapter = new Adapter(cardArray5, this);
        gridView5.setAdapter(adapter);
    }

    void initL_1() {
        listView1 = (ListView) findViewById(R.id.cardL1);
        cardlDatas1.add(new CardlData("'축구왕국' 깬 '얼음왕국'의 힘", "‘얼음왕국’ 아이슬란드가 28일(한국시간) 프랑스 니스에서 열린 잉글랜드와 유로 2016 16강전에서 2-1로 승리하며 대회 최대 이변의 주인공으로 떠올랐습니다."));
        cardlDatas1.add(new CardlData("휴스턴 창단 첫 월드시리즈 우승","2017 월드시리즈의 주인공은 휴스턴이었다. 휴스턴은 조지 스프링어의 대활약으로 잡은 초반 리드를 마지막까지 잘 지켰다. 스프링어는 단일 월드시리즈 네 경기 연속 홈런, 여섯 경기 연속 장타라는 최초의 기록을 세웠다. 선발 랜스 매컬러스는 3회를 채 버티지 못했지만(2.1이닝 무실점) 다른 선발 요원들이 불펜에서 투혼을 발휘했다. 1962년에 창단한 휴스턴은 첫 월드시리즈 우승 숙원을 풀었다. "));
        cardlDatas1.add(new CardlData("'亞챔피언십 참가' LG 안익훈•김대현 \"영광이다..최선 다할 것\"","2017 아시아프로야구챔피언십(APBC) 대표팀에 뽑힌 LG 외야수 안익훈(21)과 투수 김대현(20)이 최선을 다하겠다고 각오를 다졌다.\n" +
                "둘은 대표팀 소집을 앞둔 2일 오전 잠실야구장 구단 사무실을 찾아 인사했다. 대표팀은 4일 소집 후 5일부터 훈련에 돌입한다. 14일에 격전지 일본으로 출국해 16일 일본과 개막전을 펼친다."));
        cardlDatas1.add(new CardlData("조영욱 `멀티골로 5:0 앞서나가는 한국`","[매경닷컴 MK스포츠(파주)=김영구 기자] 2일 경기도 파주스타디움에서 '2018 AFC U-19 챔피언십 F조 예선' 대한민국과 브루나이 경기가 열렸다."));
        cardlDatas1.add(new CardlData("[인터뷰] 이동국은 2년 전에도 200호골을 갈망했었다","[풋볼리스트=완주] 김정용 기자= 이동국은 전북현대의 K리그 5회 우승을 모두 함께 했고, 지난 네 번 모두 MVP를 수상했다. 우승 인터뷰도 이골이 날 만하다."));
        cardlDatas1.add(new CardlData("‘한국계’ 아이라 리, 애리조나大 데뷔전서 9득점","[OSEN=서정환 기자] 한국계 혼혈선수인 아이라 리(19·201cm)가 성공적인 대학무대 데뷔전을 치렀다.\n" +
                "아이라 리가 속한 애리조나대학은 2일(한국시간) 미국 애리조나주 투싼의 홈구장 맥케일 센터에서 벌어진 2017-18시즌 연습경기서 이스턴 뉴멕시코대학을 91-63으로 대파했다. 아이라 리는 16분을 출전하며 4개의 야투, 1개의 자유투를 모두 성공하며 9득점, 3리바운드, 1스틸, 1블록슛을 기록했다."));
        adapterL = new AdapterL(cardlDatas1, this);
        listView1.setAdapter(adapterL);
    }

    void initL_2() {
        listView2 = (ListView) findViewById(R.id.cardL2);
        cardlDatas2.add(new CardlData("송중기S2송혜교 결혼식, 중국 ‘몰래 생중계‘", "송중기, 송혜교 부부의 결혼식이 중국 온라인 플랫폼을 통해 몰래 생중계된 가운데, 이 플랫폼이 결혼식에도 참석했던 중국 배우 장쯔이 남편의 소유라는 보도가 나왔다. "));
        cardlDatas2.add(new CardlData("\\\"구탱이형, 편안히 잠드세요\\\" 故 김주혁 영결식", "(서울=연합뉴스) 윤고은 조재영 기자 = 지난달 30일 불의의 사고로 숨진 배우 김주혁의 영결식이 2일 오전 10시 송파구 서울아산병원에서 진행된다."));
        cardlDatas2.add(new CardlData("박서준, 스포티한 매력의 공항 패션…\\\"훈훈한 남친룩\\\"", "배우 박서준이 공항패션으로 올 블랙 룩을 선택했다.\n" +
                "박서준은 2일 오후 해외 팬미팅 참석 차 인천국제공항을 통해 싱가폴로 출국했다.\n" +
                "박서준은 블랙 집업 점퍼와 팬츠 차림에 검은색 다운 패딩을 착용해 멋과 보온성을 살린 패션을 연출했다."));
        cardlDatas2.add(new CardlData("이승기 \"군생활 녹록치 않았다, 올해 TV로 복귀하고파\" ", "[엑스포츠뉴스 전원 기자] 가수 겸 배우 이승기가 전역인사를 전했다.\n" +
                "이승기는 2일 자신의 공식 팬카페에 \"여러분 곁으로 다시 돌아온 이승기입니다\"라는 제목의 글을 게재했다.\n"));
        cardlDatas2.add(new CardlData("'문희옥 고소' 여가수 U\"매니저 성추행 사실 입막음 협박\"", "[더팩트｜강일홍 기자] \"무섭고 두려워서 (소속사 사장님한테 성추행 당한 사실을) 아무한테도 말 못하고 있다가 문희옥 선생님과 주현미 이모한테 모든 사실들은 있는 그대로 털어놨다. 며칠 뒤 엄마한테 '우리 사장이 차안에서 내게 모텔 가자, 내 여자가 돼달라'고 했다는 말을 꺼냈다. 처음엔 몸을 만지고 '못된 짓을 했다'는 말은 감췄다.\""));
        cardlDatas2.add(new CardlData("한은 \"가상통화, 공식 지급수단 아니고 거래위험도 크다\"", "미국 배우 케빈 스페이시가 출연하는 드라마 ‘하우스 오브 카드’의 제작이 중단됐다. 케빈 스페이시는 최근 ‘31년 전 성추행’ 논란이 일자 “동성애자로 살겠다”는 뜻을 밝힌 바 있다.\n"));
        adapterL = new AdapterL(cardlDatas2, this);
        listView2.setAdapter(adapterL);
    }

    void initL_3() {
        listView3 = (ListView) findViewById(R.id.cardL3);
        cardlDatas3.add(new CardlData("MB 국정원의 '패악질'", "경악! 미친 것들” 14일 배우 문성근씨가 자신의 트위터에 올린 글입니다. 왜 이토록 화가 났느냐고요? 말하기도 곤혹스러운 배우 김여진씨와의 ‘합성 나체사진’을 이명박 정부 때인 2011년 국정원 심리전단이 만들어 인터넷에 유포시킨 사실이 국정원 개혁발전위원회의 적폐청산 티에프(TF) 조사 결과 드러났기 때문입니다.\n" +
                "\n"));
        cardlDatas3.add(new CardlData("정치 '불쾌지수'시상식", "폭우로 전국 곳곳에서 피해가 속출하고, 폭염으로 연일 지친 하루가 계속되고 있습니다. 하지만 일부 정치인들은 막말과 부적절한 행동으로 ‘시원한 정치’는 커녕 ‘짜증 유발 정치’를 선보였습니다. 묵묵히 자신의 자리에서 의정활동에 임하는 정치인들까지 욕을 먹게 했네요. 그래서 뽑아봤습니다. ‘정치 불쾌지수상‘! 물론 잘했다는 게 아닙니다.\n" +
                "\n"));
        cardlDatas3.add(new CardlData("인사청문회, 이대로 괜찮을까", "공직후보자 임명 강행, 인사 검증 문제없나"));
        cardlDatas3.add(new CardlData("새로운 정치의 시작? 청년 정치 활성화", "\n" +
                "우리의 삶은 여전히 피폐하고 고단하다. 국가의 성장 중심적 경제정책은 화려한 성공을 가져왔지만, 사회적 부작용도 동시에 출몰시켰다. 대한민국은 고용 불안정, 소득 불평등, 저출산 및 고령화 등 각종 사회 문제들에 직면하고 있다. "));
        cardlDatas3.add(new CardlData("문재인 대통령과 '열린경호'", "문재인 대통령은 취임 첫날 청와대 경호실장에게 “경호 좀 약하게 해달라”고 부탁했다고 합니다. 이후 문 대통령은 시민들과 어울려 ‘셀카’를 찍는 등 ‘탈권위’와 ‘소통’ 행보를 보이며 전직 대통령과 차별화된 모습을 보이고 있습니다. 과거 권력의 핵심부에서 어두운 그림자를 드리운 경호실도 점점 ‘열린 경호’에 발맞춰 변하고 있다고 합니다. 달라진 경호 풍경과 국민 속으로 가까이 다가가는 대통령의 모습을 소개합니다.\n" +
                "\n"));
        cardlDatas3.add(new CardlData("김정은 공포정치 희생자들", "[이데일리 e뉴스팀] 북한의 리영길 인민국 총참모장이 이달 초 비리 혐의로 전격 처형된 것을 포함해 ‘김정은 시대’ 들어 처형된 북한 간부가 무려 100여 명에 달하는 것으로 나타났다."));
        adapterL = new AdapterL(cardlDatas3, this);
        listView3.setAdapter(adapterL);
    }

    void initL_4() {
        listView4 = (ListView) findViewById(R.id.cardL4);
        cardlDatas4.add(new CardlData("WSJ \"트럼프, 파월에 연준의장 지명 통보\"…내일 공식발표(종합)", "\n" +
                "(뉴욕=연합뉴스) 이준서 특파원 = 도널드 트럼프 미국 대통령이 미국 중앙은행인 연방준비제도((Fed·연준)의 차기 의장으로 제롬 파월(64) 현 연준 이사를 지명키로 하고 파월 이사에게 통보했다고 일간 월스트리트저널(WSJ)이 1일(현지시간) 보도했다."));
        cardlDatas4.add(new CardlData("김 위원장, 5대그룹 전문경영인 간담회 개최", "김상조 공정거래위원장은 2일 \"국민에게 약속한 공약과 이를 실천하기 위한 국정과제의 목표에 비춰 볼 때 5대 그룹의 자발적인 개혁의지에 여전히 의구심이 남아있다\"며 분발하여 줄 것을 당부했다."));
        cardlDatas4.add(new CardlData("서울 아파트 전세가율 70% 붕괴 눈앞", "서울의 아파트 매매가격 대비 전세가격(전세가율)이 70%선 붕괴를 코앞에 두면서 갭투자에 빨간불이 켜졌다. 2일 KB부동산의 지난달 주택가격동향에 따르면 서울의 전세가율은 70.9%를 기록했다."));
        cardlDatas4.add(new CardlData("[음식혁명 無人시대] 피자 시켰다…배달원이 내 손안에 있다", "“여보세요. 여기 OO동 OO번지인데, 피자 한 판 갖다주세요”, “피자 아직도 안왔는데 출발했나요?”.\n" +
                "불과 몇년 전까지만 해도 흔했던 피자 주문 풍경이다. 일일이 메뉴와 옵션을 말하고 피자가 안오면 독촉전화까지…. 이 모습이 점차 사라지고 있다. "));
        cardlDatas4.add(new CardlData("삼성전자, 권오현 회장 승진…윤부근-신종균 사장은 부회장", "삼성전자가 2일 회장 승진 1명과 부회장 승진 2명, 사장 승진 7명, 위촉업무 변경 4명 등 총 14명 규모의 2018년 정기 사장단 인사를 발표했다.\n" +
                "먼저 권오현 대표이사 부회장이 회장으로 승진하면서 종합기술원 회장으로 경영일선에서는 물러났다."));
        cardlDatas4.add(new CardlData("한은 \"가상통화, 공식 지급수단 아니고 거래위험도 크다\"", "(서울=연합뉴스) 최윤정 기자 = 한국은행은 2일 가상통화가 현행법상 공식 지급수단이 아니고 거래에 따르는 리스크도 크다며 시장참가자들의 합리적 판단이 필요하다고 촉구했다."));
        adapterL = new AdapterL(cardlDatas4, this);
        listView4.setAdapter(adapterL);
    }

    void initL_5() {
        listView5 = (ListView) findViewById(R.id.cardL5);
        cardlDatas5.add(new CardlData("자사고·외고, 내년부터 일반고보다 신입생 먼저 못 뽑는다", "교육부, 초중등교육법 시행령 개정안 입법예고\n" +
                "자사고·외고·국제고, '전기'서 '후기' 모집 전환\n" +
                "불합격시 '비선호 일반고' 강제 배정 감수해야\n" +
                "전문가들 \"지역 명문 일반고 경쟁률 높아질 것\"\n"));
        cardlDatas5.add(new CardlData("창원터널 앞 차량서 떨어진 기름통 폭발…영아 등 4명 사망(종합)", "재판부 \"직접 납품 관여 정황 없어…유무죄 떠나 사려깊지 못해\"\n" +
                "수행비서엔 징역 1년6개월…\"박근령 이용해 도울 것처럼 행세\"\n" +
                "\n" +
                "【서울=뉴시스】김지현 기자 = 사기 혐의로 재판에 넘겨진 박근혜(65) 전 대통령 동생 박근령(63) 전 육영재단 이사장에게 1심에서 무죄가 선고됐다."));
        cardlDatas5.add(new CardlData("[종합]박근령 '1억 사기' 혐의 무죄…비서만 실형에 법정구속", "수원·화성 등은 진료비 낮아\n" +
                "\n" +
                "(세종=뉴스1) 이진성 기자 = 지난해 1인당 연평균 진료비가 가장 높은 지역은 상대적으로 만 65세 이상 노인 인구가 많은 전남 고흥군으로 나타났다. 진료비가 가장 낮은 지역은 노인 인구가 적은 경기 수원 영통구로 조사됐다. \n"));
        cardlDatas5.add(new CardlData("노인 많은 지역이 진료비 높아…고흥·의령·부안 순", "전체 육아휴직의 12.4% 차지…선진국 비해선 미흡\n" +
                "\n" +
                "(세종=뉴스1) 박정환 기자 = 올해 전체 육아휴직자 중 남성 육아휴직자의 비율이 2001년 제도 도입 이후 가장 높은 것으로 나타났다. 하지만 여전히 주요 선진국에 비해서는 낮은 수준이라 남성 육아휴직을 더욱 독려해야 한다는 지적이 제기된다. \n"));
        cardlDatas5.add(new CardlData("'애보는 아빠' 급증…남성육아휴직 올해 1만명 넘는다", "법원, 10년간 전자장치 부착 명령도 \"엄벌 처해 마땅\"\n" +
                "\n" +
                "(청주=뉴스1) 엄기찬 기자,장천식 기자 = 느린 인터넷속도 때문에 주식에 실패했다며 AS기사를 흉기로 무참히 살해한 50대에게 무기징역이 내려졌다.\n"));
        cardlDatas5.add(new CardlData("“속도 느려 주식 손해” 인터넷 AS기사 살해범 ‘무기징역’", "(창원=연합뉴스) 김선경 기자 = 2일 오후 1시 20분께 경남 창원시 창원-김해 창원방향 창원터널 앞에서 드럼통에 유류를 싣고 달리던 5t 화물차가 콘크리트 중앙분리대를 들이받았다.\n" +
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
            dialogLiscense = new DialogLiscense(Main.this,diaclose);
            dialogforSelect.dismiss();
            dialogLiscense.show();
        }
    };
    private View.OnClickListener show_Text = new View.OnClickListener() {
        public void onClick(View v) {
            showList.setVisibility(View.VISIBLE);
            showGrid.setVisibility(View.GONE);
            dialogforSelect.dismiss();
        }
    };
    private View.OnClickListener diaclose = new View.OnClickListener() {
        public void onClick(View v) {
            dialogLiscense.dismiss();
        }
    };

}
