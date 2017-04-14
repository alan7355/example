Handler handler = new Handler();
handler.postDelayed(new Runnable() {
    @Override
    public void run() {

        //過兩秒後要做的事情
        Log.d("tag", "我要打掃了");

    }
}, 2000);