package com.csist.class16cchun.mymediaplayer;

import android.content.Context;
import android.util.AttributeSet;

import com.pili.pldroid.player.widget.PLVideoView;

/**
 * 全屏播放器
 * Created by admin on 2017/11/30.
 */

public class FullVideoView extends PLVideoView {
    public FullVideoView(Context context) {
        super(context);
    }

    public FullVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FullVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FullVideoView(Context context, AttributeSet attributeSet, int i, int i1) {
        super(context, attributeSet, i, i1);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(width,height);
    }
}
