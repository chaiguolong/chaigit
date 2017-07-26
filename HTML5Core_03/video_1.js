function $(id){
	return document.getElementByid(id);
}

function initial(){
	//1.获取video元素
	video = $("media");
	btnPlay = $("btnPlay");
	vdoDuration = $("vdoDuration");

	//2.加载事件
	//2.1 canplaythrough
	video.addEventListener("canplaythrough",video_canplaythrough,false);
	//2.2 ended:更换一个视频文件
	video.addEventListener("ended",video_ended,false);
	//2.3 pause :显示衣服图像(广告)
	video.addEventListener("pause",video_pause,false);
	//2.4 play: 将图像隐藏
	video.addEventListener("play",video_play,false);
	//2.5 通过按钮进行播放
	btnPlay.addEventListener("click",btnPlay_click,false);

	//3.初始化操作中的其它操作
	var totalDuration = video.duration;
	vdoDuration.innerHTML = parseInt(totalDuration) + "秒";
}

	/**
	 *播放或暂停
	 */
	 function btnPlay_click(e){
	 	//video.play();
	 	//判断状态
	 	if(video.paused || video.ended){
	 		//暂停中...
	 		//1.视频播放
	 		//2.文本更改为暂停

	 		video.play();
	 		e.target.value="暂停";
	 	}
	 }

window.addEventListener("load",initial,false);