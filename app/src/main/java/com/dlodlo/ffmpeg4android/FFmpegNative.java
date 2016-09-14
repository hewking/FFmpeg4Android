package com.dlodlo.ffmpeg4android;

/**
 * Created by Administrator on 2016/9/12.
 * <p/>
 * 联系方式：。。。
 */
public class FFmpegNative {
    static{
        System.loadLibrary("avutil-54");
        System.loadLibrary("avcodec-56");
        System.loadLibrary("swresample-1");
        System.loadLibrary("avformat-56");
        System.loadLibrary("swscale-3");
        System.loadLibrary("avfilter-5");
        System.loadLibrary("ffmpeg_codec");
    }
    public native int avcodec_find_decoder(int codecID);
}
