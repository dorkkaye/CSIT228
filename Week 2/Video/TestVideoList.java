/*
    1. Ask for user inputs for information on Artist and Video
    2. Invoke methods of VideoList (You may have a menu here to Add a Book, Delete a Book, Find a Book, Display Book List).
*/
import java.util.*;

public class TestVideoList 
{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        VideoList vlistist = new VideoList();
        int x = 0;

        do 
        {
            menu();
            x = switchCase(sc.nextInt(), vlistist);
        } 
        while (x != 5); 
    }

    public static void menu()
   {
        System.out.println("VideoList Menu");
        System.out.println("[1] Add a Video");
        System.out.println("[2] Delete a Video");
        System.out.println("[3] Find a Video");
        System.out.println("[4] Display Video List");
        System.out.println("[5] Exit");
        
        System.out.print("\nInput choice: ");
    }

    private static int switchCase(int choice, VideoList vlist) 
    {
        CommedyVideo v;

        switch (choice) 
        {
            //Add Video
            case 1:
                 v = addCommedyVideo();
                System.out.println(vlist.addVideo(v) ? v.getTitle() + " succesfully added" : v.getTitle() + " failed to add");
                break;

            //Delete Video
            case 2:
                v = addCommedyVideo();
                System.out.println(vlist.removeVideo(v) ? v.getTitle() + " succesfully removed" : v.getTitle() + " failed to remove");
                break;

            //Find video
            case 3:
                v = addCommedyVideo();
                System.out.println(vlist.search(v) == -1 ? v.getTitle() + " could not be found" : v.getTitle() + " is found at " + vlist.search(v));
                break;

            //Display video
            case 4:
                vlist.displayList();
                break;

            //Exit
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        return choice;
    }
    
    private static CommedyVideo addCommedyVideo() 
    {
        CommedyVideo newVideo;
        String firstName;
        String lastName;
        String middleName;
        String code;
        String title;
        String setting = "CIT University";
        int length;
        int choice;
        
        sc.nextLine();
        System.out.println("Video Details");

        System.out.print("Code: "); code = sc.nextLine();
        System.out.print("Title: "); title = sc.nextLine();

        System.out.print("First name: "); firstName = sc.nextLine();
        System.out.print("Last name: "); lastName = sc.nextLine();
        System.out.print("Middle name: "); middleName = sc.nextLine();

        System.out.print("Length: "); length = sc.nextInt();

        System.out.println("Set default setting to CIT University? [1] - Yes , [0] no");
        System.out.print("Enter choice: "); choice = sc.nextInt();
        if (choice == 0) 
                System.out.print("New setting: "); setting = sc.nextLine(); 
        
        newVideo = new CommedyVideo(code,title,new Artist(firstName, lastName, middleName), length, setting);

        return newVideo;
     }
}