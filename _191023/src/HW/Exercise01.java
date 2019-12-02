package HW;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int prechannel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int getChannel() {return channel;}
	int getVolume(){return volume;}
	void setChannel(int channel) {prechannel = this.channel; this.channel = channel;}
	void setVolume(int volume) {this.volume = volume;}
	void PowerOn() {isPowerOn = true;}
	void gotoPrevChannel() {setChannel(prechannel);}
}

class Exercise01 {
	public static void main(String args[]) {
		MyTv t = new MyTv();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}
