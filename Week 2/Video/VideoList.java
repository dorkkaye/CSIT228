/*
    5.  Write a class named VideoList which contains a list of Video implemented using array. 
        It should have additional attributes named count and max. The count represents the number of Video objects inside the array while the max is 
        initialized by the user through the constructor which represents the maximum capacity of the list.  Provide a constructor that sets the max value
        by calling the MAX_CONTENT attribute of the VisualMaterial class. Implement the following methods:
        - public boolean addVideo(Video video); // returns true if successfully added in the list else false
        - public int search(Video video); // returns -1 if not found and returns the index value if found
        - public boolean removeVideo(Video video); // removes the video on the list and returns if it is successful or not
        // replace the video being removed by replacing it with the last element of the list
        - public void displayList(); // displays the video contents using foreach 
*/
public class VideoList extends Video
{
    //additional attributes
    private int count;  //represents the number of Video objects inside the array
    private int max;    //initialized by the user through the constructor which represents the maximum capacity of the list

    Video[] videoList;

    VideoList()
    {
        this.max = MAX_CONTENT;
        this.videoList =  new Video[max];
        this.count = 0;
    }

    public void setCount(int count) 
    {
        this.count = count;
    }

    public void setMax(int max) 
    {
        this.max = max;
    }

    public void setVideoList(Video[] videoList) 
    {
        this.videoList = videoList;
    }

    public int getCount() 
    {
        return this.count;
    }

    public int getMax() 
    {
        return this.max;
    }
    
    public Video[] getVideoList() 
    {
        return this.videoList;
    }

    //methods
    // returns true if successfully added in the list else false
    public boolean addVideo(Video video)
    {
        if(this.count < this.max) 
        {
            videoList[this.count] = video;
            this.count++;
            return true;
        }

        return false;
    }

    // returns -1 if not found and returns the index value if found
    public int search(Video video) 
    {
        for (int i = 0; i < this.count ; i++) 
        {
            if(videoList[i].equals(video))
                return i;
        }

        return -1;
    }

    public boolean removeVideo(Video video)
    {
        int index = search(video);

        if (index != -1 && this.count != 0) 
        {
            videoList[index] = videoList[this.count - 1];
            this.count--;
            return true;
        }

        return false;
    }

    /*
        replace the video being removed by replacing it with the last element of the list
        // displays the video contents using foreach 
    */
    public void displayList()
    {
        int x = 1;

        if (count == 0) 
            System.out.println("\nVideo list is empty");
        else 
        {
            System.out.println("Video List");
            for (Video v: videoList) 
            {
                if (v != null) 
                {
                    System.out.println("Video [" + Integer.valueOf(++x).toString() + "]:");
                    v.display();
                }
            }
        }
    }

    //Methods of VisualMaterial
    public void copyrightNotice(){}  

    public int length()
    {
        return 0;
    }
}