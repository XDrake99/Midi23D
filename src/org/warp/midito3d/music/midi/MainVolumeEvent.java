package org.warp.midito3d.music.midi;

class MainVolumeEvent implements MidiMusicEvent {

	public final double volume;
	
	public MainVolumeEvent(double volume) {
		this.volume = volume;
	}

}
