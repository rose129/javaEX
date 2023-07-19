package com.javaex.javaoop;

public class TV {
	
		private int channel;
		private int volume;
		private boolean power;
		
		// 생성자 , 초기값 설정
		public TV() {
//			this.channel = 7;
//			this.volume = 20;
//			this.power = false;
//			
		}
		public TV(int channel, int volume,boolean power) {
			this.channel = channel;
			this.volume = volume;
			this.power = power;
		}
		// 메소드 ( getter )
		public int getChannel() {
			return channel;
		}

		public int getVolume() {
			return volume;
		}

		public boolean isPower() {
			return power;
		}
		
		public void power(boolean on) {
			power = on;
		}
		public void channel(int channel) {
			if(channel >= 1 && channel <= 255) {
				this.channel = channel;
			}
	
}
}
