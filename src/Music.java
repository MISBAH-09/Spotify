package l2;

public class Music {
    private String tittle;
    private String Album;
    private String gener;
    private double duration;
    private  Date relasedate;
    private Artist Artistame;

    public Music(String tittle, String album, String gener,double duration,Date relasedate,Artist artistame) {
        this.tittle = tittle;
        Album = album;
        this.gener = gener;
        this.duration = duration;
        this.relasedate = relasedate;
        Artistame = artistame;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Date getRelasedate() {
        return relasedate;
    }

    public void setRelasedate(Date relasedate) {
        this.relasedate = relasedate;
    }

    public Artist getArtistame() {
        return Artistame;
    }

    public void setArtistame(Artist artistame) {
        Artistame = artistame;
    }

    @Override
    public String toString() {
        String Music=String.format("%-15s %-15s %-10s %10f %10s %10s",tittle,Album,gener,duration,relasedate,Artistame);
        return Music;
    }
    public boolean equals(Object O){
        Music K=(Music) O;
        if(K.getArtistame().getName().equals(this.getArtistame().getName()) && K.getTittle().equals(this.tittle)){
            return true;
        }
        else;
        return false;

    }
}
