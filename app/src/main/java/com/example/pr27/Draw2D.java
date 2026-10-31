package com.example.pr27;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.graphics.RectF;

public class Draw2D extends View {

    private Paint paint = new Paint();
    private Bitmap mBitmap;

    public Draw2D(Context context) {
        super(context);


        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.cat_bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        int w = canvas.getWidth();
        int h = canvas.getHeight();

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);




        paint.setColor(Color.rgb(135, 206, 235)); // голубой
        canvas.drawRect(0, 0, w, h * 0.60f, paint);


        paint.setColor(Color.YELLOW);
        canvas.drawCircle(w * 0.82f, h * 0.15f, h * 0.06f, paint);


        paint.setColor(Color.WHITE);
        canvas.drawCircle(w * 0.18f, h * 0.16f, h * 0.045f, paint);
        canvas.drawCircle(w * 0.24f, h * 0.13f, h * 0.055f, paint);
        canvas.drawCircle(w * 0.30f, h * 0.16f, h * 0.045f, paint);
        canvas.drawOval(w * 0.18f, h * 0.14f, w * 0.30f, h * 0.20f, paint);


        paint.setColor(Color.rgb(0, 119, 190)); // синий
        canvas.drawRect(0, h * 0.60f, w, h * 0.75f, paint);


        paint.setColor(Color.rgb(34, 139, 34)); // зеленый
        canvas.drawRect(0, h * 0.75f, w, h, paint);


        paint.setColor(Color.rgb(210, 180, 140)); // бежевый
        canvas.drawRect(w * 0.10f, h * 0.50f, w * 0.30f, h * 0.75f, paint);


        Path roof = new Path();
        roof.moveTo(w * 0.08f, h * 0.50f);
        roof.lineTo(w * 0.20f, h * 0.35f);
        roof.lineTo(w * 0.32f, h * 0.50f);
        roof.close();
        paint.setColor(Color.rgb(178, 34, 34)); // темно-красный
        canvas.drawPath(roof, paint);


        paint.setColor(Color.CYAN);
        canvas.drawRect(w * 0.15f, h * 0.55f, w * 0.19f, h * 0.62f, paint);


        paint.setColor(Color.rgb(101, 67, 33)); // коричневый
        canvas.drawRect(w * 0.22f, h * 0.62f, w * 0.26f, h * 0.75f, paint);


        paint.setColor(Color.rgb(101, 67, 33));
        canvas.drawRect(w * 0.70f, h * 0.55f, w * 0.73f, h * 0.75f, paint);


        paint.setColor(Color.rgb(0, 100, 0)); // темно-зеленый
        canvas.drawCircle(w * 0.715f, h * 0.50f, h * 0.08f, paint);
        canvas.drawCircle(w * 0.68f, h * 0.55f, h * 0.06f, paint);
        canvas.drawCircle(w * 0.75f, h * 0.55f, h * 0.06f, paint);





        if (mBitmap != null) {

            float catWidth = w * 0.35f;


            float catHeight = catWidth * ((float) mBitmap.getHeight() / mBitmap.getWidth());


            float left = w - catWidth - 10;
            float top = h - catHeight - 10;
            float right = w - 10;
            float bottom = h - 10;


            RectF destRect = new RectF(left, top, right, bottom);


            canvas.drawBitmap(mBitmap, null, destRect, paint);
        }

        paint.setColor(Color.BLUE);
        paint.setTextSize(45);
        canvas.drawText("Лужайка только для котов", w * 0.05f, h - 40, paint);



    }
}