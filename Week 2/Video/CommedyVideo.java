/*
    4. Write a class named CommedyVideo which is a Video. It has an additional attribute setting and isInYouTube. 
       Setting refers to a specific place it was shot while the isInYouTube represents its availability YouTube. Provide two(2) constructors: the first 
       one sets the setting to "CIT University";  and the second constructor sets the setting to "Cebu City" and isInYouTube to true. It overrides the 
       equals method of the Object class.  Two CommedyVideo are equal if the code and setting are the same.
*/

public class CommedyVideo extends Video
{
    //attributes
    private String setting; //refers to a specific place it was shot
    private boolean isInYouTube;    //represents its availability YouTube

    //Sets setting to CIT University
    CommedyVideo()
    {
        super();
        this.setting = "CIT University";
    }

    public CommedyVideo(String code, String title, Artist artist, int length, String setting) 
    {
        super(code, title, artist, length);
        this.setting = setting;
        this.isInYouTube = true;
    }

    //sets the setting to "Cebu City" and isInYouTube to true
    public CommedyVideo(String code, String title, Artist artist, int length) 
    {
        super(code, title, artist, length);
        this.setting = "Cebu City";
        this.isInYouTube = true;
    }

    public CommedyVideo(String code, String title, Artist artist, int length, String setting,Boolean isInYouTube) 
    {
        super(code, title, artist, length);
        this.setting = setting;
        this.isInYouTube = isInYouTube;
    }

    //sets the setting to "CIT University"
    CommedyVideo(String setting)
    {
        this.setting = "CIT University";
    }

    //sets the setting to "Cebu City" and isInYouTube to true
    CommedyVideo(String setting, boolean isInYouTube)
    {
        this.setting = "Cebu City";
        this.isInYouTube = true;
    }

    public void setSetting(String setting)
    {
        this.setting = setting;
    }

    public void setIsInYoutube(boolean isInYouTube) 
    {
        this.isInYouTube = isInYouTube;
    }

    public String getSetting()
    {
        return setting;
    }

    public boolean getIsInYouTube()
    {
        return isInYouTube;
    }

    //Must implement the inherited abstract class
    //Methods of VisualMaterial
    public void copyrightNotice(){}   

    public int length()
    {
        return 100;
    }

    //Two CommedyVideo are equal if the code and setting are the same
    public boolean equals(Object o) 
    {
        if (o == this)
            return true;
        if (!(o instanceof CommedyVideo)) {
            return false;
        }
        CommedyVideo commedyVideo = (CommedyVideo) o;
        return this.getIsInYouTube() == commedyVideo.getIsInYouTube() && this.getSetting() == commedyVideo.getSetting();
    } 
}
