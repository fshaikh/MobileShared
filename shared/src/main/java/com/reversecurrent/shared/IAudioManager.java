package com.reversecurrent.shared;

public interface IAudioManager {
    public boolean SetMaxVolume(StreamType streamType);
    public boolean SetToRingerMode(RingerType ringerType);
}
