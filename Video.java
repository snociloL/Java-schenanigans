import java.util.Stack;
import java.util.Scanner;

public class Video {
     private String videoType;
     private double duration;
     private String producer;
     private String filetype;

     public Video(String a, double b, String c, String d){
        videoType = a;
        duration = b;
        producer = c;
        filetype = d;
     }
      public String getVideoType() {return videoType;}
      public double getDuration() {return duration;}
      public String getProducer() {return producer;}
      public String getFileType() {return filetype;}

      public String toString() {
         return "\nVideo Type: "+videoType+"\nDuration: "+duration+"\nProducer: "+producer+"\nFile type: "+filetype;
      }


   public static void main(String[] args) {
    Stack <Video> videostack = new Stack<>();
    Stack <Video> musicStack = new Stack<>();
    Stack <Video> educationStack = new Stack<>();
    Scanner scan = new Scanner(System.in);
     String videoType;
     double duration;
     String producer;
     String fileType;

     for(int i=0; i<5; i++){
      System.out.println("\nVideo Type: ");
       videoType=scan.nextLine();
       System.out.println("Duration(minutes): ");
       duration=Double.parseDouble(scan.nextLine());
       System.out.println("Producer: ");
       producer=scan.nextLine();
       System.out.println("File type: ");
       fileType=scan.nextLine();
       Video v = new Video(videoType, duration, producer, fileType);
       videostack.push(v);
     }

     while(!videostack.isEmpty()){
         Video v = videostack.pop();
         if(v.getVideoType().equalsIgnoreCase("Music"))
            musicStack.push(v);
         else if(v.getVideoType().equalsIgnoreCase("Educational"))
            educationStack.push(v);
     }

     System.out.println("\n\n-------------------------------------------------------------List of all music videos-------------------------------------------------------------");
     while(!musicStack.isEmpty()){
      Video v = musicStack.pop();
      if(v.getFileType().equalsIgnoreCase("MP4"))
         System.out.println(v.toString());
     }
   scan.close();
   }
}