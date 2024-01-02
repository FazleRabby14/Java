
package plant;

public class Herb extends Plant {
    private boolean isMedicinal;
    private String season;

    public Herb(String name, String color, boolean isMedicinal, String season) {
        super(name, color);
        this.isMedicinal = isMedicinal;
        this.season = season;
    }

    public boolean isIsMedicinal() {
        return isMedicinal;
    }

    public void setIsMedicinal(boolean isMedicinal) {
        this.isMedicinal = isMedicinal;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Herb{" +"name="+super.getName()+"color="+super.getColor()+ "isMedicinal=" + isMedicinal + ", season=" + season + '}';
    }
    

    
}
