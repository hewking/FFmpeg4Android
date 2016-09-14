//
// Created by Administrator on 2016/9/12.
//

#include <math.h>
#include <libavutil/opt.h>
#include <libavcodec/avcodec.h>
#include <libavutil/channel_layout.h>
#include <libavutil/common.h>
#include <libavutil/imgutils.h>
#include <libavutil/mathematics.h>
#include <libavutil/samplefmt.h>
#include <com_dlodlo_ffmpeg4android_FFmpegNative.h>

JNIEXPORT jint JNICALL Java_com_dlodlo_ffmpeg4android_FFmpegNative_avcodec_1find_1decoder
  (JNIEnv * env, jobject obj, jint codecID){
                                           	AVCodec *codec = NULL;

                                           	/* register all formats and codecs */
                                           	av_register_all();

                                           	codec = avcodec_find_decoder(codecID);

                                           	if (codec != NULL)
                                           	{
                                           		return 0;
                                           	}
                                           	else
                                           	{
                                           		return -1;
                                           	}
                                           }