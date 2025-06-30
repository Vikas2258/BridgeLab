class Abst12{
	//Create an abstract class MediaPlayer with method play() and stop(). 
	//Implement AudioPlayer and  VideoPlayer.

	public static void main(String[] args){
		AudioPlayer a = new AudioPlayer();
		VideoPlayer v = new VideoPlayer();
		a.play();
		a.stop();
		v.play();
		v.stop();
		
	}
}
interface MediaPlayer{
	abstract void play();
	abstract void stop();
}
class AudioPlayer implements MediaPlayer{
	public void play(){
		System.out.println("this is play of Audioplayer");
	}
	public void stop(){
		System.out.println("this is stop of audioplayer");
	}
	
}
class VideoPlayer implements MediaPlayer{
	public void play(){
		System.out.println("this is play of videopalyer");
	}
	public void stop(){
		System.out.println("This is stop of videoplayer");
	}
}

