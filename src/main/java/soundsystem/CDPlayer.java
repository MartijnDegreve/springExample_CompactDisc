package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer  {
    private CompactDisk cd;

    @Autowired
    public CDPlayer(CompactDisk cd){
        this.cd = cd;
    }

    @Autowired
    public void setCompactDisc(CompactDisk cd){
        this.cd = cd;
    }

    @Autowired
    public void insertDisc(CompactDisk cd){
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }

}
