package com.nanasdrama.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

/** Native catalog shell. Use only APIs and media you are licensed to distribute. */
public final class MainActivity extends Activity {
    private static final int PLUM = Color.rgb(33, 23, 46);
    private static final int SURFACE = Color.rgb(48, 35, 63);
    private static final int YELLOW = Color.rgb(255, 201, 40);

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(screen());
    }

    private View screen() {
        ScrollView scroll = new ScrollView(this);
        scroll.setBackgroundColor(PLUM);
        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(dp(20), dp(28), dp(20), dp(28));
        scroll.addView(page);

        page.addView(text("NanasDrama", 32, YELLOW));
        TextView slogan = text("Drama pilihan, di tempat yang nyaman.", 16, Color.WHITE);
        slogan.setPadding(0, dp(4), 0, dp(24));
        page.addView(slogan);

        Button browse = new Button(this);
        browse.setText("JELAJAHI KATALOG");
        browse.setTextColor(PLUM);
        browse.setBackgroundColor(YELLOW);
        browse.setOnClickListener(v -> Toast.makeText(this,
                "Hubungkan ke API konten berlisensi Anda.", Toast.LENGTH_LONG).show());
        page.addView(browse, wide());

        TextView title = text("Untuk Anda", 21, Color.WHITE);
        title.setPadding(0, dp(28), 0, dp(12));
        page.addView(title);
        page.addView(card("Katalog resmi", "Tambahkan judul dari backend yang Anda miliki."));
        page.addView(card("Genre dan pencarian", "UI siap dikembangkan dengan repositori API resmi."));
        page.addView(card("Build otomatis", "Push tag v* untuk membuat APK release di GitHub."));
        return scroll;
    }

    private TextView card(String headline, String detail) {
        TextView card = text(headline + "\n" + detail, 16, Color.WHITE);
        card.setBackgroundColor(SURFACE);
        card.setPadding(dp(18), dp(16), dp(18), dp(16));
        LinearLayout.LayoutParams params = wide();
        params.bottomMargin = dp(12);
        card.setLayoutParams(params);
        return card;
    }

    private TextView text(String value, int size, int color) {
        TextView view = new TextView(this);
        view.setText(value); view.setTextSize(size); view.setTextColor(color);
        return view;
    }
    private LinearLayout.LayoutParams wide() { return new LinearLayout.LayoutParams(-1, -2); }
    private int dp(int px) { return (int) (px * getResources().getDisplayMetrics().density); }
}
